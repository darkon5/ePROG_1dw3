package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class LehioaJComboboxJList extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> cmbTaldeak;
	private JLabel lblAukera;
	private JButton btnPasatu;
	private JList zerrenda;
	private DefaultListModel<String> dlm = new DefaultListModel<String>(); 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LehioaJComboboxJList frame = new LehioaJComboboxJList();
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
	public LehioaJComboboxJList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAukera = new JLabel("Aukera");
		lblAukera.setBounds(10, 11, 199, 14);
		contentPane.add(lblAukera);
		
		cmbTaldeak = new JComboBox<String>();
		cmbTaldeak.setBounds(10, 36, 128, 20);
		contentPane.add(cmbTaldeak);
		
		
		cmbTaldeak.setToolTipText("Grupos");
		cmbTaldeak.addItem("1AS3"); 
		cmbTaldeak.addItem("2AS3"); 
		cmbTaldeak.addItem("1DW3"); 
		cmbTaldeak.addItem("2DW3"); 
		cmbTaldeak.setSelectedIndex(0); 
		cmbTaldeak.addActionListener(this);
		contentPane.add(cmbTaldeak, BorderLayout.WEST); 
		
		btnPasatu = new JButton(">>");
		btnPasatu.setBounds(10, 67, 128, 23);
		btnPasatu.addActionListener(this);
		contentPane.add(btnPasatu);
		
		zerrenda = new JList<String>();
		zerrenda.setBounds(148, 38, 235, 333);
		contentPane.add(zerrenda);
	}
	
	@Override 
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == cmbTaldeak){
			//egin gauzak
			String aukeraketa = (String) this.cmbTaldeak.getSelectedItem(); 
			this.lblAukera.setText(aukeraketa); 
		}
		if(e.getSource() == btnPasatu){
			//egin gauzak
			String aukeraketa = (String) this.cmbTaldeak.getSelectedItem(); 
			this.dlm.addElement(aukeraketa);
			this.zerrenda.setModel(dlm);
			this.lblAukera.setText(aukeraketa); 
		}
	}
}
