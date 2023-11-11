package proyectoTambito;

public class UCajero extends Usuario 
{
	private static final int NIVEL_ACCESO = 1;
	
	public UCajero(String usuario, String contraseña) 
	{
		super(usuario, contraseña);
	}

	public static int getNivelAcceso() 
	{
		return NIVEL_ACCESO;
	}
}
