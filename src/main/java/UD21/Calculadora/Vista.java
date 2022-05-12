package UD21.Calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;

public class Vista extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private JTextField txtField_pantalla;
	
	private JButton btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0,  btn_pos_neg, btn_punto, btn_igual, btn_mas, btn_menos, 
	btn_multiplica, btn_division, btn_raiz_cuadrada, btn_al_cuadrado, btn_uno_x, boton_tanto_por_ciento, btn_c, btn_ce, btn_borrar;
	
	private double operador1 = 0;
	private double operador2 = 0;
	

	
	public Vista() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
		setBounds(100, 100, 475, 547);         
		contentPane = new JPanel();         
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));         
		setContentPane(contentPane);        
		contentPane.setLayout(null);
		
		txtField_pantalla = new JTextField();
		txtField_pantalla.setBounds(97, 38, 280, 60);
		contentPane.add(txtField_pantalla);
		txtField_pantalla.setColumns(10);
		//txtField_pantalla.setEditable(false);
		
		contentPane.setBackground(Color.LIGHT_GRAY);
		setTitle("Calculadora");
	
		
		btn_1 = new JButton("1");
		btn_1.addActionListener(this); 
		btn_1.setBackground(Color.GRAY);
		btn_1.setBounds(97, 363, 62, 45);
		contentPane.add(btn_1);
		
		btn_2 = new JButton("2");
		btn_2.addActionListener(this);
		btn_2.setBackground(Color.GRAY);
		btn_2.setBounds(170, 363, 62, 45);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBackground(Color.GRAY);
		btn_3.setBounds(242, 363, 62, 45);
		contentPane.add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBackground(Color.GRAY);
		btn_4.setBounds(97, 307, 62, 45);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBackground(Color.GRAY);
		btn_5.setBounds(169, 307, 62, 45);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBackground(Color.GRAY);
		btn_6.setBounds(242, 307, 62, 45);
		contentPane.add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBackground(Color.GRAY);
		btn_7.setBounds(97, 251, 62, 45);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBackground(Color.GRAY);
		btn_8.setBounds(170, 251, 62, 45);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBackground(Color.GRAY);
		btn_9.setBounds(242, 251, 62, 45);
		contentPane.add(btn_9);
		
		JButton btn_0 = new JButton("0");
		btn_0.setBackground(Color.GRAY);
		btn_0.setBounds(170, 419, 62, 45);
		contentPane.add(btn_0);
		
		JButton btn_pos_neg = new JButton("+/-");
		btn_pos_neg.setBackground(Color.GRAY);
		btn_pos_neg.setBounds(97, 419, 62, 45);
		contentPane.add(btn_pos_neg);
		
		JButton btn_punto = new JButton(".");
		btn_punto.setBackground(Color.GRAY);
		btn_punto.setBounds(242, 419, 62, 45);
		contentPane.add(btn_punto);
		
		JButton btn_igual = new JButton("=");
		btn_igual.setBackground(Color.GRAY);
		btn_igual.setBounds(315, 419, 62, 45);
		contentPane.add(btn_igual);
		
		JButton btn_mas = new JButton("+");
		btn_mas.setBackground(Color.GRAY);
		btn_mas.setBounds(315, 363, 62, 45);
		contentPane.add(btn_mas);
		
		JButton btn_menos = new JButton("-");
		btn_menos.setBackground(Color.GRAY);
		btn_menos.setBounds(315, 307, 62, 45);
		contentPane.add(btn_menos);
		
		JButton btn_multiplica = new JButton("X");
		btn_multiplica.setBackground(Color.GRAY);
		btn_multiplica.setBounds(315, 251, 62, 45);
		contentPane.add(btn_multiplica);
		
		JButton btn_division = new JButton("/");
		btn_division.setBackground(Color.GRAY);
		btn_division.setBounds(315, 195, 62, 45);
		contentPane.add(btn_division);
		
		JButton btn_raiz_cuadrada = new JButton("Raíz Cua");
		btn_raiz_cuadrada.setBackground(Color.GRAY);
		btn_raiz_cuadrada.setBounds(242, 195, 62, 45);
		contentPane.add(btn_raiz_cuadrada);
		
		JButton btn_al_cuadrdo = new JButton("x2");
		btn_al_cuadrdo.setBackground(Color.GRAY);
		btn_al_cuadrdo.setBounds(170, 195, 62, 45);
		contentPane.add(btn_al_cuadrdo);
		
		JButton btn_uno_x = new JButton("1/x");
		btn_uno_x.setBackground(Color.GRAY);
		btn_uno_x.setBounds(96, 195, 62, 45);
		contentPane.add(btn_uno_x);
		
		JButton btn_tanto_por_ciento = new JButton("%");
		btn_tanto_por_ciento.setBackground(Color.GRAY);
		btn_tanto_por_ciento.setBounds(96, 139, 62, 45);
		contentPane.add(btn_tanto_por_ciento);
		
		JButton btn_ce = new JButton("CE");
		btn_ce.setBackground(Color.GRAY);
		btn_ce.setBounds(169, 139, 62, 45);
		contentPane.add(btn_ce);
		
		JButton btn_c = new JButton("C");
		btn_c.setBackground(Color.GRAY);
		btn_c.setBounds(241, 139, 62, 45);
		contentPane.add(btn_c);
		
		btn_borrar = new JButton("Borrar");
		btn_borrar.addActionListener(this);
		btn_borrar.setBackground(Color.GRAY);
		btn_borrar.setBounds(315, 139, 62, 45);
		contentPane.add(btn_borrar);
	}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btn_1) {
			txtField_pantalla.setText("1");
			
		}
		
		else if (e.getSource() == btn_2) {
			txtField_pantalla.setText("2");
			System.out.println("dddd");
		}
		
			 
		}
		
		
		
		//Metodos
		
		public double suma() {
			double suma = 0;
			suma = operador1 + operador2;
			
			return suma;
			
		}
		
		public double resta() {
			double resta = 0;
			resta = operador1 - operador2;
			
			return resta;
		}
		
		public double multiplicacion() {
			double multiplicacion = 0;
			multiplicacion = operador1 * operador2;
			
			return multiplicacion;
		}
		
		public double division() {
			double division = 0;
			division = operador1/operador2;
			
			return division;
			
		}
}


