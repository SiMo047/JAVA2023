package Ejercicio6;

public class Equilatero extends Triangulo {

	
	
	/*constructores*/
	
	
	public Equilatero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equilatero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}

	public Equilatero(Triangulo otro) {
		super(otro);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public double area() {
		
		return ((Math.sqrt(3)/4)*(Math.pow(this.lado1, 2)));
	}

	@Override
	public boolean validar() {
		
		if (this.lado1 == this.lado2 && this.lado1 == this.lado3) {
			return true;
		}
		else {
			return false;
		}
	}

}
