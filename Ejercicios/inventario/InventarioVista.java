package inventario;

import java.util.List;

public class InventarioVista {

    public void mostrarInventario(List<Item> items) {
        System.out.println("\n--- INVENTARIO ---");
        if (items.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        for (Item item : items) {
            System.out.println("• " + item.getNombre() + " (x" + item.getCantidad() + ") - Tipo: " + item.getTipo());
        }
    }
    public void mostrarDetallesItem(Item item) {
        if (item != null) {
            System.out.println("\n--- DETALLES DEL ITEM ---");
            System.out.println("Nombre:      " + item.getNombre());
            System.out.println("Cantidad:    " + item.getCantidad());
            System.out.println("Tipo:        " + item.getTipo());
            System.out.println("Descripción: " + item.getDescripcion());
        } else {
            System.out.println("El item no fue encontrado en el inventario.");
        }
    }
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}