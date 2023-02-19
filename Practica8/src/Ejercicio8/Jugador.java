package Ejercicio8;

public class Jugador {

	private String nick; 
	private String clase;
	private int salud ; 
	private Arma arma;
	
	
	/*constructor */
	public Jugador(String nick, String clase, int salud) {
		super();
		this.nick = nick;
		this.clase = clase;
		this.salud = salud;
	}

/*get y set */
	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
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


	public Arma getArma() {
		return arma;
	}


	public void setArma(Arma arma) {
		this.arma = arma;
	}

	/*to string */
	
	@Override
	public String toString() {
		return "Jugador [nick=" + nick + ", clase=" + clase + ", salud=" + salud + ", arma=" + arma + "]";
	} 
	
	
	/*metodo que equipara un arma */
	public void equiparArma (Arma unArma) {
		this.setArma(unArma);
	}
	
	
	/*comprobar */
	public void golpear(Enemigo enem) {
		
		
		if (this.arma==null || arma.getBalas()==0) {
			enem.setSalud(enem.getSalud()-20);
		}else {
			enem.setSalud(enem.getSalud()-arma.getDaño());
			arma.setBalas(arma.getBalas()-1);
			
		}
	}
	
	
	
	
}
