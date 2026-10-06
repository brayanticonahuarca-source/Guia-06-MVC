package lab6;

import java.util.List;
import java.util.Scanner;

public class PedidoVista {

    private Scanner scanner;

    public PedidoVista() {
        scanner = new Scanner(System.in);
    }

    public String solicitarNombrePlato() {
        System.out.print("Ingrese el nombre del plato: ");
        return scanner.nextLine();
    }

    public void mostrarPedidos(List<Pedido> pedidos) {

        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos.");
        } else {
            System.out.println("\nLista de pedidos:");

            for (Pedido pedido : pedidos) {
                System.out.println("- " + pedido.getNombrePlato());
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("\n===== RESTAURANTE =====");
        System.out.println("1. Agregar pedido");
        System.out.println("2. Mostrar pedidos");
        System.out.println("3. Salir");
    }

    public String solicitarOpcion() {
        System.out.print("Seleccione una opcion: ");
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}