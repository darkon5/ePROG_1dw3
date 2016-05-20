package ebaluaketa3;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;


public class SQLtestFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SQLtestFrame frame = new SQLtestFrame();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setTitle("SQL test app");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SQLtestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblStatus, BorderLayout.CENTER);
		
		try{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection konexioa	= DriverManager.getConnection("jdbc:mysql://localhost/dbikaslea", "root", ""); 
			System.out.println("Konexio egokia."); 
			lblStatus.setText("Konexio egokia."); 
			Statement st = konexioa.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM ikasleak"); 
			
			while (rs.next()){
				System.out.println("NAN: " + rs.getObject("nan") + ", Izena: " + 	rs.getObject("izena") + ", Abizenak: " + rs.getObject("abizenak") + ", Taldea: " + rs.getObject("taldea"));	} 
			
			st.executeQuery("insert into ikasleak values ('xxxxxxx1A','W1','A1','9XZ1');"); 
			rs.close(); 
			st.close();
			konexioa.close(); 
			} 
			catch (SQLException | ClassNotFoundException sqle){ 
			sqle.printStackTrace(); 
			System.out.println("Konexio errorea	"); 
			lblStatus.setText("Konexio errorea"); 
			}
		

	}

}
