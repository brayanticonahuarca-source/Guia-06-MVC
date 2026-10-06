package lab6;

public class Main3 {

    public static void main(String[] args) {

        PedidoModelo3 modelo = new PedidoModelo3();
        PedidoVista3 vista = new PedidoVista3();

        PedidoControlador3 controlador =
                new PedidoControlador3(modelo, vista);

        controlador.iniciar();
    }
}