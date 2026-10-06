package lab6;

import java.util.ArrayList;
import java.util.List;

public class PedidoModelo2 {

    private List<Pedido2> pedidos;

    public PedidoModelo2() {
        pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido2 pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido2> getPedidos() {
        return pedidos;
    }

    public boolean eliminarPedido(String nombre) {

        for (int i = 0; i < pedidos.size(); i++) {

            if (pedidos.get(i).getNombrePlato().equalsIgnoreCase(nombre)) {
                pedidos.remove(i);
                return true;
            }
        }

        return false;
    }

    public boolean actualizarPedido(String nombre, String nuevoNombre) {

        for (Pedido2 pedido : pedidos) {

            if (pedido.getNombrePlato().equalsIgnoreCase(nombre)) {
                pedido.setNombrePlato(nuevoNombre);
                return true;
            }
        }

        return false;
    }

    public List<Pedido2> buscarPedido(String texto) {

        List<Pedido2> resultado = new ArrayList<>();

        for (Pedido2 pedido : pedidos) {

            if (pedido.getNombrePlato().equalsIgnoreCase(texto)
                    || pedido.getTipo().equalsIgnoreCase(texto)) {

                resultado.add(pedido);
            }
        }

        return resultado;
    }

    public int contarPedidos() {
        return pedidos.size();
    }

    public int contarTipo(String tipo) {

        int cantidad = 0;

        for (Pedido2 pedido : pedidos) {

            if (pedido.getTipo().equalsIgnoreCase(tipo)) {
                cantidad++;
            }
        }

        return cantidad;
    }
}