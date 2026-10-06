package jugador;
import java.util.Random;
public class CombateControlador {
    private CombateModelo modelo;
    private CombateVista vista;
    private Random random;
    public CombateControlador(CombateModelo modelo, CombateVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.random = new Random();
    }
    public void iniciarCombate() {
        Jugador jugador = modelo.getJugador();
        Enemigo enemigo = modelo.getEnemigo();
        vista.mostrarMensaje("¡Inicia el combate entre " + 
        jugador.getNombre() + " y " + enemigo.getNombre() + "!");
        while (modelo.ambosEstanVivos()) {
            vista.mostrarEstado(jugador, enemigo);
            int danoJugador = jugador.atacar();
            enemigo.recibirDano(danoJugador);
            vista.mostrarMensaje(jugador.getNombre() + " ataca e inflige " 
            + danoJugador + " de daño.");
            if (enemigo.getSalud() > 0) {
                if (random.nextBoolean()) {
                    int danoEnemigo = enemigo.atacar();
                    jugador.recibirDano(danoEnemigo);
                    vista.mostrarMensaje(enemigo.getNombre() + " responde e inflige " 
                    + danoEnemigo + " de daño.");
                } else {
                    vista.mostrarMensaje(enemigo.getNombre() + " falló su ataque.");
                }
            }
        }
        if (jugador.getSalud() > 0) {
            vista.mostrarMensaje("\n🏆 ¡VICTORIA! " + jugador.getNombre() + " ha ganado.");
        } else {
            vista.mostrarMensaje("\n💀 ¡DERROTA! " + jugador.getNombre() + " ha sido vencido.");
        }
    }
}