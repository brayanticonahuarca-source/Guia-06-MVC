package lab6;

public class PedidoControlador3 {

    private PedidoModelo3 modelo;
    private PedidoVista3 vista;

    public PedidoControlador3(PedidoModelo3 modelo, PedidoVista3 vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {

        String opcion;

        do {

            vista.mostrarMenu();
            opcion = vista.pedir("Seleccione una opcion: ");

            switch (opcion) {

            case "1":

                String nombre = vista.pedir("Nombre del plato: ");
                String tipo = vista.pedir("Tipo de plato: ");

                Pedido3 pedido = new Pedido3(nombre, tipo);

                modelo.agregarPedido(pedido);

                vista.mostrarMensaje("Pedido agregado.");
                break;

            case "2":

                vista.mostrarPedidos(modelo.getPedidos());
                break;

            case "3":

                String completar =
                        vista.pedir("Ingrese el pedido a completar: ");

                if (modelo.completarPedido(completar)) {
                    vista.mostrarMensaje("Pedido marcado como completo.");
                } else {
                    vista.mostrarMensaje(
                        "No se encontro un pedido pendiente."
                    );
                }
                break;

            case "4":

                String eliminar =
                        vista.pedir("Ingrese el pedido a eliminar: ");

                if (modelo.eliminarPedido(eliminar)) {
                    vista.mostrarMensaje("Pedido eliminado.");
                } else {
                    vista.mostrarMensaje("Pedido no encontrado.");
                }
                break;

            case "5":

                String estado =
                        vista.pedir(
                            "Ingrese estado (Pendiente/Completo/Eliminado): "
                        );

                vista.mostrarPedidos(
                    modelo.buscarEstado(estado)
                );
                break;

            case "6":

                vista.mostrarMensaje(
                    "Pedidos pendientes: "
                    + modelo.contarPendientes()
                );
                break;

            case "7":

                vista.mostrarMensaje("\n===== HISTORIAL =====");

                vista.mostrarPedidos(
                    modelo.getHistorial()
                );
                break;

            case "8":

                vista.mostrarMensaje("Saliendo...");
                break;

            default:

                vista.mostrarMensaje("Opcion no valida.");
            }

        } while (!opcion.equals("8"));

        vista.cerrar();
    }
}