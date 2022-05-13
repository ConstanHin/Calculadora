package UD21.Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ListenerBtn implements ActionListener {
	
	private JTextField pantalla;

	public ListenerBtn(JTextField pantalla) {
		this.pantalla = pantalla;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		
		pantalla.setText(btn.getText());
		

	}

}
