package ejercicios;

public class Producto {
	private String nombreProducto;
	private double precioProducto;
	private String idProducto;
	
	public Producto(String nombreProducto, double precioProducto, String idProducto)
	{
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}
	public String getIdProducto() { 
		return idProducto; 
	}
	
	public String getNombre() {
		return nombreProducto; 
	}
    public double getPrecio() {
    	return precioProducto; 
    }
	
}
