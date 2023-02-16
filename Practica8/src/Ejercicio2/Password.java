package Ejercicio2;

public class Password {

	private int longitud=8; 
	private String contraseña ;
	
	
	
	/*constructor */
	
	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contraseña = generarConstraseña(this.longitud);
	} 
	
	
	/*constructor por defecto */
	
	public Password() {
		super();
		this.longitud = 8;
		this.contraseña = generarConstraseña(this.longitud);
	} 
	
	/*constructor copia */	
	
	public Password(Password otra) {
		super();
		this.longitud = otra.longitud;
		this.contraseña = generarConstraseña(this.longitud);
	} 
	
	
	
	
	private String generarConstraseña(int longitud) {
		StringBuilder sb = new StringBuilder (longitud);
		
		for (int i =0 ; i<longitud;i++) {
			sb.append((int)(Math.random()*10)); 
		}
		
		return toString(); 
		
	}
	
	
	
}
