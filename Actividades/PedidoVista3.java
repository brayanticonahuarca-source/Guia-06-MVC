package lab6;

import java.util.List;
import java.util.Scanner;

public class PedidoVista3 {

    private Scanner scanner;

    public PedidoVista3() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {

        System.out.println("\n===== SISTEMA DE PEDIDOS =====");
        System.out.println("1. Agregar pedido");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Completar pedido");
        System.out.println("4. Eliminar pedido");
        System.out.println("5. Mostrar por estado");
        System.out.println("6. Contar pendientes");
        System.out.println("7. Mostrar historial");
        System.out.println("8. Salir");
    }

    public String pedir(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void mostrarPedidos(List<Pedido3> pedidos) {

        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos.");
        } else {

            System.out.println("\nPedidos:");

            for (Pedido3 pedido : pedidos) {

                System.out.println(
                    "- Plato: " + pedido.getNombrePlato()
                    + " | Tipo: " + pedido.getTipo()
                    + " | Estado: " + pedido.getEstado()
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