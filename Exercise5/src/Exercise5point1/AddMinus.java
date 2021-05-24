package Exercise5point1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

public class AddMinus {

	private JFrame frame;
	private JTextField TextField1;
	private JTextField TextField2;
	private JTextField AnswerTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
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
	public AddMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 677, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ADDButton = new JButton("ADD (+)");
		ADDButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ADDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,ans;
				try {
					n1 = Integer.parseInt(TextField1.getText());
					n2 = Integer.parseInt(TextField2.getText());
					ans = n1+n2;
					AnswerTextField.setText(Integer.toString(ans));
				}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter valid number.");
				}
			}
			}

		);
		
		ADDButton.setBounds(122, 165, 146, 48);
		frame.getContentPane().add(ADDButton);
		
		JButton MinusButton = new JButton("MINUS (-)");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,ans;
				try {
					n1 = Integer.parseInt(TextField1.getText());
					n2 = Integer.parseInt(TextField2.getText());
					ans = n1-n2;
					AnswerTextField.setText(Integer.toString(ans));
				}catch(Exception e1) {
				JOptionPane.showMessageDialog(null, "Please enter valid number.");
				}
			}
		});
		MinusButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MinusButton.setBounds(351, 165, 138, 48);
		frame.getContentPane().add(MinusButton);
		
		TextField1 = new JTextField();
		TextField1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextField1.setBounds(122, 91, 148, 48);
		frame.getContentPane().add(TextField1);
		TextField1.setColumns(10);
		
		TextField2 = new JTextField();
		TextField2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextField2.setBounds(351, 91, 138, 48);
		frame.getContentPane().add(TextField2);
		TextField2.setColumns(10);
		
		JLabel AnswerLabel = new JLabel("The answer is");
		AnswerLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AnswerLabel.setBounds(142, 284, 148, 37);
		frame.getContentPane().add(AnswerLabel);
		
		AnswerTextField = new JTextField();
		AnswerTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AnswerTextField.setBounds(318, 284, 156, 37);
		frame.getContentPane().add(AnswerTextField);
		AnswerTextField.setColumns(10);
	}

}
