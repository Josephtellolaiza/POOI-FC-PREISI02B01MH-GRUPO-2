package componentesGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import clasesProyectoTambito.*;
import javax.swing.JButton;

public class JFGestionInventario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private Tienda tambito = new Tienda();
	private JTable tablaProductos;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFGestionInventario frame = new JFGestionInventario();
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
	public JFGestionInventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollTabla = new JScrollPane();
		scrollTabla.setBounds(10, 63, 450, 182);
		contentPane.add(scrollTabla);
		
		this.tambito.getInventarioTienda().anadirProducto(2.50, 30, "Helado Supay");
		this.tambito.getInventarioTienda().anadirProducto(2.50, 30, "Coca Cola 450ml");
		this.tambito.getInventarioTienda().anadirProducto(3.00, 30, "Maní Salado (Mediano)");
		
		int contador = 0;
		
		Object[][] matrizProductos = new Object[this.tambito.getInventarioTienda().getProductosInventario().size()][4];
		
		for(Producto producto : this.tambito.getInventarioTienda().getProductosInventario())
		{
			matrizProductos[contador][0] = producto.getNombre();
			matrizProductos[contador][1] = producto.getPrecio();
			matrizProductos[contador][2] = producto.getCantidad();
			contador++;
		}
		
		tablaProductos = new JTable();
		tablaProductos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		tablaProductos.setModel(new DefaultTableModel(
			matrizProductos,
			new String[] {
				"Nombre", "Precio", "Cantidad"
			}
		));
		tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(125);
		tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(53);
		tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(53);
		
		DefaultTableModel modeloTabla = (DefaultTableModel) tablaProductos.getModel();
		modeloTabla.setDataVector(matrizProductos, new String[] { "Nombre", "Precio", "Cantidad" });
		modeloTabla.fireTableDataChanged();
		
		scrollTabla.setViewportView(tablaProductos);
		
		JButton btnAñadirProducto = new JButton("Añadir producto");
		btnAñadirProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFAñadirProducto añadirProducto = new JFAñadirProducto();
				añadirProducto.setTambito(getTambito());
				añadirProducto.setVisible(true);
			}
		});
		btnAñadirProducto.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnAñadirProducto.setBounds(10, 255, 130, 35);
		contentPane.add(btnAñadirProducto);
		
		JButton btnEliminarProducto = new JButton("Eliminar producto");
		btnEliminarProducto.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnEliminarProducto.setBounds(160, 255, 130, 35);
		contentPane.add(btnEliminarProducto);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnRegresar.setBounds(310, 255, 130, 35);
		contentPane.add(btnRegresar);

		
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
