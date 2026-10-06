package lab6;

import java.util.List;

public class PedidoControlador {

    private PedidoModelo modelo;
    private PedidoVista vista;

    public PedidoControlador(PedidoModelo modelo, PedidoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarPedido(String nombrePlato) {

        if (!nombrePlato.isEmpty()) {
            Pedido pedido = new Pedido(nombrePlato);
            modelo.agregarPedido(pedido);

            vista.mostrarMensaje("Pedido agregado: " + nombrePlato);
        } else {
            vista.mostrarMensaje("El nombre no puede estar vacio.");
        }
    }

    public void mostrarPedidos() {
        List<Pedido> pedidos = modelo.getPedidos();
        vista.mostrarPedidos(pedidos);
    }

    public void iniciar() {

        String opcion;

        do {
            vista.mostrarMenu();
            opcion = vista.solicitarOpcion();

            switch (opcion) {

            case "1":
                String nombre = vista.solicitarNombrePlato();
                agregarPedido(nombre);
                break;

            case "2":
                mostrarPedidos();
                break;

            case "3":
                vista.mostrarMensaje("Saliendo...");
                break;

            default:
                vista.mostrarMensaje("Opcion no valida.");
            }

        } while (!opcion.equals("3"));

        vista.cerrarScanner();
    }
}