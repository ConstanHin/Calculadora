package UD21.Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class NumberBtnListener implements ActionListener {

	private JTextField pantalla;
	private Controller controller;

	public NumberBtnListener(Controller controller) {
		// Pasar elemento pantalla
		this.controller = controller;
		this.pantalla = controller.getVista().getTxtField_pantalla();
		// Setea el operando 2
	}

	
	/**
	 * Al pulsar un boton numero muestra por pantalla y setea el operando2
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();

		secuenciaNum(btn.getText());

		// Setear operando 2
		controller.setOperando2(Double.parseDouble(controller.getSecuencia()));
	}

	public void secuenciaNum(String numero) {
		String secuencia = controller.getSecuencia() + numero;
		controller.setSecuencia(secuencia);
		pantalla.setText(secuencia);

	}

}
