package Test;

public class Ejemploswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		char operador='a'; 
		
		double operando1 , operando2 , resultado ; 
		
		
		operando1=1; 
		operando2= 4 ; 
		operador='+';
		
		switch (operador) {
		case '+': { resultado=operando1+operando2 ; 
		System.out.println(resultado );
		}break; 
		case '-': { resultado=operando1-operando2 ; 
		System.out.println(resultado );
		}break; 
		case '*': { resultado=operando1*operando2 ; 
		System.out.println(resultado );
		}break; 
		case '/': { resultado=operando1/operando2 ; 
		System.out.println(resultado );
		}break; 
		case '%': { resultado=operando1%operando2 ; 
		System.out.println(resultado );
		}break; 
		case 's': { resultado=Math.sin(operando1) ; 
		System.out.println(resultado );
		}break; 
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + operador);
		}
		
	}

}
