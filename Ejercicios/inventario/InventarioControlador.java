package inventario;

public class InventarioControlador {
    private InventarioModelo modelo;
    private InventarioVista vista;

    public InventarioControlador(InventarioModelo modelo, InventarioVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarItem(Item item) {
        modelo.agregarItem(item);
        vista.mostrarMensaje("Item añadido: " + item.getNombre());
    }

    public void eliminarItem(Item item) {
        modelo.eliminarItem(item);
        vista.mostrarMensaje("Item eliminado: " + item.getNombre());
    }

    public void verInventario() {
        vista.mostrarInventario(modelo.obtenerItems());
    }

    public void mostrarDetalles(String nombre) {
        Item item = modelo.buscarItem(nombre);
        vista.mostrarDetallesItem(item);
    }

    public Item buscarItem(String nombre) {
        return modelo.buscarItem(nombre);
    }
}	