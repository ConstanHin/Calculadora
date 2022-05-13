package UD21.Calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller {
	
	// Attributes
	private Vista vista;
	private double operador1 = 0;
	private double operador2 = 0;
	
	// Controller
	public Controller() {
	}
	
	// Setter
	public void setVista(Vista vista) {
		this.vista = vista;
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
	
	// Anadir listeners a los botones
	
	// Anadir color de background a los botones
	
	public void setListnerBtn() {
		for (int i = 0; i < vista.botones.size(); i++) {
			JButton boton =  vista.botones.get(i);
			boton.setBackground(Color.DARK_GRAY);
			boton.setForeground(Color.white);
			boton.addActionListener(new ListenerBtn(vista.getTxtField_pantalla()));
			
		}
		
	}


}
