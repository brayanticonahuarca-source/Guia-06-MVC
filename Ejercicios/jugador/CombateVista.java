package jugador;

public class CombateVista {

    public void mostrarEstado(Jugador jugador, Enemigo enemigo) {
    	System.out.println();
    	System.out.println("--- ESTADO DE COMBATE ---");

        System.out.println("Jugador: " + jugador.getNombre() + 
        		" (Nivel " + jugador.getNivel() + ") | Salud: " 
        		+ jugador.getSalud() + " HP");
        System.out.println("Enemigo: " + enemigo.getNombre() + 
        		" [" + enemigo.getTipo() + "] (Nivel " + enemigo.getNivel() + 
        		") | Salud: " + enemigo.getSalud() + " HP");
        System.out.println("-------------------------");
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}