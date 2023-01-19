package Ejercicio1;

public class temperatura {

	
	
	/*metodos */
	
	public double celsiusToFarenheit(double celsi) {
		double f ; 
		
		f = (1.8)*celsi+32; 
		
		return f ; 
	}
	
	public double farenheitToCelsius(double faren) {
		double c; 
		
		c = (faren-32)/1.8; 
		return c ; 
	}
}
