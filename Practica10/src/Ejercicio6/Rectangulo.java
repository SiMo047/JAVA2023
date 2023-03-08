package Ejercicio6;

/*clase hija de triangulo (extends Triangulo)*/
public class Rectangulo extends Triangulo {
	
	
	/*constructores*/
	
	public Rectangulo() {
		super(); 
		
	}
	

	public Rectangulo(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}

	public Rectangulo(Triangulo otro) {
		super(otro);
		// TODO Auto-generated constructor stub
	}



/*este metodo area se hara suponiendo que lado1 es la hipotenusa */
@Override
	public double area() {
	
		return (this.lado2*this.lado3)/2;
	}


/*este metodo valido se hara suponiendo que lado1 es la hipotenusa */
	@Override
	public boolean validar() {
		/*Pitagoras*/
		if(Math.pow(this.lado1, 2)==Math.pow(this.lado2, 2)+Math.pow(this.lado3, 2)) {
			return true ; 
		}else {
			return false ; 
		}
	}

}
