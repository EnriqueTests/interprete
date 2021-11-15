package com.miorganizacion.simple.interprete.graficos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class JPanelVistaDeChip extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int contador_de_pines;
	
	private int [] pines_de_entrada;
	private int [] pines_de_salida;
	private int numero = 0;
	private int entrada = 0;
	
	private String [] nombre_de_pines_de_entrada;
	private String [] nombre_de_pines_de_salida;
	
	private String [] operacion_de_pines_de_salida;
	private String [] nombre_operacion_de_pines_de_salida;

	private ConexionSerialJrIng Serial;

	/**
	 * Create the panel.
	 */
	public JPanelVistaDeChip(int contador_de_pines, int [] pines_de_entrada, int [] pines_de_salida, String [] nombre_de_pines_de_entrada, String [] nombre_de_pines_de_salida, final String [] operacion_de_pines_de_salida, final String [] nombre_operacion_de_pines_de_salida) {
		setLayout(null);
		
		final JButton btn1 = new JButton("1");
		btn1.setVisible(false);
		btn1.setFocusable(false);
		btn1.setBounds(23, 181, 45, 23);
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn1.setBackground(new Color(240, 240, 240));
		add(btn1);
		
		final JButton btn2 = new JButton("2");
		btn2.setVisible(false);
		btn2.setFocusable(false);
		btn2.setBounds(49, 215, 45, 23);
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn2.setBackground(new Color(240, 240, 240));
		add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.setVisible(false);
		btn3.setFocusable(false);
		btn3.setBounds(49, 244, 45, 23);
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn3.setBackground(new Color(240, 240, 240));
		add(btn3);
		
		final JButton btn4 = new JButton("4");
		btn4.setVisible(false);
		btn4.setFocusable(false);
		btn4.setBounds(49, 275, 45, 23);
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn4.setBackground(new Color(240, 240, 240));
		add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.setVisible(false);
		btn5.setFocusable(false);
		btn5.setBounds(49, 304, 45, 23);
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn5.setBackground(new Color(240, 240, 240));
		add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.setVisible(false);
		btn6.setFocusable(false);
		btn6.setBounds(49, 336, 45, 23);
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn6.setBackground(new Color(240, 240, 240));
		add(btn6);
		
		final JButton btn7 = new JButton("7");
		btn7.setVisible(false);
		btn7.setFocusable(false);
		btn7.setBounds(49, 369, 45, 23);
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn7.setBackground(new Color(240, 240, 240));
		add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.setVisible(false);
		btn8.setFocusable(false);
		btn8.setBounds(49, 399, 45, 23);
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn8.setBackground(new Color(240, 240, 240));
		add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.setVisible(false);
		btn9.setFocusable(false);
		btn9.setBounds(49, 429, 45, 23);
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn9.setBackground(new Color(240, 240, 240));
		add(btn9);
		
		final JButton btn11 = new JButton("11");
		btn11.setVisible(false);
		btn11.setFocusable(false);
		btn11.setBounds(354, 463, 52, 23);
		btn11.setForeground(new Color(0, 0, 0));
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn11.setBackground(new Color(240, 240, 240));
		add(btn11);
		
		final JButton btn12 = new JButton("12");
		btn12.setVisible(false);
		btn12.setFocusable(false);
		btn12.setBounds(354, 430, 52, 23);
		btn12.setForeground(new Color(0, 0, 0));
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn12.setBackground(new Color(240, 240, 240));
		add(btn12);
		
		final JButton btn13 = new JButton("13");
		btn13.setVisible(false);
		btn13.setFocusable(false);
		btn13.setBounds(354, 399, 52, 23);
		btn13.setForeground(new Color(0, 0, 0));
		btn13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn13.setBackground(new Color(240, 240, 240));
		add(btn13);
		
		final JButton btn14 = new JButton("14");
		btn14.setVisible(false);
		btn14.setFocusable(false);
		btn14.setBounds(354, 369, 52, 23);
		btn14.setForeground(new Color(0, 0, 0));
		btn14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn14.setBackground(new Color(240, 240, 240));
		add(btn14);
		
		final JButton btn15 = new JButton("15");
		btn15.setVisible(false);
		btn15.setFocusable(false);
		btn15.setBounds(354, 336, 52, 23);
		btn15.setForeground(new Color(0, 0, 0));
		btn15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn15.setBackground(new Color(240, 240, 240));
		add(btn15);
		
		final JButton btn16 = new JButton("16");
		btn16.setVisible(false);
		btn16.setFocusable(false);
		btn16.setBounds(354, 306, 52, 23);
		btn16.setForeground(new Color(0, 0, 0));
		btn16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn16.setBackground(new Color(240, 240, 240));
		add(btn16);
		
		final JButton btn17 = new JButton("17");
		btn17.setVisible(false);
		btn17.setFocusable(false);
		btn17.setBounds(354, 275, 52, 23);
		btn17.setForeground(new Color(0, 0, 0));
		btn17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn17.setBackground(new Color(240, 240, 240));
		add(btn17);
		
		final JButton btn18 = new JButton("18");
		btn18.setVisible(false);
		btn18.setFocusable(false);
		btn18.setBounds(354, 244, 52, 23);
		btn18.setForeground(new Color(0, 0, 0));
		btn18.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn18.setBackground(new Color(240, 240, 240));
		add(btn18);
		
		final JButton btn19 = new JButton("19");
		btn19.setVisible(false);
		btn19.setFocusable(false);
		btn19.setBounds(354, 215, 52, 23);
		btn19.setForeground(new Color(0, 0, 0));
		btn19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn19.setBackground(new Color(240, 240, 240));
		add(btn19);
		
		JLabel lblGAL16V8 = new JLabel("");
		lblGAL16V8.setBounds(10, 109, 418, 393);
		lblGAL16V8.setHorizontalAlignment(SwingConstants.CENTER);
		lblGAL16V8.setIcon(new ImageIcon(JPanelVistaDeChip.class.getResource("/com/miorganizacion/simple/interprete/graficos/img/GAL16V8.jpeg")));
		add(lblGAL16V8);
		
		JLabel lblPinesDeEntradaConNombre = new JLabel("Pines de entrada");
		lblPinesDeEntradaConNombre.setBounds(10, 60, 100, 14);
		add(lblPinesDeEntradaConNombre);
		
		final JComboBox comboBoxPinesDeEntradaConNombre = new JComboBox();
		comboBoxPinesDeEntradaConNombre.setEnabled(false);
		comboBoxPinesDeEntradaConNombre.setModel(new DefaultComboBoxModel(new String[] {"Selecciona un pin de entrada"}));
		comboBoxPinesDeEntradaConNombre.setBounds(10, 76, 418, 22);
		comboBoxPinesDeEntradaConNombre.setMaximumRowCount(17);
		add(comboBoxPinesDeEntradaConNombre);
		
		JLabel lblPinesDeSalidaConEcuacionesDeSalida = new JLabel("Pines de salida");
		lblPinesDeSalidaConEcuacionesDeSalida.setBounds(10, 11, 100, 14);
		add(lblPinesDeSalidaConEcuacionesDeSalida);
		
		final JComboBox comboBoxPinesDeSalidaConEcuacionesDeSalida = new JComboBox();
		
		comboBoxPinesDeSalidaConEcuacionesDeSalida.addItemListener(new ItemListener() {	
			public void itemStateChanged(ItemEvent e) {
				String cadena_numero;
				String cadena_recortada;
				
				if(e.getStateChange() == ItemEvent.SELECTED) {
					int indice = comboBoxPinesDeSalidaConEcuacionesDeSalida.getSelectedIndex();
					
					if(indice > 0) {
						if(comboBoxPinesDeEntradaConNombre.getItemCount() > 1) {
							comboBoxPinesDeEntradaConNombre.removeItemAt(1);
							
							switch(numero) {
								case 12:
									btn12.setForeground(new Color(0, 0, 0));
									btn12.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn12.setBackground(new Color(240, 240, 240));
									break;
								case 13:
									btn13.setForeground(new Color(0, 0, 0));
									btn13.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn13.setBackground(new Color(240, 240, 240));
									break;
								case 14:
									btn14.setForeground(new Color(0, 0, 0));
									btn14.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn14.setBackground(new Color(240, 240, 240));
									break;
								case 15:
									btn15.setForeground(new Color(0, 0, 0));
									btn15.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn15.setBackground(new Color(240, 240, 240));
									break;
								case 16:
									btn16.setForeground(new Color(0, 0, 0));
									btn16.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn16.setBackground(new Color(240, 240, 240));
									break;
								case 17:
									btn17.setForeground(new Color(0, 0, 0));
									btn17.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn17.setBackground(new Color(240, 240, 240));
									break;
								case 18:
									btn18.setForeground(new Color(0, 0, 0));
									btn18.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn18.setBackground(new Color(240, 240, 240));
									break;
								case 19:
									btn19.setForeground(new Color(0, 0, 0));
									btn19.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn19.setBackground(new Color(240, 240, 240));
									break;
							}
							
							switch(entrada) {
								case 1:
									btn1.setForeground(new Color(0, 0, 0));
									btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn1.setBackground(new Color(240, 240, 240));
									break;
								case 2:
									btn2.setForeground(new Color(0, 0, 0));
									btn2.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn2.setBackground(new Color(240, 240, 240));
									break;
								case 3:
									btn3.setForeground(new Color(0, 0, 0));
									btn3.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn3.setBackground(new Color(240, 240, 240));
									break;
								case 4:
									btn4.setForeground(new Color(0, 0, 0));
									btn4.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn4.setBackground(new Color(240, 240, 240));
									break;
								case 5:
									btn5.setForeground(new Color(0, 0, 0));
									btn5.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn5.setBackground(new Color(240, 240, 240));
									break;
								case 6:
									btn6.setForeground(new Color(0, 0, 0));
									btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn6.setBackground(new Color(240, 240, 240));
									break;
								case 7:
									btn7.setForeground(new Color(0, 0, 0));
									btn7.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn7.setBackground(new Color(240, 240, 240));
									break;
								case 8:
									btn8.setForeground(new Color(0, 0, 0));
									btn8.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn8.setBackground(new Color(240, 240, 240));
									break;
								case 9:
									btn9.setForeground(new Color(0, 0, 0));
									btn9.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn9.setBackground(new Color(240, 240, 240));
									break;
								case 11:
									btn11.setForeground(new Color(0, 0, 0));
									btn11.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn11.setBackground(new Color(240, 240, 240));
									break;
								case 13:
									btn13.setForeground(new Color(0, 0, 0));
									btn13.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn13.setBackground(new Color(240, 240, 240));
									break;
								case 14:
									btn14.setForeground(new Color(0, 0, 0));
									btn14.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn14.setBackground(new Color(240, 240, 240));
									break;
								case 15:
									btn15.setForeground(new Color(0, 0, 0));
									btn15.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn15.setBackground(new Color(240, 240, 240));
									break;
								case 16:
									btn16.setForeground(new Color(0, 0, 0));
									btn16.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn16.setBackground(new Color(240, 240, 240));
									break;
								case 17:
									btn17.setForeground(new Color(0, 0, 0));
									btn17.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn17.setBackground(new Color(240, 240, 240));
									break;
								case 18:
									btn18.setForeground(new Color(0, 0, 0));
									btn18.setFont(new Font("Tahoma", Font.PLAIN, 11));
									btn18.setBackground(new Color(240, 240, 240));
									break;
							}
						}
						
						comboBoxPinesDeEntradaConNombre.addItem(operacion_de_pines_de_salida[indice - 1] + ". " + nombre_operacion_de_pines_de_salida[indice - 1]);
						comboBoxPinesDeEntradaConNombre.setEnabled(true);
						
						cadena_numero = (String) comboBoxPinesDeSalidaConEcuacionesDeSalida.getItemAt(indice);
						cadena_recortada = cadena_numero.substring(0, 2);
						numero = Integer.parseInt(cadena_recortada);
						
						switch(numero) {
							case 12:
								btn12.setForeground(new Color(0, 0, 0));
								btn12.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn12.setBackground(new Color(229, 190, 1));
								break;
							case 13:
								btn13.setForeground(new Color(0, 0, 0));
								btn13.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn13.setBackground(new Color(229, 190, 1));
								break;
							case 14:
								btn14.setForeground(new Color(0, 0, 0));
								btn14.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn14.setBackground(new Color(229, 190, 1));
								break;
							case 15:
								btn15.setForeground(new Color(0, 0, 0));
								btn15.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn15.setBackground(new Color(229, 190, 1));
								break;
							case 16:
								btn16.setForeground(new Color(0, 0, 0));
								btn16.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn16.setBackground(new Color(229, 190, 1));
								break;
							case 17:
								btn17.setForeground(new Color(0, 0, 0));
								btn17.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn17.setBackground(new Color(229, 190, 1));
								break;
							case 18:
								btn18.setForeground(new Color(0, 0, 0));
								btn18.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn18.setBackground(new Color(229, 190, 1));
								break;
							case 19:
								btn19.setForeground(new Color(0, 0, 0));
								btn19.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn19.setBackground(new Color(229, 190, 1));
								break;
						}
						
						entrada = Integer.parseInt(operacion_de_pines_de_salida[indice - 1]);
						
						switch(entrada) {
							case 1:
								btn1.setForeground(new Color(255, 255, 255));
								btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn1.setBackground(new Color(0, 0, 255));
								break;
							case 2:
								btn2.setForeground(new Color(255, 255, 255));
								btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn2.setBackground(new Color(0, 0, 255));
								break;
							case 3:
								btn3.setForeground(new Color(255, 255, 255));
								btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn3.setBackground(new Color(0, 0, 255));
								break;
							case 4:
								btn4.setForeground(new Color(255, 255, 255));
								btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn4.setBackground(new Color(0, 0, 255));
								break;
							case 5:
								btn5.setForeground(new Color(255, 255, 255));
								btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn5.setBackground(new Color(0, 0, 255));
								break;
							case 6:
								btn6.setForeground(new Color(255, 255, 255));
								btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn6.setBackground(new Color(0, 0, 255));
								break;
							case 7:
								btn7.setForeground(new Color(255, 255, 255));
								btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn7.setBackground(new Color(0, 0, 255));
								break;
							case 8:
								btn8.setForeground(new Color(255, 255, 255));
								btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn8.setBackground(new Color(0, 0, 255));
								break;
							case 9:
								btn9.setForeground(new Color(255, 255, 255));
								btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn9.setBackground(new Color(0, 0, 255));
								break;
							case 11:
								btn11.setForeground(new Color(255, 255, 255));
								btn11.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn11.setBackground(new Color(0, 0, 255));
								break;
							case 13:
								btn13.setForeground(new Color(255, 255, 255));
								btn13.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn13.setBackground(new Color(0, 0, 255));
								break;
							case 14:
								btn14.setForeground(new Color(255, 255, 255));
								btn14.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn14.setBackground(new Color(0, 0, 255));
								break;
							case 15:
								btn15.setForeground(new Color(255, 255, 255));
								btn15.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn15.setBackground(new Color(0, 0, 255));
								break;
							case 16:
								btn16.setForeground(new Color(255, 255, 255));
								btn16.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn16.setBackground(new Color(0, 0, 255));
								break;
							case 17:
								btn17.setForeground(new Color(255, 255, 255));
								btn17.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn17.setBackground(new Color(0, 0, 255));
								break;
							case 18:
								btn18.setForeground(new Color(255, 255, 255));
								btn18.setFont(new Font("Tahoma", Font.BOLD, 14));
								btn18.setBackground(new Color(0, 0, 255));
								break;
						}
					} else {
						comboBoxPinesDeEntradaConNombre.removeItemAt(1);
						comboBoxPinesDeEntradaConNombre.setEnabled(false);
						
						switch(numero) {
							case 12:
								btn12.setForeground(new Color(0, 0, 0));
								btn12.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn12.setBackground(new Color(240, 240, 240));
								break;
							case 13:
								btn13.setForeground(new Color(0, 0, 0));
								btn13.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn13.setBackground(new Color(240, 240, 240));
								break;
							case 14:
								btn14.setForeground(new Color(0, 0, 0));
								btn14.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn14.setBackground(new Color(240, 240, 240));
								break;
							case 15:
								btn15.setForeground(new Color(0, 0, 0));
								btn15.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn15.setBackground(new Color(240, 240, 240));
								break;
							case 16:
								btn16.setForeground(new Color(0, 0, 0));
								btn16.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn16.setBackground(new Color(240, 240, 240));
								break;
							case 17:
								btn17.setForeground(new Color(0, 0, 0));
								btn17.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn17.setBackground(new Color(240, 240, 240));
								break;
							case 18:
								btn18.setForeground(new Color(0, 0, 0));
								btn18.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn18.setBackground(new Color(240, 240, 240));
								break;
							case 19:
								btn19.setForeground(new Color(0, 0, 0));
								btn19.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn19.setBackground(new Color(240, 240, 240));
								break;
						}
						
						switch(entrada) {
							case 1:
								btn1.setForeground(new Color(0, 0, 0));
								btn1.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn1.setBackground(new Color(240, 240, 240));
								break;
							case 2:
								btn2.setForeground(new Color(0, 0, 0));
								btn2.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn2.setBackground(new Color(240, 240, 240));
								break;
							case 3:
								btn3.setForeground(new Color(0, 0, 0));
								btn3.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn3.setBackground(new Color(240, 240, 240));
								break;
							case 4:
								btn4.setForeground(new Color(0, 0, 0));
								btn4.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn4.setBackground(new Color(240, 240, 240));
								break;
							case 5:
								btn5.setForeground(new Color(0, 0, 0));
								btn5.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn5.setBackground(new Color(240, 240, 240));
								break;
							case 6:
								btn6.setForeground(new Color(0, 0, 0));
								btn6.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn6.setBackground(new Color(240, 240, 240));
								break;
							case 7:
								btn7.setForeground(new Color(0, 0, 0));
								btn7.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn7.setBackground(new Color(240, 240, 240));
								break;
							case 8:
								btn8.setForeground(new Color(0, 0, 0));
								btn8.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn8.setBackground(new Color(240, 240, 240));
								break;
							case 9:
								btn9.setForeground(new Color(0, 0, 0));
								btn9.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn9.setBackground(new Color(240, 240, 240));
								break;
							case 11:
								btn11.setForeground(new Color(0, 0, 0));
								btn11.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn11.setBackground(new Color(240, 240, 240));
								break;
							case 13:
								btn13.setForeground(new Color(0, 0, 0));
								btn13.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn13.setBackground(new Color(240, 240, 240));
								break;
							case 14:
								btn14.setForeground(new Color(0, 0, 0));
								btn14.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn14.setBackground(new Color(240, 240, 240));
								break;
							case 15:
								btn15.setForeground(new Color(0, 0, 0));
								btn15.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn15.setBackground(new Color(240, 240, 240));
								break;
							case 16:
								btn16.setForeground(new Color(0, 0, 0));
								btn16.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn16.setBackground(new Color(240, 240, 240));
								break;
							case 17:
								btn17.setForeground(new Color(0, 0, 0));
								btn17.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn17.setBackground(new Color(240, 240, 240));
								break;
							case 18:
								btn18.setForeground(new Color(0, 0, 0));
								btn18.setFont(new Font("Tahoma", Font.PLAIN, 11));
								btn18.setBackground(new Color(240, 240, 240));
								break;
						}
					}
				}
			}
		});
		
		comboBoxPinesDeSalidaConEcuacionesDeSalida.setMaximumRowCount(9);
		comboBoxPinesDeSalidaConEcuacionesDeSalida.setModel(new DefaultComboBoxModel(new String[] {"Selecciona un pin de salida"}));
		comboBoxPinesDeSalidaConEcuacionesDeSalida.setBounds(10, 27, 418, 22);
		add(comboBoxPinesDeSalidaConEcuacionesDeSalida);
		
		JButton btnRealizarPrueba = new JButton("Realizar prueba");
		btnRealizarPrueba.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Serial.Tx("Hola");
			}
		});
		btnRealizarPrueba.setBounds(291, 513, 137, 23);
		add(btnRealizarPrueba);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, lblGAL16V8, lblPinesDeEntradaConNombre, comboBoxPinesDeEntradaConNombre, lblPinesDeSalidaConEcuacionesDeSalida, comboBoxPinesDeSalidaConEcuacionesDeSalida, btnRealizarPrueba}));
		
		this.contador_de_pines = contador_de_pines;
		
		this.pines_de_entrada = Arrays.copyOf(pines_de_entrada, contador_de_pines);
		this.pines_de_salida = Arrays.copyOf(pines_de_salida, pines_de_salida.length);
		
		this.nombre_de_pines_de_entrada = Arrays.copyOf(nombre_de_pines_de_entrada, contador_de_pines);
		this.nombre_de_pines_de_salida = Arrays.copyOf(nombre_de_pines_de_salida, nombre_de_pines_de_salida.length);
		
		this.operacion_de_pines_de_salida = Arrays.copyOf(operacion_de_pines_de_salida, operacion_de_pines_de_salida.length);
		this.nombre_operacion_de_pines_de_salida = Arrays.copyOf(nombre_operacion_de_pines_de_salida, nombre_operacion_de_pines_de_salida.length);
		
		JLabel lblPinDeEntradaSinComprobar = new JLabel("Pin de entrada sin comprobar");
		lblPinDeEntradaSinComprobar.setForeground(Color.BLUE);
		lblPinDeEntradaSinComprobar.setBounds(10, 513, 203, 14);
		add(lblPinDeEntradaSinComprobar);
		
		JLabel lblPinDeSalidaSinComprobar = new JLabel("Pin de salida sin comprobar");
		lblPinDeSalidaSinComprobar.setForeground(new Color(210, 105, 30));
		lblPinDeSalidaSinComprobar.setBounds(10, 527, 174, 14);
		add(lblPinDeSalidaSinComprobar);
		
		JLabel lblPinFuncionando = new JLabel("Pin funcionando");
		lblPinFuncionando.setForeground(new Color(0, 128, 0));
		lblPinFuncionando.setBounds(10, 540, 137, 14);
		add(lblPinFuncionando);
		
		JLabel lblPinSinFuncionar = new JLabel("Pin sin funcionar");
		lblPinSinFuncionar.setForeground(new Color(128, 0, 0));
		lblPinSinFuncionar.setBounds(10, 552, 137, 14);
		add(lblPinSinFuncionar);
		
		for(int contador = 0; contador < this.nombre_de_pines_de_salida.length; contador++) {
			comboBoxPinesDeSalidaConEcuacionesDeSalida.addItem(this.pines_de_salida[contador] + ". " + this.nombre_de_pines_de_salida[contador] + " = " + this.operacion_de_pines_de_salida[contador]);
			
			switch(this.pines_de_salida[contador]) {
				case 12:
					btn12.setVisible(true);
					break;
				case 13:
					btn13.setVisible(true);
					break;
				case 14:
					btn14.setVisible(true);
					break;
				case 15:
					btn15.setVisible(true);
					break;
				case 16:
					btn16.setVisible(true);
					break;
				case 17:
					btn17.setVisible(true);
					break;
				case 18:
					btn18.setVisible(true);
					break;
				case 19:
					btn19.setVisible(true);
					break;
			}
		}
		
		for(int contador = 0; contador < this.contador_de_pines; contador++) {
			switch(this.pines_de_entrada[contador]) {
				case 1:
					btn1.setVisible(true);
					break;
				case 2:
					btn2.setVisible(true);
					break;
				case 3:
					btn3.setVisible(true);
					break;
				case 4:
					btn4.setVisible(true);
					break;
				case 5:
					btn5.setVisible(true);
					break;
				case 6:
					btn6.setVisible(true);
					break;
				case 7:
					btn7.setVisible(true);
					break;
				case 8:
					btn8.setVisible(true);
					break;
				case 9:
					btn9.setVisible(true);
					break;
				case 11:
					btn11.setVisible(true);
					break;
				case 13:
					btn13.setVisible(true);
					break;
				case 14:
					btn14.setVisible(true);
					break;
				case 15:
					btn15.setVisible(true);
					break;
				case 16:
					btn16.setVisible(true);
					break;
				case 17:
					btn17.setVisible(true);
					break;
				case 18:
					btn18.setVisible(true);
					break;
			}
		}
		
		/*
		try {
            Serial = new ConexionSerialJrIng(9600, "COM11");
        } catch (PortInUseException | UnsupportedCommOperationException | IOException ex) {
            Logger.getLogger(JPanelVistaDeChip.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                String Mensaje = "";
                
                while(true) {
                    Mensaje = Serial.SerialRead();
                    
                    if(Mensaje != "") {
                    	JOptionPane.showMessageDialog(null, Mensaje);
                        Mensaje = "";
                    }
                }
            }
        }).start();
        */
	}
}
