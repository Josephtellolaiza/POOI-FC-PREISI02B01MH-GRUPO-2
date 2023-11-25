package componentesGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesProyectoTambito.Tienda;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFAñadirProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField INNombre;
	private JTextField INPrecio;
	private JTextField INCantidad;

	private Tienda tambito = new Tienda();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFAñadirProducto frame = new JFAñadirProducto();
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
	public JFAñadirProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		INNombre = new JTextField();
		INNombre.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		INNombre.setBounds(140, 60, 185, 25);
		contentPane.add(INNombre);
		INNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Producto:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 60, 90, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 100, 80, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Unidades:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 140, 80, 20);
		contentPane.add(lblNewLabel_2);
		
		INPrecio = new JTextField();
		INPrecio.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		INPrecio.setBounds(140, 100, 185, 25);
		contentPane.add(INPrecio);
		INPrecio.setColumns(10);
		
		INCantidad = new JTextField();
		INCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		INCantidad.setBounds(140, 140, 185, 25);
		contentPane.add(INCantidad);
		INCantidad.setColumns(10);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFGestionInventario gestionInventario = new JFGestionInventario();
				gestionInventario.setTambito(getTambito());
				gestionInventario.setVisible(true);
			}
		});
		btnRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnRegresar.setBounds(80, 212, 130, 35);
		contentPane.add(btnRegresar);
		
		
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tienda tambito = new Tienda();
				tambito = getTambito();
				
				if(INPrecio.getText() != null && INCantidad.getText() != null && INNombre.getText() != null)
				{
					double NPrecio = Double.parseDouble(INPrecio.getText());
					int NCantidad = Integer.parseInt(INCantidad.getText());
					tambito.getInventarioTienda().anadirProducto(NPrecio, NCantidad, INNombre.getText());
					setTambito(tambito);
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "No hay datos", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				setVisible(false);
				JFGestionInventario gestionInventario = new JFGestionInventario();
				gestionInventario.setTambito(tambito);
				gestionInventario.setVisible(true);
			}
		});
		
		btnConfirmar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnConfirmar.setBounds(250, 212, 130, 35);
		contentPane.add(btnConfirmar);
		
		JLabel labelIcono = new JLabel("Logo");
		labelIcono.setBounds(10, 10, 200, 40);
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
