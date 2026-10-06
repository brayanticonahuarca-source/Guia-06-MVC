package ejercicios;
import java.util.List;
import java.util.Scanner;
public class CarritoVista {
	private Scanner scanner;
	
	public CarritoVista()
	{
		 scanner = new Scanner(System.in);
	}
	public void mostrarProductos(List<Producto> productos)
	{
        System.out.println("\n--- Productos ---");
		if (productos == null || productos.isEmpty()) {
            System.out.println("No hay productos disponibles en el catálogo.");
            return;
        }
		for(Producto p : productos)
		{
			System.out.println("[" + p.getIdProducto() + "] " + p.getNombre() + " - S/ " + p.getPrecio());
		}
		
	}
	public void mostrarCarrito(List<Producto> carrito, double subtotal, double descuento, double costoEnvio, double total)
	{
        System.out.println("\n--- HISTORIAL DE CARRITO ---");

		if (carrito == null || carrito.isEmpty()) {
            System.out.println("El carrito de compras está vacío.");
            return;
        }
        for (Producto p : carrito) {
            System.out.println("- [" + p.getIdProducto() + "] " + p.getNombre() + " - S/ " + p.getPrecio());
        }
        System.out.println("----------------------------------");
        System.out.println("Subtotal:         S/ " + subtotal);
        System.out.println("Descuento (" + (descuento * 100) + "%): - S/ " + (subtotal * descuento));
        System.out.println("Costo de envío:   S/ " + costoEnvio);
        System.out.println("TOTAL A PAGAR:    S/ " + total);
	}
	public void mostrarHistorialCompras(List<Producto> historialCompras) {
        System.out.println("\n--- HISTORIAL DE COMPRAS ---");
        if (historialCompras == null || historialCompras.isEmpty()) {
            System.out.println("No hay compras registradas en el historial.");
            return;
        }
        for (Producto p : historialCompras) {
            System.out.println("• " + p.getNombre() + " - S/ " + p.getPrecio());
        }
    }
	public void mostrarMenuCarrito()
	{
		System.out.println();
        System.out.println("     SISTEMA CARRITO DE COMPRAS   ");
        System.out.println("1. Mostrar productos ");
        System.out.println("2. Agregar producto al carrito");
        System.out.println("3. Ver contenido del carrito");
        System.out.println("4. Eliminar producto del carrito");
        System.out.println("5. Aplicar porcentaje de descuento");
        System.out.println("6. Procesar y realizar compra");
        System.out.println("7. Ver historial de compras");
        System.out.println("8. Salir");
	}

	public String solicitarOpcion()
	{
		 System.out.print("Selecciona una opción: ");
		 return scanner.nextLine();
	}
	public String solicitarIdProducto(){
        System.out.print("Ingrese el ID del producto: ");
        return scanner.nextLine();
    }

	public void mostrarMensaje(String mensaje)
	{
		System.out.println(mensaje);
	}
	
}
