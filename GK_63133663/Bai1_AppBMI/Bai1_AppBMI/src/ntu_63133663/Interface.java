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
	JPanel panel;
	JLabel lblNewLabel;
	JPanel panel_1;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_1_1;
	JLabel lblNewLabel_1_2;
	JButton btnNewButton;
	JLabel lblNewLabel_3;
	JButton btnClear;
	JButton btnExit;
	JLabel lblNewLabel_2;
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
		setBounds(100, 100, 724, 810);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(0, 0, 700, 89);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Body Mass Index");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 35));
		lblNewLabel.setBounds(207, 14, 289, 64);
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(10, 100, 689, 374);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Height(m):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(101, 60, 117, 40);
		panel_1.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Weight(kg):");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(101, 122, 117, 33);
		panel_1.add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("BMI");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(131, 175, 87, 36);
		panel_1.add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(211, 66, 250, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(211, 124, 250, 34);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(211, 179, 96, 34);
		panel_1.add(textField_2);
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double h = Double.parseDouble(textField.getText());
				double w = Double.parseDouble(textField_1.getText());
				
				double bmi = w / (h* h);
				
				String cal = String.format("%.2f",bmi);
				textField_2.setText(cal);
				
				if(bmi<=18.5)
				{
					textField_2.setOpaque(true);
					textField_2.setBackground(Color.orange);
					lblNewLabel_3.setForeground(Color.orange);
					lblNewLabel_3.setText("UnderWeight");
				}
				else if(bmi<=24.9)
				{
					textField_2.setOpaque(true);
					textField_2.setBackground(Color.green);
					lblNewLabel_3.setForeground(Color.green);
					lblNewLabel_3.setText("Healthy");
				}
				else if(bmi<=29.9)
				{
					textField_2.setOpaque(true);
					textField_2.setForeground(Color.white);
					textField_2.setBackground(Color.blue);
					lblNewLabel_3.setForeground(Color.blue);
					lblNewLabel_3.setText("OverWeight");
				}
				else if(bmi>30)
				{
					textField_2.setOpaque(true);
					textField_2.setBackground(Color.red);
					lblNewLabel_3.setForeground(Color.red);
					lblNewLabel_3.setText("Obese");
				}


			}
		});
		btnNewButton.setBounds(366, 284, 96, 35);
		panel_1.add(btnNewButton);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(330, 180, 124, 33);
		panel_1.add(lblNewLabel_3);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_2.setOpaque(true);
				textField_2.setBackground(null);
				lblNewLabel_3.setText("");

			}
		});
		btnClear.setBounds(467, 284, 71, 35);
		panel_1.add(btnClear);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(548, 284, 65, 35);
		panel_1.add(btnExit);
		
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(11, 485, 689, 280);
		contentPane.add(lblNewLabel_2);
	    // Replace "path/to/your/image.jpg" with the actual path to your image file
	    String imagePath = "C:\\Users\\\\PC\\Desktop\\bmi2.jpg";
	    int imageWidth = lblNewLabel_2.getWidth(); // Get the width of the JLabel
	    int imageHeight = lblNewLabel_2.getHeight(); // Get the height of the JLabel

	    ImageIcon imageIcon = resizeIcon(imagePath, imageWidth, imageHeight);
	    lblNewLabel_2.setIcon(imageIcon);

	}
}
