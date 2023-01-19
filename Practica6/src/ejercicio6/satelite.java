package ejercicio6;

public class satelite {

	private double meridiano ; 
	private double paralelo ; 
	private double distanciatierra;
	
	
	/*construc */
	public satelite(double meridiano, double paralelo, double distanciatierra) {
		super();
		this.meridiano = meridiano;
		this.paralelo = paralelo;
		this.distanciatierra = distanciatierra;
	}
	
	public satelite() {
		super();
		this.meridiano = 0;
		this.paralelo = 0;
		this.distanciatierra = 0;
	}
	
	
	
	public void setPosicion (double meridiano , double paralelo , double distanciatierra ){
		this.meridiano = meridiano;
		this.paralelo = paralelo;
		this.distanciatierra = distanciatierra;
		
	}	
	
	public void printPosicion() {
		System.out.print("El satélite se encuentra en ");
		System.out.print("el paralelo "+this.paralelo +" meridiano "+this.meridiano);
		System.out.print(" a una distancia de la Tierra de "+this.distanciatierra+" kms.");
		}
	
	
	/*metodo que cambia la altura del sat*/
	public void variAltura (double desplazamiento) {
		this.distanciatierra= this.distanciatierra+(desplazamiento); 
	}
	
	/*metodo que cambia la posicion del sat*/
	public void variaPosicion(double variap, double variam) {
		this.meridiano=this.meridiano+(variam); 
		this.paralelo=this.paralelo+(variap); 
	}
	
	/*metodo para saber si esta en orbita o no */
	public  boolean enOrbita () {
		
		if ( this.distanciatierra>0) {
			return true ;
			}
		
		return false ; 
	}
}





