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
    public void testSuma() {
    	controller.suma();
    	
    
    }
    
    
    
    
    
    
}
