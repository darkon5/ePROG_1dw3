package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class LeihoaJListAukeraketaAnitza extends JFrame implements ListSelectionListener {

	private JPanel contentPane;
	private JList<String> zndTaldeak;
	private JLabel lbldw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJListAukeraketaAnitza frame = new LeihoaJListAukeraketaAnitza();
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
	

	public LeihoaJListAukeraketaAnitza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		dlm.addElement("1AS3"); 
		dlm.addElement("2AS3"); 
		dlm.addElement("1DW3");
		dlm.addElement("2DW3"); 
		zndTaldeak= new JList<String>();
		zndTaldeak.setModel(dlm);
		zndTaldeak.addListSelectionListener(this); 
		contentPane.add(zndTaldeak, BorderLayout.WEST);
		
		JButton btnIrten = new JButton("Irten");
		btnIrten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnIrten, BorderLayout.SOUTH);
		
		lbldw = new JLabel("1DW3");
		lbldw.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbldw.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbldw, BorderLayout.NORTH);
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		String aukeratuta= (String) this.zndTaldeak.getSelectedValue(); 
		this.lbldw.setText(aukeratuta); 
		
	}

}
