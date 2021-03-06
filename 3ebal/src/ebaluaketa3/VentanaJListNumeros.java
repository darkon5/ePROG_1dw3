package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class VentanaJListNumeros extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero;
	private JList<String> lista;
	private JButton btnInsertar;
	private JButton btnBorrar;
	private JButton btnLimpiar;
	private JLabel lblNumero;
	private DefaultListModel<String> dlm = new DefaultListModel<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJListNumeros frame = new VentanaJListNumeros();
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
	public VentanaJListNumeros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		lblNumero = new JLabel("Numero");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		toolBar.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setText("0");
		toolBar.add(txtNumero);
		//txtNumero.setColumns(10);
		txtNumero.selectAll();
		txtNumero.addActionListener(this);

		
		btnInsertar = new JButton("Insertar");
		toolBar.add(btnInsertar);
		btnInsertar.addActionListener(this);
		
		btnBorrar = new JButton("Borrar");
		toolBar.add(btnBorrar);
		btnBorrar.addActionListener(this);
		
		btnLimpiar = new JButton("Limpiar");
		toolBar.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		
		lista = new JList<String>();
		contentPane.add(lista, BorderLayout.CENTER);
		lista.setModel(dlm);
	}
	
	@Override 
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btnInsertar || e.getSource() == txtNumero){
			//egin gauzak
			String aukeraketa = (String) this.txtNumero.getText();
			this.dlm.addElement(aukeraketa);
			this.lista.setModel(dlm);
			txtNumero.selectAll();
		}
		if(e.getSource() == btnBorrar){
			//egin gauzak
			/*String aukeraketa = (String) this.txtNumero.getText();
			while (this.dlm.contains(aukeraketa)==true){
				this.dlm.removeElement(aukeraketa);
			}*/
			String sele = this.lista.getSelectedValue();
			this.dlm.removeElement(sele);

			
			this.lista.setModel(dlm);
		}
		if(e.getSource() == btnLimpiar){
			//egin gauzak
			this.dlm.clear();
		}
	}

}
