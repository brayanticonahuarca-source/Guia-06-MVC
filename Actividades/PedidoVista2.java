package lab6;

import java.util.List;
import java.util.Scanner;

public class PedidoVista2 {

    private Scanner scanner;

    public PedidoVista2() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {

        System.out.println("\n===== PEDIDOS =====");
        System.out.println("1. Agregar pedido");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Eliminar pedido");
        System.out.println("4. Actualizar pedido");
        System.out.println("5. Buscar pedido");
        System.out.println("6. Contar pedidos");
        System.out.println("7. Salir");
    }

    public String pedir(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void mostrarPedidos(List<Pedido2> pedidos) {

        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos.");
        } else {

            System.out.println("\nLista de pedidos:");

            for (Pedido2 pedido : pedidos) {
                System.out.println(
                    "- " + pedido.getNombrePlato()
                    + " | Tipo: " + pedido.getTipo()
                );
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrar() {
        scanner.close();
    }
}