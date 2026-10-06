package lab6;

import java.util.ArrayList;
import java.util.List;

public class PedidoModelo3 {

    private List<Pedido3> pedidos;
    private List<Pedido3> historial;

    public PedidoModelo3() {

        pedidos = new ArrayList<>();
        historial = new ArrayList<>();
    }

    public void agregarPedido(Pedido3 pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido3> getPedidos() {
        return pedidos;
    }

    public List<Pedido3> getHistorial() {
        return historial;
    }

    public boolean completarPedido(String nombre) {

        for (Pedido3 pedido : pedidos) {

            if (pedido.getNombrePlato().equalsIgnoreCase(nombre)
                    && pedido.getEstado().equals("Pendiente")) {

                pedido.completar();
                historial.add(pedido);

                return true;
            }
        }

        return false;
    }

    public boolean eliminarPedido(String nombre) {

        for (Pedido3 pedido : pedidos) {

            if (pedido.getNombrePlato().equalsIgnoreCase(nombre)
                    && !pedido.getEstado().equals("Eliminado")) {

                pedido.eliminar();
                historial.add(pedido);

                return true;
            }
        }

        return false;
    }

    public List<Pedido3> buscarEstado(String estado) {

        List<Pedido3> resultado = new ArrayList<>();

        for (Pedido3 pedido : pedidos) {

            if (pedido.getEstado().equalsIgnoreCase(estado)) {
                resultado.add(pedido);
            }
        }

        return resultado;
    }

    public int contarPendientes() {

        int cantidad = 0;

        for (Pedido3 pedido : pedidos) {

            if (pedido.getEstado().equalsIgnoreCase("Pendiente")) {
                cantidad++;
            }
        }

        return cantidad;
    }
}