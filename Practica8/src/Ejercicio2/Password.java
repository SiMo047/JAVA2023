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
	

	
	

/*get y set*/
	public String getContraseña() {
		return contraseña;
	}



	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

/*to string*/
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
	

	/* generar una contraseña aleatoria (letras,numeros,simbolos) pasandole la longitud que desea  de la contraseña  */
	
	private String generarConstraseña(int longitud) {
	
		final String letras ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~@_/+:";
		
		StringBuilder sb = new StringBuilder (longitud);
		
		int lo = letras.length();
		
		for (int i =0 ; i<longitud;i++) {
			
			sb.append(letras.charAt((int)(Math.random()*lo)));
		}
		
		return sb.toString(); 
		
	}
	
	/* metodo es fuerte que indica si la contraseña es segura o no TRUE si es fuerte FALSE si no */
	public boolean esFuerte () {
		
		String stri = this.contraseña; 
		
		int mayus=0; 
		int minus=0;
		int num=0; 
		int sim=0; 
		
		/*nos recorremos el String */
		for ( int i =0 ; i< stri.length();i++) {
			
			/*convertimos cada String a char y lo guardamos en una variable  */
			char ch = stri.charAt(i);
			
			
			if (Character.isUpperCase(ch)) {
				mayus++;
			}else if(Character.isLowerCase(ch)){
				minus++;
			}else if (Character.isDigit(ch)) {
				num++;
			}else {
				sim++;
			}
				
		}
		
		if ((stri.length()>=8) &&(mayus>=1) && (minus>2)&&(num>=2)&&(sim>=1)) {
			return true ; 
			}
			else {
				return false ; 
			}
		}
	
	
	



	
	
}
