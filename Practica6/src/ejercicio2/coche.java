package ejercicio2;

public class coche {

	
	/*prop */
	private int velocidad ;

	/*construc*/

	public coche(int velocidad) {
		super();
		this.velocidad = velocidad;
	} 
	
	
	 /*por defecto */
	public coche() {
		super();
		this.velocidad = 0;
	}

	
	
	/*metodos*/
	
	public int getVelocidad() {
		return velocidad;
	}
	
	
	public void acelerar ( int mas) {
		this.velocidad = this.velocidad + mas; 
	}
	
	public void frenar (int menos ) {
		this.velocidad = this.velocidad - menos ; 
	}


	
	
	/*string */
	

	@Override
	public String toString() {
		return "coche [velocidad=" + velocidad + "]";
	}
	
	
}
