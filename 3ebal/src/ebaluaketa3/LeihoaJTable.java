package ebaluaketa3;

import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.Font;
import javax.swing.SwingConstants;


public class LeihoaJTable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJTable frame = new LeihoaJTable();
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
	public LeihoaJTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnIrten = new JButton("Irten");
		contentPane.add(btnIrten, BorderLayout.SOUTH);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);
		
		JLabel lblIkasleenDatuak = new JLabel("Ikasleen datuak:");
		contentPane.add(lblIkasleenDatuak, BorderLayout.NORTH);
	}

}
