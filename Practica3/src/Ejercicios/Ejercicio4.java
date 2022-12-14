package Ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {

		int importe = 4688; 
		
		int b200=0 , b100=0 , b50=0 , b20=0 , b10=0 , mon=0, bi; 
		
		// billetes de 200
		b200= (int)importe / 200 ; 
		
		
		if (importe % 200 !=0) {
		
			// billetes de 100 
			b100= (int) (importe%200) / 100 ; 
			
			// billetes de 50 
			b50 = (int) ((importe % 200 )%100 )/50 ; 
			
			// billetes de 20 
			b20= (int)  (((importe % 200 )%100 )%50)/20 ; 
			
			// billetes de 10 
			b10 = (int) ((((importe % 200 )%100 )%50)%20)/10 ;
			
			bi = (b200*200)+(b100*100)+(b50*50)+(b20*20)+(b10*10); 
			mon = (int) importe - bi; 
		}
		
		System.out.println( b200+" De 200 ");
		System.out.println( b100+" de 100 ");
		System.out.println( b50+" de 50  ");
		System.out.println( b20+" de 20  ");
		System.out.println( b10+" de 10  ");
		System.out.println("Y sobran "+ mon +" euros ");

	}

}
