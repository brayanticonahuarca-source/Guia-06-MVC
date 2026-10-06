package jugador;
import inventario.*;
public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Guerrero", 100, 1);
        Enemigo enemigo = new Enemigo("Orco", 50, 1, "Bestia");
        Item espada = new Item("Espada de Hierro", 1, "Arma", "Corta enemigos");
        jugador.getInventario().agregarItem(espada);
        CombateModelo modelo = new CombateModelo(jugador, enemigo);
        CombateVista vista = new CombateVista();
        CombateControlador controlador = new CombateControlador(modelo, vista);
        controlador.iniciarCombate();
    }			
}