package proyectoTambito;

import java.util.ArrayList;

public class Tienda 
{
	private Inventario inventarioTienda = new Inventario();
	private ArrayList<Usuario> usuariosTienda = new ArrayList<Usuario>();
	
	public Tienda(Inventario inventarioTienda, ArrayList<Usuario> usuariosTienda) 
	{
		this.inventarioTienda = inventarioTienda;
		this.usuariosTienda = usuariosTienda;
	}
	
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
	
	
}
