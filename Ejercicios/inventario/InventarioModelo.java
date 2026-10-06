package inventario;
import java.util.ArrayList;
import java.util.List;
public class InventarioModelo {
    private List<Item> items;
    public InventarioModelo() {
        this.items = new ArrayList<>();
    }
    public void agregarItem(Item item) {
        items.add(item);
    }
    public boolean eliminarItem(Item item) {
        return items.remove(item);
    }
    public boolean eliminarItem(String nombre) {
        Item item = buscarItem(nombre);
        if (item != null) {
            return items.remove(item);
        }
        return false;
    }
    public List<Item> obtenerItems() {
        return items;
    }
    public Item buscarItem(String nombre) {
        for (Item i : items) {
            if (i.getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return null;
    }
}