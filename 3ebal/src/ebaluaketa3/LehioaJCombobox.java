package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;


@SuppressWarnings("serial")
public class LehioaJCombobox extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JComboBox<String> cmbTaldeak;
	private JLabel lblAukera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LehioaJCombobox frame = new LehioaJCombobox();
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
	public LehioaJCombobox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 235, 103);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAukera = new JLabel("Aukera");
		lblAukera.setBounds(10, 11, 199, 14);
		contentPane.add(lblAukera);
		
		cmbTaldeak = new JComboBox<String>();
		cmbTaldeak.setBounds(10, 36, 199, 20);
		contentPane.add(cmbTaldeak);
		
		
		cmbTaldeak.setToolTipText("Grupos");
		cmbTaldeak.addItem("1AS3"); 
		cmbTaldeak.addItem("2AS3"); 
		cmbTaldeak.addItem("1DW3"); 
		cmbTaldeak.addItem("2DW3"); 
		cmbTaldeak.setSelectedIndex(0); 
		cmbTaldeak.addActionListener(this);
		contentPane.add(cmbTaldeak, BorderLayout.WEST); 
	}
	
	@Override 
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == cmbTaldeak){
			//egin gauzak
			String aukeraketa = (String) this.cmbTaldeak.getSelectedItem(); 
			this.lblAukera.setText(aukeraketa); 
		}
	// 	Aukeraketa aldatu
	// Etiketaren balioa aldatu
	//int 	AukeraIndizea= lse.getFirstindex(); 
	} 
}
