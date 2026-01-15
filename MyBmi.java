package MyFirstGUIPackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyBmi {

	private JFrame frame;
	private JTextField txtWeight;
	private JTextField txtHeight;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyBmi window = new MyBmi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyBmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("BMI Calculator");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel("BMI Calculator");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(100, 10, 230, 30);
		frame.getContentPane().add(lblTitle);

		JLabel lblWeight = new JLabel("Weight (kg):");
		lblWeight.setBounds(50, 60, 100, 25);
		frame.getContentPane().add(lblWeight);

		txtWeight = new JTextField();
		txtWeight.setBounds(160, 60, 150, 25);
		frame.getContentPane().add(txtWeight);

		JLabel lblHeight = new JLabel("Height (m):");
		lblHeight.setBounds(50, 100, 100, 25);
		frame.getContentPane().add(lblHeight);

		txtHeight = new JTextField();
		txtHeight.setBounds(160, 100, 150, 25);
		frame.getContentPane().add(txtHeight);

		JButton btnCalculate = new JButton("Calculate BMI");
		btnCalculate.setBounds(140, 140, 150, 30);
		frame.getContentPane().add(btnCalculate);

		lblResult = new JLabel("Result: ");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(50, 190, 330, 30);
		frame.getContentPane().add(lblResult);

		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double weight = Double.parseDouble(txtWeight.getText());
					double height = Double.parseDouble(txtHeight.getText());

					double bmi = weight / (height * height);
					String category;

					if (bmi < 18.5) {
						category = "Underweight";
					} else if (bmi < 25) {
						category = "Normal";
					} else if (bmi < 30) {
						category = "Overweight";
					} else {
						category = "Obese";
					}

					lblResult.setText(String.format("BMI: %.2f (%s)", bmi, category));
				} catch (Exception ex) {
					lblResult.setText("Please enter valid numbers!");
				}
			}
		});
	}
}
