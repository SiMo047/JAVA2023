package Ejercicio6;

public class Escaleno extends Triangulo {

	
	/*constructores*/
	public Escaleno(){
		super(); 
	}	
	
	
	
	
	public Escaleno(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}




	public Escaleno(Triangulo otro) {
		super(otro);
		// TODO Auto-generated constructor stub
	}




	@Override
	public double area() {
	
		double area ,s ; 
		
		s= (this.lado1+this.lado2+this.lado3)/2; 
		area = Math.sqrt(s*(s-this.lado1)*(s-this.lado2)*(s-this.lado3));
		
		return area;
	}

	@Override
	public boolean validar() {
		if (this.lado1 != this.lado2 && this.lado2 != this.lado3 && this.lado1 != this.lado3) {
			return true;
		}
		else {
			return false;
		}
	}

}
