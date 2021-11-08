package com.miorganizacion.simple.interprete.graficos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.util.Arrays;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;

public class JPanelVistaDeChip extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int contador_de_pines;
	
	private int [] pines_de_entrada;
	private int [] pines_de_salida;
	
	private String [] nombre_de_pines_de_entrada;
	private String [] nombre_de_pines_de_salida;
	
	private String [] operacion_de_pines_de_salida;
	private String [] nombre_operacion_de_pines_de_salida;

	/**
	 * Create the panel.
	 */
	public JPanelVistaDeChip(int contador_de_pines, int [] pines_de_entrada, int [] pines_de_salida, String [] nombre_de_pines_de_entrada, String [] nombre_de_pines_de_salida, String [] operacion_de_pines_de_salida, String [] nombre_operacion_de_pines_de_salida) {
		setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setVisible(false);
		btn1.setFocusable(false);
		btn1.setBounds(23, 181, 45, 23);
		add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setVisible(false);
		btn2.setFocusable(false);
		btn2.setBounds(49, 215, 45, 23);
		add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setVisible(false);
		btn3.setFocusable(false);
		btn3.setBounds(49, 244, 45, 23);
		add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setVisible(false);
		btn4.setFocusable(false);
		btn4.setBounds(49, 275, 45, 23);
		add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setVisible(false);
		btn5.setFocusable(false);
		btn5.setBounds(49, 304, 45, 23);
		add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setVisible(false);
		btn6.setFocusable(false);
		btn6.setBounds(49, 336, 45, 23);
		add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setVisible(false);
		btn7.setFocusable(false);
		btn7.setBounds(49, 369, 45, 23);
		add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setVisible(false);
		btn8.setFocusable(false);
		btn8.setBounds(49, 399, 45, 23);
		add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setVisible(false);
		btn9.setFocusable(false);
		btn9.setBounds(49, 429, 45, 23);
		add(btn9);
		
		JButton btn11 = new JButton("11");
		btn11.setVisible(false);
		btn11.setFocusable(false);
		btn11.setBounds(354, 463, 52, 23);
		add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setVisible(false);
		btn12.setFocusable(false);
		btn12.setBounds(354, 430, 52, 23);
		add(btn12);
		
		JButton btn13 = new JButton("13");
		btn13.setVisible(false);
		btn13.setFocusable(false);
		btn13.setBounds(354, 399, 52, 23);
		add(btn13);
		
		JButton btn14 = new JButton("14");
		btn14.setVisible(false);
		btn14.setFocusable(false);
		btn14.setBounds(354, 369, 52, 23);
		add(btn14);
		
		JButton btn15 = new JButton("15");
		btn15.setVisible(false);
		btn15.setFocusable(false);
		btn15.setBounds(354, 336, 52, 23);
		add(btn15);
		
		JButton btn16 = new JButton("16");
		btn16.setVisible(false);
		btn16.setFocusable(false);
		btn16.setBounds(354, 306, 52, 23);
		add(btn16);
		
		JButton btn17 = new JButton("17");
		btn17.setVisible(false);
		btn17.setFocusable(false);
		btn17.setBounds(354, 275, 52, 23);
		add(btn17);
		
		JButton btn18 = new JButton("18");
		btn18.setVisible(false);
		btn18.setFocusable(false);
		btn18.setBounds(354, 244, 52, 23);
		add(btn18);
		
		JButton btn19 = new JButton("19");
		btn19.setVisible(false);
		btn19.setFocusable(false);
		btn19.setBounds(354, 215, 52, 23);
		add(btn19);
		
		JLabel lblGAL16V8 = new JLabel("");
		lblGAL16V8.setBounds(10, 109, 418, 393);
		lblGAL16V8.setHorizontalAlignment(SwingConstants.CENTER);
		lblGAL16V8.setIcon(new ImageIcon(JPanelVistaDeChip.class.getResource("/com/miorganizacion/simple/interprete/graficos/img/GAL16V8.jpeg")));
		add(lblGAL16V8);
		
		JLabel lblPinesDeEntradaConNombre = new JLabel("Pines de entrada");
		lblPinesDeEntradaConNombre.setBounds(10, 60, 100, 14);
		add(lblPinesDeEntradaConNombre);
		
		JComboBox comboBoxPinesDeEntradaConNombre = new JComboBox();
		comboBoxPinesDeEntradaConNombre.setEnabled(false);
		comboBoxPinesDeEntradaConNombre.setModel(new DefaultComboBoxModel(new String[] {"Selecciona un pin de entrada"}));
		comboBoxPinesDeEntradaConNombre.setBounds(10, 76, 418, 22);
		comboBoxPinesDeEntradaConNombre.setMaximumRowCount(17);
		add(comboBoxPinesDeEntradaConNombre);
		
		JLabel lblPinesDeSalidaConEcuacionesDeSalida = new JLabel("Pines de salida");
		lblPinesDeSalidaConEcuacionesDeSalida.setBounds(10, 11, 100, 14);
		add(lblPinesDeSalidaConEcuacionesDeSalida);
		
		JComboBox comboBoxPinesDeSalidaConEcuacionesDeSalida = new JComboBox();
		comboBoxPinesDeSalidaConEcuacionesDeSalida.setMaximumRowCount(9);
		comboBoxPinesDeSalidaConEcuacionesDeSalida.setModel(new DefaultComboBoxModel(new String[] {"Selecciona un pin de salida"}));
		comboBoxPinesDeSalidaConEcuacionesDeSalida.setBounds(10, 27, 418, 22);
		add(comboBoxPinesDeSalidaConEcuacionesDeSalida);
		
		JButton btnRealizarPrueba = new JButton("Siguiente");
		btnRealizarPrueba.setBounds(336, 513, 92, 23);
		add(btnRealizarPrueba);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, lblGAL16V8, lblPinesDeEntradaConNombre, comboBoxPinesDeEntradaConNombre, lblPinesDeSalidaConEcuacionesDeSalida, comboBoxPinesDeSalidaConEcuacionesDeSalida, btnRealizarPrueba}));
		
		this.contador_de_pines = contador_de_pines;
		
		this.pines_de_entrada = Arrays.copyOf(pines_de_entrada, contador_de_pines);
		this.pines_de_salida = Arrays.copyOf(pines_de_salida, 8);
		
		this.nombre_de_pines_de_entrada = Arrays.copyOf(nombre_de_pines_de_entrada, contador_de_pines);
		this.nombre_de_pines_de_salida = Arrays.copyOf(nombre_de_pines_de_salida, 8);
		
		this.operacion_de_pines_de_salida = Arrays.copyOf(operacion_de_pines_de_salida, 8);
		this.nombre_operacion_de_pines_de_salida = Arrays.copyOf(nombre_operacion_de_pines_de_salida, 8);
		
		for(int contador = 0; contador < 8; contador++) {
			if(this.nombre_de_pines_de_salida[contador] == null) {
				continue;
			}
			comboBoxPinesDeSalidaConEcuacionesDeSalida.addItem(this.pines_de_salida[contador] + ". " + this.nombre_de_pines_de_salida[contador] + " = " + this.nombre_operacion_de_pines_de_salida[contador]);
			
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
	}
}
