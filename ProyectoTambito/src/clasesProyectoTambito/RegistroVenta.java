package clasesProyectoTambito;

import java.util.ArrayList;

public class RegistroVenta
{
	private ArrayList<Venta> ventasRealizadas = new ArrayList<Venta>();

	public RegistroVenta(ArrayList<Venta> ventasRealizadas) 
	{
		this.ventasRealizadas = ventasRealizadas;
	}

	public ArrayList<Venta> getVentasRealizadas() 
	{
		return ventasRealizadas;
	}

	public void setVentasRealizadas(ArrayList<Venta> ventasRealizadas) 
	{
		this.ventasRealizadas = ventasRealizadas;
	}

	@Override
	public String toString() {
		return "RegistroVenta [Ventas realizadas = " + ventasRealizadas + "]";
	}
}
