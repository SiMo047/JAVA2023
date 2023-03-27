package Test;

public class jss {
	public static String sustituirVocales(String cadena, char vocal) {
		  // Crear una nueva cadena donde se sustituirán las vocales
		  String nuevaCadena = "";

		  // Recorrer cada carácter de la cadena original
		  for (int i = 0; i < cadena.length(); i++) {
		    char caracter = cadena.charAt(i);
		    // Si el carácter es una vocal, sustituirlo por la vocal introducida como parámetro
		    if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
		        caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
		      nuevaCadena += vocal;
		    } else {
		      // Si no es una vocal, añadirlo tal cual a la nueva cadena
		      nuevaCadena += caracter;
		    }
		  }

		  // Devolver la nueva cadena
		  return nuevaCadena;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cadena ="Mi amiga Ana es prima de Eva y de Irene";
System.out.println(sustituirVocales(cadena,'a'));
	}

}
