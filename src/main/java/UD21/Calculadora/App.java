package UD21.Calculadora;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Controller controller = new Controller();
    
    	Vista vista = new Vista();
    	vista.setVisible(true);
    	
    	controller.setVista(vista);
    	controller.listenerNumberBtn();
    	controller.listenerMasButton();
    	controller.listenerEqualBtn();
    	controller.listenerMenosBtn();
    	controller.listenerMultiplicarBtn();
    	controller.listenerDividirBtn();
    	controller.listenerClearBtn();
    	controller.listenerBorrarBtn();
    	controller.listenerCeBtn();
    	controller.listenerRaizCuadradaBtn();
    	controller.listenerNumInversoBtn();
    	controller.listenerPorcentajeBtn();
    	controller.listenerAlCuadradoBtn();
    	controller.listenerPosNegBtn();
    	
    	
    }
}
