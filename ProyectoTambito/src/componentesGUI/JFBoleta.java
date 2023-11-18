package componentesGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class JFBoleta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel lblIncaCola = new JLabel("Inca Cola 1/2L     5unid.           S/15\r\n");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFBoleta frame = new JFBoleta();
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
	public JFBoleta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tienda Tambito");
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTitulo.setBounds(153, 11, 153, 40);
		contentPane.add(lblTitulo);
		
		JLabel lblProductos = new JLabel("Productos:");
		lblProductos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProductos.setBounds(10, 64, 84, 19);
		contentPane.add(lblProductos);
		lblIncaCola.setBounds(92, 59, 183, 25);
		contentPane.add(lblIncaCola);
		
		JLabel lblOreo = new JLabel("Oreo                    10 unid.        S/4");
		lblOreo.setBounds(92, 81, 203, 25);
		contentPane.add(lblOreo);
		
		JLabel lblRellenitas = new JLabel("Rellenitas             8unid.           S/10");
		lblRellenitas.setBounds(92, 105, 183, 25);
		contentPane.add(lblRellenitas);
		
		JLabel lblSubtotal = new JLabel("Subtotal:  S/29");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSubtotal.setBounds(10, 157, 111, 31);
		contentPane.add(lblSubtotal);
		
		JLabel lblIGV = new JLabel("IGV:        S/5.22");
		lblIGV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIGV.setBounds(10, 188, 111, 19);
		contentPane.add(lblIGV);
		
		JLabel lblTotal = new JLabel("Total:      S/34.22");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotal.setBounds(10, 218, 121, 19);
		contentPane.add(lblTotal);
		
		JLabel lblFecha = new JLabel("Fecha:     4/11/23\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		lblFecha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFecha.setBounds(232, 163, 111, 19);
		contentPane.add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora:    13:28 pm.");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHora.setBounds(232, 188, 111, 19);
		contentPane.add(lblHora);
		
		JButton btnImprimir = new JButton("Imprimir Boleta");
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnImprimir.setBounds(303, 225, 121, 25);
		contentPane.add(btnImprimir);
	}
}
