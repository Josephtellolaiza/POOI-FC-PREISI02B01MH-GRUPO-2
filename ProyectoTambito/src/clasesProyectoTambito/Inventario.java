package clasesProyectoTambito;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

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
	
	public ArrayList<Producto> buscarProducto(String nombreProducto)
	{
		ArrayList<Producto> listaProductosCoincidencia = new ArrayList<Producto>();
		
		for(Producto producto : this.productosInventario)
		{
			if(nombreProducto.equalsIgnoreCase(producto.getNombre()))
			{
				listaProductosCoincidencia.add(producto);
			}
		}
				
		return listaProductosCoincidencia;
	}
	
	public void anadirProducto(double precio, int cantidad, String nombre)
	{
		Producto productoAnadir = new Producto(precio, cantidad, nombre);
		productosInventario.add(productoAnadir);
	}
	
	public void removerProducto(Producto productoRemover)
	{
		this.productosInventario.remove(productoRemover);
	}
}