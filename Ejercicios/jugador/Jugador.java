package jugador;
import inventario.*;
public class Jugador {
    private String nombre;
    private int salud;
    private int nivel;
    private InventarioModelo inventario;
    public Jugador(String nombre, int salud, int nivel) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
        this.inventario = new InventarioModelo();
    }
    public int atacar() {
        int dano = 10 * nivel;
        for (Item item : inventario.obtenerItems()) {
            if (item.getTipo().equalsIgnoreCase("Arma")) {
                dano += 15;
                break;
            }
        }
        return dano;
    }
    public void usarObjeto(Item item) {
        if (item != null) {
            item.usarItem();
        }
    }
    public void recibirDano(int cantidad) {
        this.salud = Math.max(0, this.salud - cantidad);
    }
    public String getNombre() { return nombre; }
    public int getSalud() { return salud; }
    public int getNivel() { return nivel; }
    public InventarioModelo getInventario() { return inventario; }
}