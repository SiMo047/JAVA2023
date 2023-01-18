package ejemploTieneUn;

public class jugador {

	private String nombre ; 
	private String clase ; 
	private int salud ; 
	
	
	private arma armade ; 
	private arma armaiz ;
	
	/*conStructor */
	
	public jugador(String nombre, String clase) {
		super();
		this.nombre = nombre;
		this.clase = clase;
		this.salud = 100;
		this.armade = null;
		this.armaiz = null ; 
	}


/*get y set */
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public arma getArmade() {
		return armade;
	}

	public void setArmade(arma armade) {
		this.armade = armade;
	}

	public arma getArmaiz() {
		return armaiz;
	}

	public void setArmaiz(arma armaiz) {
		this.armaiz = armaiz;
	}


	
	
	
	/*string */
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("jugador [nombre=");
		builder.append(nombre);
		builder.append(", clase=");
		builder.append(clase);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", armade=");
		builder.append(armade);
		builder.append(", armaiz=");
		builder.append(armaiz);
		builder.append("]");
		return builder.toString();
	} 
	
	
	
	public void quitarVida(int valor) {
		this.salud = this.salud - valor;
		if (this.salud == 0)
			System.out.println("Muerto " + this.nombre);
	}
	
	public void golpearDerecha(jugador otro) {
		
		if (this.armade == null) {
			otro.quitarVida(10);
		} else {
			otro.quitarVida(this.armade.getPotencia());
		}
	}
	
	public void golpearIzquierda(jugador otro) {
		
		if (this.armaiz == null) {
			otro.quitarVida(10);
		} else {
			otro.quitarVida(this.armaiz.getPotencia());
		}
	}
}
