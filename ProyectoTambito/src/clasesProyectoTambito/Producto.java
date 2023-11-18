package clasesProyectoTambito;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Producto 
{
	double precio;

	int cantidad;
	
	String nombre = new String();
	
	LocalDateTime fechaLanzamiento = LocalDateTime.now();

	public Producto(double precio, int cantidad, String nombre) 
	{
		this.precio = precio;
		this.cantidad = cantidad;
		this.nombre = nombre;
	}
	
	public Producto()
	{}

	public Double getPrecio() 
	{
		return precio;
	}

	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}

	public Integer getCantidad() 
	{
		return cantidad;
	}

	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public LocalDateTime getFechaLanzamiento() 
	{
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDateTime fechaLanzamiento) 
	{
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public String getStringFechaLanzamiento() 
	{
		String fechaLanzamiento = this.fechaLanzamiento.format(DateTimeFormatter.ofPattern("Fecha de lanzamiento del producto: dd-MM-yyyy HH:mm"));
		return fechaLanzamiento;
	}
	
	@Override
	public String toString() 
	{
		String fechaLanzamiento = this.fechaLanzamiento.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
		
		return "Producto [Precio = " + precio + ", Cantidad disponible = " + cantidad + ", Nombre del producto = " + nombre + ", Fecha de lanzamiento = "
				+ fechaLanzamiento + "]";
	}
}