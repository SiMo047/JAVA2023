package ejercicio4;

public class finanzas {

	private double cambio;

	
	/*construc*/
	

	public finanzas(double cambio) {
		super();
		this.cambio = cambio;
	} 
	
	
	public finanzas() {
		super();
		this.cambio = 1.36;
	}



	
	/*metodos*/
	
	public double getCambio() {
		return cambio;
	}


	public void setCambio(double cambio) {
		this.cambio = cambio;
	} 
	
	
	
	public double dolaresToEuros(double dolares) {
		
		double euros ; 
		
		euros = dolares * this.cambio ; 
		
		return euros ; 
		
		
	}
	
	public double eurosToDolares(double euros){
		
		double dolar ; 
		
		dolar = euros * this.cambio ; 
		
		return dolar ; 
		
		
	}


	
	

	
}
