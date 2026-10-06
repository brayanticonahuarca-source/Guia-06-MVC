package lab6;

public class Main2 {

    public static void main(String[] args) {

        PedidoModelo2 modelo = new PedidoModelo2();
        PedidoVista2 vista = new PedidoVista2();

        PedidoControlador2 controlador =
                new PedidoControlador2(modelo, vista);

        controlador.iniciar();
    }
}