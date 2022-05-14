package UD21.Calculadora;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	Vista vista = new Vista();
	Controller controller = new Controller();
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testgetOper() {
    	controller.setOperando1(0.0);
    	double resultado = controller.getOperando1();
    	double delta = 1;
    	assertEquals(resultado, 0.0, delta);
    	
    	
    }
    
    @Test
    public void testgetOper2() {
    	controller.setOperando2(0.0);
    	double resultado = controller.getOperando2();
    	double delta = 1;
    	assertEquals(resultado, 0.0, delta);
    	
    	
    }
    
    @Test
    public void testGetSecuencia() {
    	controller.setSecuencia("12");
    	String secuencia = controller.getSecuencia();
    	assertEquals(secuencia, "12");
    }
    
    @Test
    public void testGetOperador() {
    	controller.setOperador("11");
    	String operador = controller.getOperador();
    	assertEquals(operador, "11");
    }
    
    @Test
    public void testListener() {
    	controller.listenerNumberBtn();
    }
    
    
    @Test
    public void testListenerMasButton() {
    	controller.listenerMasButton();
    	
    }
    
    
    @Test
    public void testListenerMenosButton() {
    	controller.listenerMenosBtn();
    }
    
    @Test
    public void testOnEqualBtnClick() {
    	// Caso suma
    	controller.setOperador("+");
    	controller.onEqualBtnClick();
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"a"})
    public void testMasBtnClick(String candidate) {
    	controller.setSecuencia(candidate);
    	controller.onMasBtnClick();
    	assertEquals(controller.getOperador(), "+");
//    	assertEquals(controller.getSecuencia(), "");
    }
    
    
    
    
    
    
    
    
}
