package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class LeihoaJCheckBoxJRadioButtonBikoitza extends JFrame {

	private JPanel contentPane;
	
	private ButtonGroup btgKoloreak;
	JRadioButton radioButton;
	JRadioButton radioButton_1;
	JRadioButton radioButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJCheckBoxJRadioButtonBikoitza frame = new LeihoaJCheckBoxJRadioButtonBikoitza();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LeihoaJCheckBoxJRadioButtonBikoitza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		radioButton = new JRadioButton("red");
		radioButton.setBounds(120, 68, 109, 23);
		contentPane.add(radioButton);
		
		radioButton_1 = new JRadioButton("green");
		radioButton_1.setBounds(120, 94, 109, 23);
		contentPane.add(radioButton_1);
		
		radioButton_2 = new JRadioButton("blue");
		radioButton_2.setBounds(120, 120, 109, 23);
		contentPane.add(radioButton_2);
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setBounds(6, 70, 97, 23);
		contentPane.add(chckbxA);
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setBounds(6, 94, 97, 23);
		contentPane.add(chckbxB);
		
		btgKoloreak	= new ButtonGroup();
		btgKoloreak.add(radioButton); 
		btgKoloreak.add(radioButton_1); 
		btgKoloreak.add(radioButton_2); 
		
		JLabel lblTextText = new JLabel("Test text");
		lblTextText.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblTextText.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextText.setBounds(10, 11, 219, 52);
		contentPane.add(lblTextText);
	}
}
