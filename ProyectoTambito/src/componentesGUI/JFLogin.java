package componentesGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ingresarUsuario;
	private JPasswordField ingresarContraseña;

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
		ingresarUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
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
		ingresarContraseña.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		ingresarContraseña.setBounds(223, 141, 205, 30);
		contentPane.add(ingresarContraseña);
		
		Font fuente = new Font("Times New Roman", 1, 15);
		textoUsuario.setFont(fuente);
		textoContraseña.setFont(fuente);
		
		JLabel labelIcono = new JLabel("New label");
		labelIcono.setBounds(112, 11, 200, 50);
		contentPane.add(labelIcono);
		
		String rutaImagen = "C:\\Users\\raul\\Pictures\\Saved Pictures\\logoTambito.jpg";
		ImageIcon LTOriginal = new ImageIcon(rutaImagen);
		Image LTAjustado = LTOriginal.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
		ImageIcon LTIcono = new ImageIcon(LTAjustado);
		labelIcono.setIcon(LTIcono);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(158, 220, 123, 30);
		contentPane.add(btnNewButton);
	}
}
