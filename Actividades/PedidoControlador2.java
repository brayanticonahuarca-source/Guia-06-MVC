package lab6;

public class PedidoControlador2 {

    private PedidoModelo2 modelo;
    private PedidoVista2 vista;

    public PedidoControlador2(PedidoModelo2 modelo, PedidoVista2 vista) {
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

                modelo.agregarPedido(new Pedido2(nombre, tipo));

                vista.mostrarMensaje("Pedido agregado.");
                break;

            case "2":
                vista.mostrarPedidos(modelo.getPedidos());
                break;

            case "3":
                String eliminar = vista.pedir("Plato a eliminar: ");

                if (modelo.eliminarPedido(eliminar)) {
                    vista.mostrarMensaje("Pedido eliminado.");
                } else {
                    vista.mostrarMensaje("Pedido no encontrado.");
                }
                break;

            case "4":
                String anterior = vista.pedir("Nombre actual: ");
                String nuevo = vista.pedir("Nuevo nombre: ");

                if (modelo.actualizarPedido(anterior, nuevo)) {
                    vista.mostrarMensaje("Pedido actualizado.");
                } else {
                    vista.mostrarMensaje("Pedido no encontrado.");
                }
                break;

            case "5":
                String buscar = vista.pedir("Ingrese nombre o tipo: ");
                vista.mostrarPedidos(modelo.buscarPedido(buscar));
                break;

            case "6":
                vista.mostrarMensaje(
                    "Total de pedidos: " + modelo.contarPedidos()
                );

                String tipoContar = vista.pedir(
                    "Ingrese tipo para contar: "
                );

                vista.mostrarMensaje(
                    "Pedidos de tipo " + tipoContar + ": "
                    + modelo.contarTipo(tipoContar)
                );
                break;

            case "7":
                vista.mostrarMensaje("Saliendo...");
                break;

            default:
                vista.mostrarMensaje("Opcion no valida.");
            }

        } while (!opcion.equals("7"));

        vista.cerrar();
    }
}