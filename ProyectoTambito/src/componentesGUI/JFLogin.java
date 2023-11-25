package componentesGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesProyectoTambito.*;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;

public class JFLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ingresarUsuario;
	private JPasswordField ingresarContraseña;

	private Tienda tambito = new Tienda();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFLogin frame = new JFLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ingresarUsuario = new JTextField();
		ingresarUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		ingresarUsuario.addMouseListener(new MouseAdapter() {
		});
		ingresarUsuario.setBounds(225, 85, 205, 30);
		contentPane.add(ingresarUsuario);
		ingresarUsuario.setColumns(10);
		
		JLabel textoUsuario = new JLabel("INGRESE USUARIO:");
		textoUsuario.setBounds(10, 84, 205, 30);
		contentPane.add(textoUsuario);
		
		JLabel textoContraseña = new JLabel("INGRESE CONTRASEÑA:");
		textoContraseña.setBounds(10, 140, 205, 30);
		contentPane.add(textoContraseña);
		
		ingresarContraseña = new JPasswordField();
		ingresarContraseña.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		ingresarContraseña.addMouseListener(new MouseAdapter() {});
		ingresarContraseña.setBounds(223, 141, 205, 30);
		contentPane.add(ingresarContraseña);
		
		JButton botonIngresar = new JButton("Ingresar");
		botonIngresar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		botonIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				boolean confirmar = false;
				
				Usuario UIAdmin = new UAdministradorInventario();
				Usuario UICajero = new UCajero();
				
				char[] clave = ingresarContraseña.getPassword();
				String claveFinal = new String(clave);
				String usuarioIngresado = ingresarUsuario.getText();

				ArrayList<Usuario> usuariosTienda = new ArrayList<Usuario>();
				Usuario cajero1 = new UCajero("mario.valdivia", "1234");
				Usuario administrador1 = new UAdministradorInventario("alfonso.ugarte", "6789");
				
				usuariosTienda.add(cajero1);
				usuariosTienda.add(administrador1);
				
				Inventario inventarioTienda = new Inventario();
				RegistroVenta registroVentas = new RegistroVenta();
				
				Tienda tambito = new Tienda(inventarioTienda, usuariosTienda, registroVentas);
				
				for(Usuario usuario : tambito.getUsuariosTienda()) 
				{
					if(usuarioIngresado.equals(usuario.getUsuario()) && claveFinal.equals(usuario.getContraseña()))
					{
						setVisible(false);
						
						confirmar = true;
						
						JFMenuPrincipal menuPrincipal = new JFMenuPrincipal();
						menuPrincipal.setTambito(tambito);
						
						if(usuario instanceof UCajero)
						{
							UICajero = usuario;
							menuPrincipal.setUICajero(UICajero);
						}
						
						else if(usuario instanceof UAdministradorInventario)
						{
							UIAdmin = usuario;
							menuPrincipal.setUIAdmin(UIAdmin);
						}
						
						JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "INGRESASTE", JOptionPane.INFORMATION_MESSAGE);
						
						menuPrincipal.setVisible(true);
						
						break;
					}
				}
				
				if(confirmar == false)
				{
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectta", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		botonIngresar.setBounds(158, 220, 123, 30);
		contentPane.add(botonIngresar);

		textoUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textoContraseña.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel labelIcono = new JLabel("Logo");
		labelIcono.setBounds(112, 11, 200, 50);
		contentPane.add(labelIcono);
		
		String rutaImagen = "src/recursos/logoTambito.jpg";
		ImageIcon LTOriginal = new ImageIcon(rutaImagen);
		Image LTAjustado = LTOriginal.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
		ImageIcon LTIcono = new ImageIcon(LTAjustado);
		labelIcono.setIcon(LTIcono);
	}

	public Tienda getTambito() 
	{
		return tambito;
	}

	public void setTambito(Tienda tambito) 
	{
		this.tambito = tambito;
	}
}
