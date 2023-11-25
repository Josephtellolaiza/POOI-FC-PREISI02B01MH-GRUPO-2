package componentesGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import clasesProyectoTambito.*;
public class JFMenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private Tienda tambito = new Tienda();
	private Usuario UIAdmin = new UAdministradorInventario(null, null);
	private Usuario UICajero = new UCajero(null, null);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFMenuPrincipal frame = new JFMenuPrincipal();
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
	public JFMenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton botonGestionInventario = new JButton("Gestionar inventario");
		botonGestionInventario.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		botonGestionInventario.setBounds(15, 105, 190, 35);
		botonGestionInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean confirmarInventario = false;
				
				if(UIAdmin.getUsuario() != null && UIAdmin.getContraseña() != null)
				{
					setVisible(false);
					confirmarInventario = true;
					JFGestionInventario gestionInventario = new JFGestionInventario();
					gestionInventario.setTambito(getTambito());
					gestionInventario.setVisible(true);
				}
				
				if(confirmarInventario == false)
				{
					JOptionPane.showMessageDialog(null, "Solo se permite ingresar al administrador.", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				}
		});
		
		JButton btnNewButton_1 = new JButton("Generar venta");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.setBounds(229, 105, 190, 35);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		
		JLabel labelIcono = new JLabel("Logo");
		labelIcono.setBounds(211, 25, 200, 50);
		contentPane.add(labelIcono);
		contentPane.add(btnNewButton_1);
		contentPane.add(botonGestionInventario);
		
		String rutaImagen = "src/recursos/logoTambito.jpg";
		ImageIcon LTOriginal = new ImageIcon(rutaImagen);
		Image LTAjustado = LTOriginal.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
		ImageIcon LTIcono = new ImageIcon(LTAjustado);
		labelIcono.setIcon(LTIcono);
		
		JLabel welcome = new JLabel("  Bienvenido a");
		welcome.setFont(new Font("Times New Roman", Font.BOLD, 28));
		welcome.setBounds(28, 30, 383, 40);
		contentPane.add(welcome);
		
		JButton btnNewButton_2 = new JButton("Cerrar sesión");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_2.setBounds(229, 175, 190, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Registro de ventas");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_3.setBounds(15, 175, 190, 35);
		contentPane.add(btnNewButton_3);
		
		
	}

	public Tienda getTambito() 
	{
		return tambito;
	}

	public void setTambito(Tienda tambito) 
	{
		this.tambito = tambito;
	}
	
	public Usuario getUIAdmin() 
	{
		return UIAdmin;
	}

	public void setUIAdmin(Usuario uIAdmin) 
	{
		UIAdmin = uIAdmin;
	}

	public Usuario getUICajero() 
	{
		return UICajero;
	}

	public void setUICajero(Usuario uICajero) 
	{
		UICajero = uICajero;
	}
}
