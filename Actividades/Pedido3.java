package lab6;

public class Pedido3 {

    private String nombrePlato;
    private String tipo;
    private String estado;

    public Pedido3(String nombrePlato, String tipo) {
        this.nombrePlato = nombrePlato;
        this.tipo = tipo;
        this.estado = "Pendiente";
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void completar() {
        estado = "Completo";
    }

    public void eliminar() {
        estado = "Eliminado";
    }
}