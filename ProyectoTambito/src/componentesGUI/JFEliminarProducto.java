package componentesGUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;

public class JFEliminarProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFEliminarProducto frame = new JFEliminarProducto();
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
	public JFEliminarProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione los productos y la cantidad que desea eliminar");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(39, 11, 385, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(326, 154, 98, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(326, 201, 98, 36);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 52, 242, 20);
		contentPane.add(comboBox);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(245, 73, 17, 154);
		contentPane.add(scrollBar);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Todo");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(20, 79, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(189, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(189, 122, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(189, 165, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Producto1");
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setVerticalAlignment(SwingConstants.BOTTOM);
		chckbxNewCheckBox_1.setBounds(20, 118, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		chckbxNewCheckBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		chckbxNewCheckBox_2.setVerticalAlignment(SwingConstants.TOP);
		chckbxNewCheckBox_2.setBounds(20, 161, 107, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JList list = new JList();
		list.setBounds(20, 54, 242, 169);
		contentPane.add(list);
	}
}
