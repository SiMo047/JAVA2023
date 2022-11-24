package Ejercicios;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in); 

System.out.println("Introduce un numero ");

int num , mun , u, d ,c ; 

num = Integer.parseInt(sc.nextLine());


u = num/100 ;
d = (num%100)/10 ; 
c = (num%100)%10 ; 

mun = (c*100)+(d*10)+u ; 

System.out.println("Este es tu numero del reves " +mun);

	}

}
