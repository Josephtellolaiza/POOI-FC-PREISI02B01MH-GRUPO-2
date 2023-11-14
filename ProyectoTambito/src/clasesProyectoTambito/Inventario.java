package clasesProyectoTambito;

import java.util.ArrayList;

public class Inventario 
{
	ArrayList<Producto> productosInventario = new ArrayList<Producto>();

	public Inventario()
	{}
	
	public Inventario(ArrayList<Producto> productosInventario) 
	{
		this.productosInventario = productosInventario;
	}

	public ArrayList<Producto> getProductosInventario() 
	{
		return productosInventario;
	}

	public void setProductosInventario(ArrayList<Producto> productosInventario) 
	{
		this.productosInventario = productosInventario;
	}
	
	public ArrayList<Producto> buscarProductoNombre(String referenciaProducto)
	{
		ArrayList<Producto> listaProductosCoincidencia = new ArrayList<Producto>();

		for(Producto producto : this.productosInventario)
		{
			if(referenciaProducto.equals(producto.getNombre()))
			{
				listaProductosCoincidencia.add(producto);
			}
		}
				
		return listaProductosCoincidencia;
	}
	
	public void anadirProducto(double precioProducto, int cantidadProducto, String nombreProducto)
	{
		Producto productoAnadir = new Producto(precioProducto, cantidadProducto, nombreProducto);
		productosInventario.add(productoAnadir);
	}
	
	public void removerProducto(String nombreProducto)
	{
		Producto productoRemover = new Producto();
		
		for(Producto producto : this.productosInventario)
		{
			if(nombreProducto.equalsIgnoreCase(producto.getNombre()))
			{
				productoRemover = producto;
				break;
			}
		}
		
		this.productosInventario.remove(productoRemover);
	}
}