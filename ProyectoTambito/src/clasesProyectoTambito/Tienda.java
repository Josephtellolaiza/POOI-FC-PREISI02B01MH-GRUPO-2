package clasesProyectoTambito;

import java.util.ArrayList;

public class Tienda 
{
	private Inventario inventarioTienda = new Inventario();
	private ArrayList<Usuario> usuariosTienda = new ArrayList<Usuario>();
	private RegistroVenta registroVentas = new RegistroVenta();
	
	public Tienda(Inventario inventarioTienda, ArrayList<Usuario> usuariosTienda, RegistroVenta registroVentas) 
	{
		this.inventarioTienda = inventarioTienda;
		this.usuariosTienda = usuariosTienda;
		this.registroVentas = registroVentas;
	}
	
	public Tienda()
	{}
	
	public Inventario getInventarioTienda() 
	{
		return inventarioTienda;
	}
	public void setInventarioTienda(Inventario inventarioTienda) 
	{
		this.inventarioTienda = inventarioTienda;
	}
	public ArrayList<Usuario> getUsuariosTienda()
	{
		return usuariosTienda;
	}
	public void setUsuariosTienda(ArrayList<Usuario> usuariosTienda)
	{
		this.usuariosTienda = usuariosTienda;
	}

	public RegistroVenta getRegistroVentas() 
	{
		return registroVentas;
	}

	public void setRegistroVentas(RegistroVenta registroVentas) 
	{
		this.registroVentas = registroVentas;
	}
}
