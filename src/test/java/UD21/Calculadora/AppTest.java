package UD21.Calculadora;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	Vista vista = new Vista();
	Controller controller = new Controller(vista);
	
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
    public void testSuma() {
    	controller.suma();
    	
    
    }
    
    @Test
    public void testResta() {
    	controller.resta();
    	
    
    }
    
    @Test
    public void testMultiplicacion() {
    	controller.multiplicacion();
    	
    
    }
    
    @Test
    public void testdivison() {
    	controller.division();
    	
    
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
    
    
    
    
    
    
}
