package examen3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.Font;

public class Examen3JListRacionalFicheros extends JFrame{

	private JPanel contenedor;
	private JPanel panelDatos;
	private JButton btnInsertar;
	private JButton btnBorrar;
	private JButton btnLimpiar;

	private JLabel lblNumerador;
	private JTextField txtNumerador;
	private JLabel lblDenominador;
	private JTextField txtDenominador;
	private JScrollPane scrollPane;
	private JPanel panelEstado;
	private JLabel lblEstado;
	private JLabel lblEstadoActual;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen3JListRacionalFicheros frame = new Examen3JListRacionalFicheros();
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
	public Examen3JListRacionalFicheros() {
		setTitle("Examen3JListRacionalFicheros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 336);
		contenedor = new JPanel();
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenedor.setLayout(new BorderLayout(0, 0));
		setContentPane(contenedor);
		
		panelDatos = new JPanel();
		contenedor.add(panelDatos, BorderLayout.NORTH);
		
		lblNumerador = new JLabel("Numerador");
		panelDatos.add(lblNumerador);
		lblNumerador.setHorizontalAlignment(SwingConstants.CENTER);
	  
	  txtNumerador = new JTextField();
	  txtNumerador.setHorizontalAlignment(SwingConstants.RIGHT);
	  txtNumerador.setText("0");
	  panelDatos.add(txtNumerador);
	  txtNumerador.setColumns(10);
	  
	  lblDenominador = new JLabel("Denominador");
	  panelDatos.add(lblDenominador);
	  
	  txtDenominador = new JTextField();
	  txtDenominador.setHorizontalAlignment(SwingConstants.RIGHT);
	  txtDenominador.setText("1");
	  panelDatos.add(txtDenominador);
	  txtDenominador.setColumns(10);
	  
	  btnInsertar = new JButton("Insertar");
	  panelDatos.add(btnInsertar);
	  
	  btnBorrar = new JButton("Borrar");
	  panelDatos.add(btnBorrar);
	  
	  btnLimpiar = new JButton("Limpiar");
	  panelDatos.add(btnLimpiar);
		
	
		scrollPane = new JScrollPane();
		contenedor.add(scrollPane, BorderLayout.CENTER);
		
		panelEstado = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelEstado.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contenedor.add(panelEstado, BorderLayout.SOUTH);
		
		lblEstado = new JLabel("Estado:");
		panelEstado.add(lblEstado);
		
		lblEstadoActual = new JLabel("Datos Sin Modificar");
		lblEstadoActual.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelEstado.add(lblEstadoActual);
	  
	}
}
