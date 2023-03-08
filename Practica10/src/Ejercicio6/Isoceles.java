package Ejercicio6;

public class Isoceles extends Triangulo {

	
	
	/*constructores*/
	
	public Isoceles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Isoceles(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}

	public Isoceles(Triangulo otro) {
		super(otro);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public double area() {
		double h , area; 

		h= Math.sqrt(this.lado1*this.lado2-(Math.pow(this.lado3, 2)/4));
		area = (this.lado3*h)/2;
		
		return area;
	}

	@Override
	public boolean validar() {
		if (this.lado1==this.lado2) {
			return true ; 
		}else {
		return false;
		}
	}

}
