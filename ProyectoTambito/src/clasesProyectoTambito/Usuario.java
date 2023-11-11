package clasesProyectoTambito;

public abstract class Usuario 
{
	private String usuario = new String();
	private String contraseña = new String();
	
	public Usuario(String usuario, String contraseña) 
	{
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public String getUsuario() 
	{
		return usuario;
	}

	public void setUsuario(String usuario) 
	{
		this.usuario = usuario;
	}

	public String getContraseña() 
	{
		return contraseña;
	}

	public void setContraseña(String contraseña) 
	{
		this.contraseña = contraseña;
	}

	@Override
	public String toString() 
	{
		return "Trabajador [Usuario = " + usuario + ", Contraseña = " + contraseña + "]";
	}
}