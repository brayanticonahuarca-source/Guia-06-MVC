package jugador;

public class CombateModelo {
    private Jugador jugador;
    private Enemigo enemigo;

    public CombateModelo(Jugador jugador, Enemigo enemigo) {
        this.jugador = jugador;
        this.enemigo = enemigo;
    }

    public boolean ambosEstanVivos() {
        return jugador.getSalud() > 0 && enemigo.getSalud() > 0;
    }

    public Jugador getJugador() { return jugador; }
    public Enemigo getEnemigo() { return enemigo; }
}