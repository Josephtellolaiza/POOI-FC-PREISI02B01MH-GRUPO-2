package clasesProyectoTambito;

public class UAdministradorInventario extends Usuario
{
	private static final int NIVEL_ACCESO = 2;  
	
	public UAdministradorInventario(String usuario, String contraseña) 
	{
		super(usuario, contraseña);
	}

	public static int getNivelAcceso() 
	{
		return NIVEL_ACCESO;
	}
}