package Test;

import java.util.Scanner;

public class Ej4 {
	
	public static double pedir(int cantidades[][], double precios[][], int codx, int cody) {
	double precio = 0;
		
		//Ver si hay cantidad suficiente
		if (cantidades[codx][cody] > 0) {
			cantidades[codx][cody]--;
			precio = precios[codx][cody];
		} else {
			System.out.println("No hay cantidad suficiente de esa golosina");
		}
		
		
		return precio;
	}
	
	public static void mostrar (String nombre[][],double precios[][]) {
		
		for (int i=0 ; i<nombre.length;i++) {
			for(int j=0 ; j<nombre[i].length;j++) {
				System.out.println("codigo: "+i+"-"+j+"  "+nombre[i][j]+" "+precios[i][j]+"$");
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		
		//Nombres de las golosinas 4x4
				String nombresGolosinas [][]= {/*<<<<<importante al ser matriz se engloba todo en {} y despues creas los arrays de string*/
						{"KitKat", "Chicles fresa", "Lacasitos", "Palotes"},
						{"Kinder Bueno", "Haribo", "Chetoos", "Twix"},
						{"Risketos", "M&M'S", "Mars", "Chicles menta"},
						{"Doritos", "Palomitas", "Gusanitos", "Lays"}
			/*>>>*/	};
				
				//Precios de las golosinas 4*4
				double precios[][] = {
						{1.1, 0.8, 1.5, 0.9},
						{1.8, 1, 1.2, 1},
						{1.8, 1.3, 1.2, 0.8},
						{1.5, 1.1, 1.1, 1.1}
				};
				
				//Cantidad de cada golosina en la máquina 4*4
				int cantidades[][] = {
						{5, 5, 5, 5},
						{5, 5, 5, 5},
						{5, 5, 5, 5},
						{5, 5, 5, 5}
				};
				
				
				/*Menu maquina */
				Scanner sc = new Scanner(System.in);
				int opcion =0 ;
				int codigo =0 ;
				double ventas=0 ; 
				String contraseña=" ";
				int codx=0; 
				int cody=0; 
				
				
				do {
					System.out.println("1. Pedir golosina");
					System.out.println("2. Mostrar golosinas");
					System.out.println("3. Rellenar golosina");
					System.out.println("4. Apagar máquina");
					opcion = Integer.parseInt(sc.nextLine());
					
					switch (opcion) {
					case 1: {
						System.out.println("OPCION == Pedir golosina");
						System.out.println("Introduce código de golosina xy");
						codigo=Integer.parseInt(sc.nextLine());
						codx= codigo/10;
						cody=codigo%10;
						
						ventas = ventas+pedir(cantidades, precios, codx, cody);
						
					}break;
					case 2: {
						System.out.println("OPCION == Mostrar");
						mostrar(nombresGolosinas, precios);
						
					}break;
					case 3: {
						System.out.println("OPCION == Rellenar");
						System.out.println("Dime contraseña");
						contraseña = sc.nextLine();
						
						if (contraseña.compareTo("maquina")==0) {
							System.out.println("Introduce código de golosina xy");
							codigo = Integer.parseInt(sc.nextLine());
							codx = codigo / 10;
							cody = codigo % 10;
							cantidades[codx][cody]=5; 
						}else {
							System.out.println("codigo incorrecto");
						}
					}break;
					
					case 4: {
						System.out.println("Apagar");
						System.out.println("Antes de apagar has vendido " + ventas + "€");
						
					}break;
					
					}
					
				}while(opcion!=4); 
				

	}

}
