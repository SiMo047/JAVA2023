package primeraevaluacion;

public class Ejercicio2 {
	
	public static void dado(int num) {
		int a=0 ,b=0,c=0,d=0,e=0,f=0;
		
			for (int i=0 ; i<num;i++) {
					
				int dado1= (int)(Math.random()*6+1); 
					
					if (dado1==1) {
						
						a=a+1; 
					}
					if (dado1==2) {
						
						b=b+1; 
					}
					if (dado1==3) {
						
						c=c+1; 
					}
					if (dado1==4) {
					
						d=d+1; 
					}
					if (dado1==5) {
						
						e=e+1; 
					}
					if (dado1==6) {
						
						f=f+1; 
					}
			
			}
			
		System.out.println("1-nveces "+a +" 2-nveces "+b+" 3-nveces "+c+" 4-nveces "+d+" 5-nveces "+e+" 6-nveces "+f);
	
		double cuent[]=new double[6]; 
		
	
		
		
		
	
	}

	public static void main(String[] args) {
		
		
		int suma=0; 
		int sumatotal=0; 
		int vecestira=0; 
		
		
		do {
			int dado1= (int)(Math.random()*6+1); 
			int dado2= (int)(Math.random()*6+1); 
			System.out.println(dado1+" "+dado2);
			suma=dado1+dado2;
			sumatotal=sumatotal+suma; 
			vecestira+=1;
		}while(suma!=12);
		
		System.out.println("Estan son la veces que se han tirado los dados "+vecestira);
		System.out.println("Esta es la suma de ambos dados hasta que ambos sacaron un 6 "+sumatotal);
		
		
		dado(5); 
	}

}
