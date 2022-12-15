package primeraevaluacion;

public class Ejercicio1 {
 
	public static String cambio(String cadena, String vocal) {

		String cadenanueva ="";
		char letra =' ';
		
		for (int i =0 ;i<cadena.length();i++) {
			 letra = cadena.charAt(i);
				
			  if ( (letra == 'a') || (letra == 'e') || (letra == 'o') || (letra == 'i') || (letra == 'u') ||
					 (letra == 'A') || (letra == 'E') || (letra == 'O') || (letra == 'I') || (letra == 'U')
				   ) {
				 
				  cadenanueva =cadenanueva+ vocal;	      
			  }				else {
				  			cadenanueva = cadenanueva+letra ;
			  }
		}
	
	
	return cadenanueva ;
		
	}
	
	
	public static void main(String[] args) {

		String frase= "Mi amiga Ana es prima de Eva y de Irene";
		
		String vocal="a";
		
		
			System.out.println(cambio(frase,vocal));
	
		
	}

}
