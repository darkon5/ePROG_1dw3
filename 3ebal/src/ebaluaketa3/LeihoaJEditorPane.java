package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import java.awt.CardLayout;
import java.awt.Color;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFileChooser;
import javax.swing.DropMode;
import java.awt.Font;
import javax.swing.JEditorPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LeihoaJEditorPane extends JFrame implements ChangeListener, ActionListener {
	
	int aukera;
	
	private JMenuBar menuBar;
	private JMenu mnFitxategia;
	private JMenuItem mntmBerria;
	private JMenuItem mntmIreki;
	private JMenuItem mntmGorde;
	private JMenuItem mntmItxi;
	
	private JMenu mnLaguntza;
	private JMenuItem mntmAbout;
	
	private boolean modified = false;
	
	JEditorPane Testua;
	
	String path;
	String appname = "tx";
	String appver = "indev 0.1";
	

	ArrayList<String> list = new ArrayList<String>();
	private JMenu mnEditatu;
	private JMenuItem mntmMoztu;
	private JMenuItem mntmItzatzi;
	private JMenuItem mntmKopia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJEditorPane frame = new LeihoaJEditorPane();
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
	public LeihoaJEditorPane() {
		setTitle(appname + " - Fitxategi berria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 324, 409);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFitxategia = new JMenu("Fitxategia");
		menuBar.add(mnFitxategia);
		
		mntmBerria = new JMenuItem("Berria");
		mnFitxategia.add(mntmBerria);
		mntmBerria.addActionListener(this);
		
		mntmIreki = new JMenuItem("Ireki");
		mnFitxategia.add(mntmIreki);
		mntmIreki.addActionListener(this);
		
		mntmGorde = new JMenuItem("Gorde");
		mnFitxategia.add(mntmGorde);
		mntmGorde.addActionListener(this);
		
		mntmItxi = new JMenuItem("Irten");
		mnFitxategia.add(mntmItxi);
		mntmItxi.addActionListener(this);
		
		mnEditatu = new JMenu("Editatu");
		menuBar.add(mnEditatu);
		
		mntmMoztu = new JMenuItem("Moztu");
		mnEditatu.add(mntmMoztu);
		
		mntmKopia = new JMenuItem("Kopia");
		mnEditatu.add(mntmKopia);
		
		mntmItzatzi = new JMenuItem("Itzatzi");
		mnEditatu.add(mntmItzatzi);
		
		mnLaguntza = new JMenu("Laguntza");
		menuBar.add(mnLaguntza);
		
		mntmAbout = new JMenuItem("About");
		mnLaguntza.add(mntmAbout);
		mntmAbout.addActionListener(this);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		Testua = new JEditorPane();
		Testua.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				modified=true;
			}
		});
		Testua.setFont(new Font("Source Code Pro", Font.BOLD, 14));
		getContentPane().add(Testua, BorderLayout.CENTER);
		Testua.setBackground(Color.decode("#2c2c2c"));
		Testua.setForeground(Color.decode("#cacada"));
		Testua.setCaretColor(Color.decode("#cacafe"));
		
		
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mntmBerria || e.getSource() == mntmBerria){
			//JOptionPane.showMessageDialog(null, "berria");
			this.DokumentuBerria();
		}
		if(e.getSource() == mntmIreki || e.getSource() == mntmIreki){
			//JOptionPane.showMessageDialog(null, "ireki");
			this.DokumentuaIreki();
		}
		if(e.getSource() == mntmGorde || e.getSource() == mntmGorde){
			//JOptionPane.showMessageDialog(null, "gorde");
			this.DokumentuaGorde();
		}
		if(e.getSource() == mntmItxi || e.getSource() == mntmItxi){
			//JOptionPane.showMessageDialog(null, "itxi");
			this.DokumentuaItxi();
		}
		if(e.getSource() == mntmAbout || e.getSource() == mntmAbout){
			JOptionPane.showMessageDialog(null, appname + " - " + appver);
		}
		
	}
	
	private void GordeNahi(){
		if (modified){
		aukera = JOptionPane.showConfirmDialog(null, (String)"Aldaketak gorde nahi?",appname + " - " + appver , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null);
		}
	}

	private void DokumentuaIreki() {
		GordeNahi();

		switch (aukera){
		case 0:
			//gorde eta salto egin 1-era
			DokumentuaGorde();
		case 1:		
			JFileChooser fileChooser = new JFileChooser(); 
		int aukera = fileChooser.showOpenDialog(rootPane);
		
		String edukia="";
		if (aukera == JFileChooser.APPROVE_OPTION){ 
			Testua.setText("");
			try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()))) {
			    String line = null;
			    path = fileChooser.getSelectedFile().getAbsolutePath();

				setTitle(appname + " - " + path);
			    while ((line = reader.readLine()) != null) {
				   edukia +=line + "\n";
			    }
			    Testua.setText(edukia);
			} catch (IOException x) {
			    System.err.format("IOException: %s%n", x);
			}
			
			} 
			else if (aukera == JFileChooser.CANCEL_OPTION){ 
			// Utzi sakatu bada 
			Testua.setText("Utzi egin duzu"); 
			} 
			else if (aukera == JFileChooser.ERROR_OPTION){ 
			// Errorea egon bada 
				JOptionPane.showMessageDialog(null, "Errorea egon da.");
			}
			
			break;
		case 2:
			break;
		}
	}
	
	private void DokumentuaItxi() {
		GordeNahi();
		switch (aukera){
		case 0:
			DokumentuaGorde();
			//gorde eta salto egin 1-era
		case 1:
			System.exit(0); 
			break;
		case 2:
			break;
		}
	}

	private void DokumentuaGorde() {
		if (modified){			
			try{FileWriter fitxategia=null;
			PrintWriter pw=null;
			fitxategia = new FileWriter(path);
			pw=new PrintWriter(fitxategia);
			pw.printf(Testua.getText());

			modified=false;

			setTitle(appname + " - " + path);
			fitxategia.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
	
	private void DokumentuBerria() {
		GordeNahi();
		switch (aukera){
		case 0:
			DokumentuaGorde();
			//gorde eta salto egin 1-era
		case 1:
			String edukia="";
			Testua.setText("");
			break;
		case 2:
			break;
		}
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
