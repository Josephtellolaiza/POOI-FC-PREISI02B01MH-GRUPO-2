package clasesProyectoTambito;

import java.util.ArrayList;

public class Venta
{
	private ArrayList<Producto> productosVendidos = new ArrayList <Producto>();

	private double ventaTotal;

	private int numeroVenta;

	private String nombreCliente = new String();

	private Usuario cajero = new Usuario();

	public Venta(ArrayList<Producto> productosVendidos, double ventaTotal, int numeroVenta, String nombreCliente,
			Usuario cajero)
	{
		this.productosVendidos = productosVendidos;
		this.ventaTotal = ventaTotal;
		this.numeroVenta = numeroVenta;
		this.nombreCliente = nombreCliente;
		this.cajero = cajero;
	}

	public Venta()
	{}

	public ArrayList<Producto> getProductosVendidos()
	{
		return productosVendidos;
	}

	public void setProductosVendidos(ArrayList<Producto> productosVendidos)
	{
		this.productosVendidos = productosVendidos;
	}

	public double getVentaTotal()
	{
		return ventaTotal;
	}

	public void setVentaTotal(double ventaTotal)
	{
		this.ventaTotal = ventaTotal;
	}

	public int getNumeroVenta()
	{
		return numeroVenta;
	}

	public void setNumeroVenta(int numeroVenta)
	{
		this.numeroVenta = numeroVenta;
	}

	public String getNombreCliente()
	{
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente)
	{
		this.nombreCliente = nombreCliente;
	}

	public Usuario getCajero()
	{
		return cajero;
	}

	public void setCajero(Usuario cajero)
	{
		this.cajero = cajero;
	}

	@Override
	public String toString()
	{
		return "Venta [Productos vendidos = " + productosVendidos + ", Venta total = " + ventaTotal + ", Numero de venta = "
				+ numeroVenta + ", Nombre del cliente = " + nombreCliente + ", Cajero = " + cajero + "]";
	}
}