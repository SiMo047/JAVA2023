package Test;

public class Ejemploif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
 int diasemana ; 
 
 diasemana=7; 
 
 switch (diasemana) {
case 1: { System.out.println("Lunes");
	
	
} break; 

case 2 : {System.out.println("Martes");}
break; 
case 3 : {System.out.println("miercoles");}
break; 
case 4 : {System.out.println("jueves");}
break; 
case 5 : {System.out.println("viernes");}
break; 
case 6 : {System.out.println("sabado");}
break; 

case 7 : {System.out.println("domingo");}
break; 

default:
	throw new IllegalArgumentException("Unexpected value: " + diasemana);
}
	
	
		
	}

}
