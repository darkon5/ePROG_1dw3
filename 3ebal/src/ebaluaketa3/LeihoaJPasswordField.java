package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Window.Type;

public class LeihoaJPasswordField extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField pwdAnonimoa;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJPasswordField frame = new LeihoaJPasswordField();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame. Test2
	 */
	public LeihoaJPasswordField() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 150, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblErabiltzailea = new JLabel("Erabiltzailea");
		lblErabiltzailea.setBounds(10, 11, 130, 14);
		contentPane.add(lblErabiltzailea);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPasahitza = new JLabel("Pasahitza");
		lblPasahitza.setBounds(10, 67, 114, 14);
		contentPane.add(lblPasahitza);
		
		pwdAnonimoa = new JPasswordField();
		pwdAnonimoa.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				//pwdAnonimoa.selectAll;
			}
		});
		pwdAnonimoa.setText("anonimoa");
		pwdAnonimoa.setBounds(10, 92, 114, 20);
		contentPane.add(pwdAnonimoa);
		
		JButton btnSartu = new JButton("Sartu");
		btnSartu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] pass = pwdAnonimoa.getPassword();
				String passString = String.valueOf(pass);
				
				String userString = textField.getText();
				if (passString.equals("1dw3") && userString.equals(userString)){
					lblStatus.setText("oi! :)");
				}else{
					lblStatus.setText("boo! >:(");
				}
				
				//lblStatus.setText(passString);
			}
		});
		btnSartu.setBounds(7, 123, 117, 23);
		contentPane.add(btnSartu);
		
		lblStatus = new JLabel("status");
		lblStatus.setBounds(10, 162, 114, 14);
		contentPane.add(lblStatus);
	}

}
