package clasesProyectoTambito;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Producto 
{
	Double precio;
	
	Integer codigo;
	Integer cantidad;
	
	String nombre = new String();
	
	LocalDateTime fechaLanzamiento = LocalDateTime.now();

	public Producto(Double precio, Integer cantidad, String nombre) 
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

	public void setPrecio(Double precio) 
	{
		this.precio = precio;
	}

	public Integer getCodigo() 
	{
		return codigo;
	}

	public void setCodigo(Integer codigo) 
	{
		this.codigo = codigo;
	}

	public Integer getCantidad() 
	{
		return cantidad;
	}

	public void setCantidad(Integer cantidad) 
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
		
		return "Producto [Precio = " + precio + ", Código = " + codigo + ", Cantidad disponible = " + cantidad + ", Nombre del producto = " + nombre + ", Fecha de lanzamiento = "
				+ fechaLanzamiento + "]";
	}
}