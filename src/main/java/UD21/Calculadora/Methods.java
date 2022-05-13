package UD21.Calculadora;

import java.awt.event.ActionEvent;



public class Methods {
	
	private double operador1 = 0;
	private double operador2 = 0;

	public String secuencia = "";
	public String operador = "";
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	if (e.getSource() == btn_1) {
		txtField_pantalla.setText("1");
		secuenciaNum("1");
		
	}
	else if (e.getSource() == btn_2) {
		txtField_pantalla.setText("2");
		secuenciaNum("2");
	}
	
	else if (e.getSource() == btn_mas) {
		txtField_pantalla.setText("");
		recogerPrimerOperador("+");
		
	}
	
	
	public void secuenciaNum(String numero) {
		secuencia += numero;
		txtField_pantalla.setText(secuencia);
		

	}
	
	public void recogerPrimerOperador(String operacion) {
		
		
		try {
			double operador1 = Double.parseDouble(txtField_pantalla.getText()); 
			 operador = operacion;
			 System.out.println(operador1 + operador);
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
		
	
	}
	
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


