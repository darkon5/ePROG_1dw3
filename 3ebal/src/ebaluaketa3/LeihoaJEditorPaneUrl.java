package ebaluaketa3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LeihoaJEditorPaneUrl extends JFrame {

	private JPanel contentPane;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeihoaJEditorPaneUrl frame = new LeihoaJEditorPaneUrl();
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
	public LeihoaJEditorPaneUrl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JEditorPane editorPane = new JEditorPane();
		contentPane.add(editorPane, BorderLayout.CENTER);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JLabel lblUrl = new JLabel("URL:");
		toolBar.add(lblUrl);
		
        this.add(new JScrollPane(editorPane));
		
		address = new JTextField();
		address.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (address.getText().startsWith("http://")){
	                	URL siteAddress = new URL(address.getText());
	                	editorPane.setPage(siteAddress);					}else{
	                	URL siteAddress = new URL("http://" + address.getText());
	                	editorPane.setPage(siteAddress);
					}
					} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Unable To Load Page");
				} finally {
					setCursor(Cursor.getDefaultCursor());
				}
			}
		});
		address.setText("gimme.moe");
		toolBar.add(address);
		address.setColumns(10);
	}

}
