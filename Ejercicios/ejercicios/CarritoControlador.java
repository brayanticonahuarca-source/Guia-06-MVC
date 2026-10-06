package ejercicios;

public class CarritoControlador {
    private CarritoModelo modelo;
    private CarritoVista vista;

    public CarritoControlador(CarritoModelo modelo, CarritoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        precargarProductos();
    }
 
    private void precargarProductos() {
        modelo.agregarProducto(new Producto("Laptop Gaming", 3500.0, "P1"));
        modelo.agregarProducto(new Producto("Mouse Inalámbrico", 80.0, "P2"));
        modelo.agregarProducto(new Producto("Teclado Mecánico", 220.0, "P3"));
        modelo.agregarProducto(new Producto("Monitor 24 pulgadas", 650.0, "P4"));
    }
    private void agregarAlCarrito() {
        vista.mostrarProductos(modelo.getProductos());
        String id = vista.solicitarIdProducto();

        if (modelo.agregarProductoCarrito(id)) {
            vista.mostrarMensaje("✓ Producto agregado al carrito con éxito.");
        } else {
            vista.mostrarMensaje("✗ No se encontró ningún producto con el ID ingresado.");
        }
    }

    private void verCarrito() {
        double descuentoActual = modelo.isDescuentoAplicado() ? 0.10 : 0.0;
        vista.mostrarCarrito(
            modelo.getCarrito(),
            modelo.calcularCompras(),
            descuentoActual,
            modelo.getCostoEnvio(),
            modelo.calcuarTotal()
        );
    }

    private void eliminarDelCarrito() {
        if (modelo.getCarrito().isEmpty()) {
            vista.mostrarMensaje("El carrito está vacío, no hay productos para eliminar.");
            return;
        }

        String id = vista.solicitarIdProducto();
        if (modelo.eliminarProductoCarrito(id)) {
            vista.mostrarMensaje("✓ Producto eliminado del carrito correctamente.");
        } else {
            vista.mostrarMensaje("✗ El ID ingresado no se encuentra en el carrito.");
        }
    }

    private void aplicarDescuento() {
        if (modelo.isDescuentoAplicado()) {
            vista.mostrarMensaje("! El descuento del 10% ya está activo.");
        } else {
            modelo.descuentoActivar();
            vista.mostrarMensaje("✓ Descuento del 10% activado correctamente.");
        }
    }

    private void realizarCompra() {
        if (modelo.realizarCompra()) {
            vista.mostrarMensaje("¡Compra realizada con éxito! Productos guardados en el historial.");
        } else {
            vista.mostrarMensaje("✗ No se pudo procesar la compra. El carrito está vacío.");
        }
    }
    
    public void iniciar()
    {
    	String opcion;
        do {
            vista.mostrarMenuCarrito();
            opcion = vista.solicitarOpcion();
            switch (opcion) {
            case "1":
                vista.mostrarProductos(modelo.getProductos());
                break;
            case "2":agregarAlCarrito();
                break;
            case "3":
                verCarrito();
                break;
            case "4":
                eliminarDelCarrito();
                break;
            case "5":
                aplicarDescuento();
                break;
            case "6":
                realizarCompra();
                break;
            case "7":
                vista.mostrarHistorialCompras(modelo.getHistorialCompras());
                break;
            case "8":
                vista.mostrarMensaje("Saliendo del sistema...");
                break;
            default:
                vista.mostrarMensaje("Opción no válida. Intente nuevamente.");
                break;
            }
        }while (!opcion.equals("8"));
    }
}	