package UD21.Calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JPanel;

public class Vista extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtField_pantalla;
	
	public ArrayList<JButton> botones =  new ArrayList<JButton>();
	
	public JButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_pos_neg, btn_punto, btn_igual, btn_mas, btn_menos, 
	btn_multiplica, btn_division, btn_raiz_cuadrada, btn_al_cuadrdo, btn_uno_x, btn_tanto_por_ciento, btn_c, btn_ce, btn_borrar;
	

	

	// Constructor
	public Vista() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
		setBounds(100, 100, 475, 547);         
		contentPane = new JPanel();         
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));         
		setContentPane(contentPane);        
		contentPane.setLayout(null);
		
		// Pantalla
		txtField_pantalla = new JTextField();
		txtField_pantalla.setBounds(97, 38, 280, 60);
		contentPane.add(txtField_pantalla);
		txtField_pantalla.setColumns(10);
		//txtField_pantalla.setEditable(false);
		
		contentPane.setBackground(Color.LIGHT_GRAY);
		setTitle("Calculadora");
	
		
		btn_1 = new JButton("1");
		contentPane.add(btn_1);
		System.out.println(this);
		btn_1.setBounds(97, 363, 62, 45);
		botones.add(btn_1);
		
		btn_2 = new JButton("2");
		botones.add(btn_2);
		btn_2.setBounds(170, 363, 62, 45);
		contentPane.add(btn_2);
		
		btn_3 = new JButton("3");
		botones.add(btn_3);
		btn_3.setBounds(242, 363, 62, 45);
		contentPane.add(btn_3);
		
		btn_4 = new JButton("4");
		botones.add(btn_4);
		btn_4.setBounds(97, 307, 62, 45);
		contentPane.add(btn_4);
		
		btn_5 = new JButton("5");
		botones.add(btn_5);
		btn_5.setBounds(169, 307, 62, 45);
		contentPane.add(btn_5);
		
		btn_6 = new JButton("6");
		botones.add(btn_6);
		btn_6.setBounds(242, 307, 62, 45);
		contentPane.add(btn_6);
		
		btn_7 = new JButton("7");
		botones.add(btn_7);
		btn_7.setBounds(97, 251, 62, 45);
		contentPane.add(btn_7);
		
		btn_8 = new JButton("8");
		botones.add(btn_8);
		btn_8.setBounds(170, 251, 62, 45);
		contentPane.add(btn_8);
		
		btn_9 = new JButton("9");
		botones.add(btn_9);
		btn_9.setBounds(242, 251, 62, 45);
		contentPane.add(btn_9);
		
		btn_0 = new JButton("0");
		botones.add(btn_0);
		btn_0.setBounds(170, 419, 62, 45);
		contentPane.add(btn_0);
		
		btn_pos_neg = new JButton("+/-");
		btn_pos_neg.setBackground(Color.GRAY);
		btn_pos_neg.setBounds(97, 419, 62, 45);
		contentPane.add(btn_pos_neg);
		
		btn_punto = new JButton(".");
		btn_punto.setBackground(Color.GRAY);
		btn_punto.setBounds(242, 419, 62, 45);
		contentPane.add(btn_punto);
		
		btn_igual = new JButton("=");
		btn_igual.setBackground(Color.GRAY);
		btn_igual.setBounds(315, 419, 62, 45);
		contentPane.add(btn_igual);
		
		btn_mas = new JButton("+");
		btn_mas.setBackground(Color.GRAY);
		btn_mas.setBounds(315, 363, 62, 45);
		contentPane.add(btn_mas);
		
		btn_menos = new JButton("-");
		btn_menos.setBackground(Color.GRAY);
		btn_menos.setBounds(315, 307, 62, 45);
		contentPane.add(btn_menos);
		
		btn_multiplica = new JButton("X");
		btn_multiplica.setBackground(Color.GRAY);
		btn_multiplica.setBounds(315, 251, 62, 45);
		contentPane.add(btn_multiplica);
		
		btn_division = new JButton("/");
		btn_division.setBackground(Color.GRAY);
		btn_division.setBounds(315, 195, 62, 45);
		contentPane.add(btn_division);
		
		btn_raiz_cuadrada = new JButton("Raíz Cua");
		btn_raiz_cuadrada.setBackground(Color.GRAY);
		btn_raiz_cuadrada.setBounds(242, 195, 62, 45);
		contentPane.add(btn_raiz_cuadrada);
		
		btn_al_cuadrdo = new JButton("x2");
		btn_al_cuadrdo.setBackground(Color.GRAY);
		btn_al_cuadrdo.setBounds(170, 195, 62, 45);
		contentPane.add(btn_al_cuadrdo);
		
		btn_uno_x = new JButton("1/x");
		btn_uno_x.setBackground(Color.GRAY);
		btn_uno_x.setBounds(96, 195, 62, 45);
		contentPane.add(btn_uno_x);
		
		btn_tanto_por_ciento = new JButton("%");
		btn_tanto_por_ciento.setBackground(Color.GRAY);
		btn_tanto_por_ciento.setBounds(96, 139, 62, 45);
		contentPane.add(btn_tanto_por_ciento);
		
		btn_ce = new JButton("CE");
		btn_ce.setBackground(Color.GRAY);
		btn_ce.setBounds(169, 139, 62, 45);
		contentPane.add(btn_ce);
		
		btn_c = new JButton("C");
		btn_c.setBackground(Color.GRAY);
		btn_c.setBounds(241, 139, 62, 45);
		contentPane.add(btn_c);
		
		btn_borrar = new JButton("Borrar");
		btn_borrar.setBackground(Color.GRAY);
		btn_borrar.setBounds(315, 139, 62, 45);
		contentPane.add(btn_borrar);
	}





	/**
	 * @return the txtField_pantalla
	 */
	public JTextField getTxtField_pantalla() {
		return txtField_pantalla;
	}





	/**
	 * @param txtField_pantalla the txtField_pantalla to set
	 */
	public void setTxtField_pantalla(JTextField txtField_pantalla) {
		this.txtField_pantalla = txtField_pantalla;
	}
		
		

		

}


