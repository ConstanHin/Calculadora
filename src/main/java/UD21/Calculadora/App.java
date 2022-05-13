package UD21.Calculadora;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Controller controller = new Controller();
    
    	Vista vista = new Vista();
    	
    	controller.setVista(vista);
    	controller.setListnerBtn();
    	
    	vista.setVisible(true);
    	
    }
}
