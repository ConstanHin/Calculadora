package UD21.Calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller {

	// Attributes
	private Vista vista;
	private double operando1 = 0;
	private double operando2 = 0;
	private double resultado = 0;
	private String secuencia = "";
	private String operador = "";

	// Constructor
	public Controller() {
		
		// Add vista hacer la vista visible
		this.vista = new Vista();
		vista.setVisible(true);
		
		// Add listener a los botones
    	listenerNumberBtn();
    	listenerMasButton();
    	listenerEqualBtn();
    	listenerMenosBtn();
    	listenerMultiplicarBtn();
    	listenerDividirBtn();
    	listenerClearBtn();
    	listenerBorrarBtn();
    	listenerCeBtn();
    	listenerRaizCuadradaBtn();
    	listenerNumInversoBtn();
    	listenerPorcentajeBtn();
    	listenerAlCuadradoBtn();
    	listenerPosNegBtn();
    	listenerPuntoBtn();
	}

	// Setter
	public void setVista(Vista vista) {
		this.vista = vista;
	}

	// Metodos

	/**
	 * @return the vista
	 */
	public Vista getVista() {
		return vista;
	}

	/**
	 * @return the operando1
	 */
	public double getOperando1() {
		return operando1;
	}

	/**
	 * @param operando1 the operando1 to set
	 */
	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	/**
	 * @return the operando2
	 */
	public double getOperando2() {
		return operando2;
	}

	/**
	 * @param operando2 the operando2 to set
	 */
	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	/**
	 * @return the secuencia
	 */
	public String getSecuencia() {
		return secuencia;
	}

	/**
	 * @param secuencia the secuencia to set
	 */
	public void setSecuencia(String secuencia) {
		this.secuencia = secuencia;
	}

	/**
	 * @return the operando
	 */
	public String getOperador() {
		return operador;
	}

	/**
	 * @param operador the operando to set
	 */
	public void setOperador(String operador) {
		this.operador = operador;
	}

	// Anadir listeners a los botones

	// Anadir color de background a los botones

	public void listenerNumberBtn() {
		for (int i = 0; i < vista.botones.size(); i++) {
			JButton boton = vista.botones.get(i);
			boton.setBackground(Color.DARK_GRAY);
			boton.setForeground(Color.white);
			boton.addActionListener(new NumberBtnListener(this));

		}

	}

	public void listenerMasButton() {
		vista.btn_mas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					operador = "+";
					operando1 = Double.parseDouble(secuencia);
					secuencia = "";

				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Accion btn menos
	 */
	public void listenerMenosBtn() {
		vista.btn_menos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					operador = "-";
					operando1 = Double.parseDouble(secuencia);
					secuencia = "";

				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Accion btn multiplicar
	 */
	public void listenerMultiplicarBtn() {
		vista.btn_multiplica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					operador = "*";
					operando1 = Double.parseDouble(secuencia);
					secuencia = "";

				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Accion btn dividir
	 */
	public void listenerDividirBtn() {
		vista.btn_division.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					operador = "/";
					operando1 = Double.parseDouble(secuencia);
					secuencia = "";
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Ejecutar la operacion guardada del operador
	 */
	public void listenerEqualBtn() {
		vista.btn_igual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					switch (operador) {
					case "+":
						 resultado = operando1 + operando2;
						
						break;
					case "-":
						 resultado = operando1 - operando2;
						
						break;
					case "*":
						 resultado = operando1 * operando2;
						
						break;
					case "/":
						 resultado = operando1 / operando2;
						
						break;

					default:
						break;
					}
					
					
					String resultadoS = "" +resultado;
					operando1 = resultado;
					operando2 = 0;
					vista.getTxtField_pantalla().setText(resultadoS);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});
	}
	
	/**
	 * Accion btn clear
	 */
	public void listenerClearBtn() {
		vista.btn_c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					operando1 = 0;
					operando2 = 0;
					resultado = 0;
					secuencia = "";
					operador = "";
					vista.getTxtField_pantalla().setText("");
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	/**
	 * Accion btn borrar
	 */
	public void listenerBorrarBtn() {
		vista.btn_borrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					secuencia = secuencia.substring(0, secuencia.length()-1);
					
					operando2 = Double.parseDouble(secuencia);

					vista.getTxtField_pantalla().setText(secuencia);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Accion btn CE
	 */
	public void listenerCeBtn() {
		vista.btn_ce.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					secuencia = "0";
					
					operando2 = 0;

					vista.getTxtField_pantalla().setText(secuencia);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	
	/**
	 * Accion btn raiz cuadrada
	 */
	public void listenerRaizCuadradaBtn() {
		vista.btn_raiz_cuadrada.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					double resultado = Math.sqrt(operando2);
					
					String resString = "" +resultado;

					vista.getTxtField_pantalla().setText(resString);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Accion btn inverso
	 */
	public void listenerNumInversoBtn() {
		vista.btn_uno_x.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					double resultado = 1/operando2;
					
					String resString = "" +resultado;

					vista.getTxtField_pantalla().setText(resString);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Accion btn Porcentaje
	 */
	public void listenerPorcentajeBtn() {
		vista.btn_tanto_por_ciento.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					double resultado = operando2*0.01;
					
					String resString = "" +resultado;
					
					vista.getTxtField_pantalla().setText(resString);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Accion btn al cuadrado
	 */
	public void listenerAlCuadradoBtn() {
		vista.btn_al_cuadrdo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					double resultado = operando2*operando2;
					
					String resString = "" +resultado;
					
					vista.getTxtField_pantalla().setText(resString);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Accion btn positivo negativo
	 */
	public void listenerPosNegBtn() {
		vista.btn_pos_neg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					double resultado = operando2*-1;
					
					operando2 = resultado;
					
					String resString = "" +resultado;
					
					vista.getTxtField_pantalla().setText(resString);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	/**
	 * Accion btn punto
	 */
	public void listenerPuntoBtn() {
		vista.btn_punto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					if (secuencia.indexOf('.') < 0) {
						secuencia += ".";
					}
					
					
					vista.getTxtField_pantalla().setText(secuencia);
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
	}
	
	
	

	

}
