package componentesGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class JFAñadirProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		textField = new JTextField();
		textField.setBounds(138, 43, 185, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Producto:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(53, 44, 91, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(53, 86, 80, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Unidades:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(53, 123, 80, 20);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 85, 185, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 122, 185, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(95, 212, 102, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(255, 212, 102, 23);
		contentPane.add(btnNewButton_1);
	}
}
