package ntu_63133663;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

public class Interface extends JFrame {

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
					Interface frame = new Interface();
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
	
	// Hàm điều chỉnh kích thước ImageIcon
	private ImageIcon resizeIcon(String filePath, int width, int height) {
	    ImageIcon imageIcon = new ImageIcon(filePath); // Tải ImageIcon từ đường dẫn
	    Image image = imageIcon.getImage(); // Chuyển ImageIcon thành Image để có thể điều chỉnh kích thước
	    Image resizedImage = image.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH); // Điều chỉnh kích thước
	    return new ImageIcon(resizedImage); // Trả về ImageIcon mới đã được điều chỉnh kích thước
	}
	
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 890);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(0, 0, 710, 168);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = 	new JLabel("Body Mass Index");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 35));
		lblNewLabel.setBounds(216, 52, 289, 64);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(10, 179, 689, 374);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Height(m):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(101, 60, 117, 40);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Weight(kg):");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(101, 122, 117, 33);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("BMI");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(131, 175, 87, 36);
		panel_1.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(228, 60, 250, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(228, 125, 250, 34);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(228, 180, 96, 34);
		panel_1.add(textField_2);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(385, 284, 77, 35);
		panel_1.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(467, 284, 71, 35);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(548, 284, 65, 35);
		panel_1.add(btnExit);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(385, 179, 124, 33);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 564, 689, 280);
		contentPane.add(lblNewLabel_2);
	    // Replace "path/to/your/image.jpg" with the actual path to your image file
	    String imagePath = "C:\\Users\\\\PC\\Desktop\\bmi2.jpg";
	    int imageWidth = lblNewLabel_2.getWidth(); // Get the width of the JLabel
	    int imageHeight = lblNewLabel_2.getHeight(); // Get the height of the JLabel

	    ImageIcon imageIcon = resizeIcon(imagePath, imageWidth, imageHeight);
	    lblNewLabel_2.setIcon(imageIcon);

	}
}
