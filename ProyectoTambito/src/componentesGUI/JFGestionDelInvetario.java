package componentesGUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import java.awt.Choice;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;

public class JFGestionDelInvetario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFGestionDelInvetario frame = new JFGestionDelInvetario();
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
	public JFGestionDelInvetario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("Modificar producto");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(10, 206, 136, 33);
		contentPane.add(button);
		
		Button button_1 = new Button("Añadir producto");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(169, 206, 110, 33);
		contentPane.add(button_1);
		
		Button button_2 = new Button("Eliminar producto");
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(307, 206, 117, 33);
		contentPane.add(button_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(80, 22, 269, 149);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		scrollPane.setColumnHeaderView(comboBox);
	}
}
