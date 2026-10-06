package ejercicios;
import java.util.ArrayList;
import java.util.List;
public class CarritoModelo {
	private List<Producto> productos;
	private List<Producto> historialCompras;
	private List<Producto> carrito;
	private static final double DESCUENTO = 0.10;
	private boolean descuentoAplicado;
	private double costoEnvio;
	public CarritoModelo()
	{
		this.productos = new ArrayList<>();
		this.historialCompras = new ArrayList<>();
		this.carrito = new ArrayList<>();
		this.descuentoAplicado = false;
		this.costoEnvio = 10.0;
	}
	//Getters y setters 
	public List<Producto> getCarrito()
	{
		return carrito;
	}

    public List<Producto> getHistorialCompras() 
    { 
    	return historialCompras; 
    }
	public double getCostoEnvio() { 
		return costoEnvio; 
	}	
	public void setCostoEnvio(double costoEnvio) 
	{ 
		this.costoEnvio = costoEnvio; 
	}
	public Producto buscarProducto(String idProducto) {
		for (Producto p : productos) {
			if (p.getIdProducto().equals(idProducto)) {
				return p;
			}	
		}
		return null;
	}
	public boolean eliminarProductoCarrito(String idProducto) {
	    for (int i = 0; i < carrito.size(); i++) {
	        if (carrito.get(i).getIdProducto().equals(idProducto)) 
	        {
	        	carrito.remove(i);
	            return true;
	        }
	    }
	    return false; 
	}
	public void agregarProducto(Producto p)
	{
		productos.add(p);
	}
		public List<Producto> getProductos()
		{
			return productos;
		}

	public boolean agregarProductoCarrito(String idProducto) {
	    Producto p = buscarProducto(idProducto); 
	    if (p != null) { 
	        carrito.add(p); 
	        return true;
	    }
	    return false;
	}
	public boolean realizarCompra() {
        if (carrito.isEmpty()) 
        {
            return false;
        }
        historialCompras.addAll(carrito);
        carrito.clear();
        return true;
    }

    public double calcularCompras()
    {
    	double subtotal = 0;
    	for(Producto p: carrito)
    	{
    		subtotal += p.getPrecio();
    	}
    	return subtotal;
    }
    //Descuento
    public void descuentoActivar()
    {
    	this.descuentoAplicado = true;
    }
    public boolean isDescuentoAplicado() {
        return descuentoAplicado;
    }
    //Calcular ComprarTotales
    public double calcuarTotal()
    {
    	if (carrito.isEmpty()) {
            return 0.0;
        }
    	double subtotal = calcularCompras();
    	if(descuentoAplicado)
    	{
        	double montoDescuento = subtotal*DESCUENTO;
        	return (subtotal - montoDescuento) + costoEnvio;
    	}
		return subtotal + costoEnvio;
    }
}
