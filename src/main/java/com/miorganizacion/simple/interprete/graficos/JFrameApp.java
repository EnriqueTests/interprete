package com.miorganizacion.simple.interprete.graficos;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class JFrameApp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameApp frame = new JFrameApp();
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
	public JFrameApp() {
		setName("JFrameApp");
		setTitle("Probador de GAL16V8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 610);
	}
}
