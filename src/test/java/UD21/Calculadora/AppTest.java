package UD21.Calculadora;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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
    
    @ParameterizedTest
    @ValueSource(strings = {"+", "-", "/", "*", "30"})
    public void testOnEqualBtnClick(String operador) {
    	controller.setOperador(operador);
    	controller.onEqualBtnClick();
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"a", "5", "5.5", "0.5", "-30"})
    public void testMasBtnClick(String candidate) {
    	controller.setSecuencia(candidate);
    	controller.onMasBtnClick();
    	assertEquals(controller.getOperador(), "+");
    	assertEquals(controller.getSecuencia(), "");
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"a", "5", "5.5", "0.5", "-30"})
    public void testMenosBtnClick(String candidate) {
    	controller.setSecuencia(candidate);
    	controller.onMenosBtnClick();
    	assertEquals(controller.getOperador(), "-");
    	assertEquals(controller.getSecuencia(), "");
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"a", "5", "5.5", "0.5", "-30"})
    public void testMultiplicarBtnClick(String candidate) {
    	controller.setSecuencia(candidate);
    	controller.onMultiplicarBtnClick();
    	assertEquals(controller.getOperador(), "*");
    	assertEquals(controller.getSecuencia(), "");
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"a", "5", "5.5", "0.5", "-30", "0"})
    public void testDividirBtnClick(String candidate) {
    	controller.setSecuencia(candidate);
    	controller.onDividirBtnClick();
    	assertEquals(controller.getOperador(), "/");
    	assertEquals(controller.getSecuencia(), "");
    }
    
    
    @Test
    public void testClearBtnClick() {
    	controller.onClearBtnClick();
    	assertEquals(0, controller.getOperando1(), 0);
    	assertEquals(0, controller.getOperando2(), 0);
    	assertEquals(controller.getSecuencia(), "");
    }
    
//    @ParameterizedTest
//    @ValueSource(strings = {"a", "5", "5.5", "0.5", "-30", "0"})
//    public void testBorrarBtnClick(String candidate) {
//    	controller.setSecuencia(candidate);
//    	controller.onDividirBtnClick();
//    	assertEquals(controller.getOperador(), "/");
//    	assertEquals(controller.getSecuencia(), "");
//    }
    
    @Test
    public void testBorrarBtnClick() {
    	controller.setSecuencia("334");
    	controller.onBorrarBtnClick();
    	assertEquals(controller.getSecuencia(), "33");
    }
    
    @Test
    public void testBorrarBtnClick2() {
    	controller.setSecuencia("");
    	controller.onBorrarBtnClick();
    	assertEquals(controller.getSecuencia(), "");
    }
    
    @Test
    public void testCeBtnClick() {
    	controller.setSecuencia("123");
    	controller.onCeBtnClick();
    	assertEquals(controller.getSecuencia(), "0");
    }
    
    
    
    
}
