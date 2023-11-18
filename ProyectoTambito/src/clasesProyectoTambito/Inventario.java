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
	
	public ArrayList<Producto> buscarProducto(Object referenciaProducto)
	{
		ArrayList<Producto> listaProductosCoincidencia = new ArrayList<Producto>();
								
		if(referenciaProducto instanceof Integer)
		{
			for(int contador = 0; contador < this.productosInventario.size(); contador++)
			{
				if(referenciaProducto.equals(this.productosInventario.get(contador).getCodigo()))
				{
					listaProductosCoincidencia.add(this.productosInventario.get(contador));
				}
			}
		}
		
		if(referenciaProducto instanceof Double)
		{
			for(int contador = 0; contador < this.productosInventario.size(); contador++)
			{
				if(referenciaProducto.equals(this.productosInventario.get(contador).getPrecio()))
				{
					listaProductosCoincidencia.add(this.productosInventario.get(contador));
				}
			}
		}
		
		if(referenciaProducto instanceof String)
		{
			for(int contador = 0; contador < this.productosInventario.size(); contador++)
			{
				if(referenciaProducto.equals(this.productosInventario.get(contador).getNombre()))
				{
					listaProductosCoincidencia.add(this.productosInventario.get(contador));
				}
			}
		}
				
		return listaProductosCoincidencia;
	}
	
	public void anadirProducto()
	{
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		Scanner entrada4 = new Scanner(System.in);
		
		String nombreProducto = new String();
		String respuestaYN = new String();
		
		int cantidadProducto = 0;
		
		double precioProducto = 0;
		
		boolean salirIngresarDatos = false;
		boolean salirIngresarNombre = false;
		boolean salirIngresarPrecio = false;
		boolean salirIngresarCantidad = false;
		
		do
		{
			do
			{
				try
				{
					System.out.println("Ingrese el nombre del producto: ");
					nombreProducto = entrada1.next();
					salirIngresarNombre = true;
				}
				
				catch(InputMismatchException ex)
				{
					System.out.println("ERROR");
				}	
			}
			while(salirIngresarNombre == false);
			
			do
			{
				try
				{
					System.out.println("Ingrese el precio del producto: ");
					precioProducto = entrada2.nextDouble();
					salirIngresarPrecio = true;
				}
				
				catch(InputMismatchException ex)
				{
					System.out.println("ERROR");
				}	
			}
			while(salirIngresarPrecio == false);
			
			do
			{
				try
				{
					System.out.println("Ingrese la cantidad del producto a añadir: ");
					cantidadProducto = entrada3.nextInt();
					salirIngresarCantidad = true;
				}
				
				catch(InputMismatchException ex)
				{
					System.out.println("ERROR");
				}	
			}
			while(salirIngresarCantidad == false);
			
			try
			{
				System.out.println("Estos datos son correcto? (Y/N): ");
				respuestaYN = entrada4.next();
				
				if(respuestaYN.equals("Y") || respuestaYN.equals("y"))
				{
					salirIngresarDatos = true;
				}
				
				else if(respuestaYN.equals("N") || respuestaYN.equals("n"))
				{
					System.out.println("Vuelva a ingresar los datos.");
				}
				
				else
				{
					System.out.println("ERROR. CARACTER INVALIDO");
				}
			}
			
			catch(InputMismatchException ex)
			{
				System.out.println("ERROR");
			}
		}
		while(salirIngresarDatos == false);
		
		Producto productoAnadir = new Producto(precioProducto, cantidadProducto, nombreProducto);
		productosInventario.add(productoAnadir);
		
		entrada1.close();
		entrada2.close();
		entrada3.close();
		entrada4.close();
	}
	
	public void removerProducto()
	{
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Scanner entrada3 = new Scanner(System.in);
		Scanner entradaYN1 = new Scanner(System.in);
		Scanner entradaYN2 = new Scanner(System.in);
		Scanner entradaYN3 = new Scanner(System.in);
		
		Producto productoRemover = new Producto();
		
		int opcion;
		Integer codigoProductoRemover = 0;
		
		Double precioProductoRemover = 0.0;
		
		boolean salirElegirOpcion = false;
		boolean salirOpcion1 = false; 
		boolean salirOpcion2 = false; 
		boolean salirOpcion3 = false; 
		boolean salirYN1 = false; 
		boolean salirYN2 = false; 
		boolean salirYN3 = false; 
		
		
		String nombreProductoRemover = new String();
		String YN1 = new String();
		String YN2 = new String();
		String YN3 = new String();
		
		System.out.println("Buscar por: ");
		System.out.println("1 --> Nombre");
		System.out.println("2 --> Precio");
		System.out.println("3 --> Codigo");
		
		do
		{
			try
			{
				opcion = entrada1.nextInt();
				
				switch (opcion)
				{
					case 1:
					{
						System.out.println("Ingrese el nombre del producto: ");
						
						do
						{
							try
							{
								nombreProductoRemover = entrada1.next();
								salirOpcion1 = true;
							}
							
							catch(InputMismatchException ex)
							{
								System.out.println("ERROR");
							}
						}
						while(salirOpcion1 == false);
						
						productoRemover = this.buscarProducto(nombreProductoRemover);
						
						if(productoRemover != null) 
						{
							do
							{
								System.out.println("Remover este producto? (Y/N)");
								productoRemover.toString();	
								
								try
								{
									YN1 = entradaYN1.next();
									
									if(YN1.equals("Y") || YN1.equals("y"))
									{
										this.productosInventario.remove(productoRemover);
										salirYN1 = true;
										
										System.out.println("Producto removido.");
									}
									
									else if(YN1.equals("N") || YN1.equals("n"))
									{
										
										System.out.println("Producto no removido.");
										salirYN1 = true;
									}
									
									else
									{
										System.out.println("ERROR");
									}
								}
								
								catch(InputMismatchException ex)
								{
									System.out.println("ERROR");
								}
							}
							while(salirYN1 == false);	
						}
						
						else
						{
							System.out.println("El producto no existe.");
						}
						
						salirElegirOpcion = true;
						
						break;
					}
					
					case 2:
					{
						System.out.println("Ingrese el precio del producto: ");
						
						do
						{
							try
							{
								precioProductoRemover = entrada2.nextDouble();
								salirOpcion2 = true;
							}
							
							catch(InputMismatchException ex)
							{
								System.out.println("ERROR");
							}
						}
						while(salirOpcion2 == false);
						
						productoRemover = this.buscarProducto(precioProductoRemover);
						
						if(productoRemover != null) 
						{
							do
							{
								System.out.println("Remover este producto? (Y/N)");
								productoRemover.toString();	
								
								try
								{
									YN2 = entradaYN2.next();
									
									if(YN2.equals("Y") || YN2.equals("y"))
									{
										this.productosInventario.remove(productoRemover);
										salirYN2 = true;
										
										System.out.println("Producto removido.");
									}
									
									else if(YN2.equals("N") || YN2.equals("n"))
									{
										
										System.out.println("Producto no removido.");
										salirYN2 = true;
									}
									
									else
									{
										System.out.println("ERROR");
									}
								}
								
								catch(InputMismatchException ex)
								{
									System.out.println("ERROR");
								}
							}
							while(salirYN2 == false);	
						}
						
						else
						{
							System.out.println("El producto no existe.");
						}
						
						salirElegirOpcion = true;
						
						break;
					}
					
					case 3:
					{
						System.out.println("Ingrese el codigo del producto: ");
						
						do
						{
							try
							{
								codigoProductoRemover = entrada3.nextInt();
								salirOpcion3 = true;
							}
							
							catch(InputMismatchException ex)
							{
								System.out.println("ERROR");
							}
						}
						while(salirOpcion3 == false);
						
						productoRemover = this.buscarProducto(codigoProductoRemover);
						
						if(productoRemover != null) 
						{
							do
							{
								System.out.println("Remover este producto? (Y/N)");
								productoRemover.toString();	
								
								try
								{
									YN3 = entradaYN3.next();
									
									if(YN3.equals("Y") || YN3.equals("y"))
									{
										this.productosInventario.remove(productoRemover);
										salirYN3 = true;
										
										System.out.println("Producto removido.");
									}
									
									else if(YN3.equals("N") || YN3.equals("n"))
									{
										
										System.out.println("Producto no removido.");
										salirYN3 = true;
									}
									
									else
									{
										System.out.println("ERROR");
									}
								}
								
								catch(InputMismatchException ex)
								{
									System.out.println("ERROR");
								}
							}
							while(salirYN3 == false);	
						}
						
						else
						{
							System.out.println("El producto no existe.");
						}
						
						salirElegirOpcion = true;
						
						break;
					}
					
					default:
					{
						System.out.println("ERROR");
					}
				}
			}
			
			catch(InputMismatchException ex)
			{
				System.out.println("ERROR");
			}
		}
		while(salirElegirOpcion == false);
		
		entrada1.close();
		entrada2.close();
		entrada3.close();
		entradaYN1.close();
		entradaYN2.close();
		entradaYN3.close();
	}
}