package Setordenacion;



import java.util.ArrayList;
import java.util.Objects;

public class PersonajeAL {

	private String nombre ; 
	private int salud ; 
	private int mana ;
	private ArrayList<TipoArmadura>armadura;
	private Arma armaD; 
	private Arma armaI;

	
	
	public PersonajeAL(String nombre, int salud, int mana, Arma armaD, Arma armaI) {
		super();
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
		this.armadura = new ArrayList <>();
		this.armaD = armaD;
		this.armaI = armaI;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getSalud() {
		return salud;
	}



	public void setSalud(int salud) {
		this.salud = salud;
	}



	public int getMana() {
		return mana;
	}



	public void setMana(int mana) {
		this.mana = mana;
	}



	public Arma getArmaD() {
		return armaD;
	}



	public void setArmaD(Arma armaD) {
		this.armaD = armaD;
	}



	public Arma getArmaI() {
		return armaI;
	}



	public void setArmaI(Arma armaI) {
		this.armaI = armaI;
	}





	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonajeAL [nombre=");
		builder.append(nombre);
		builder.append(", salud=");
		builder.append(salud);
		builder.append(", mana=");
		builder.append(mana);
		builder.append(", armaD=");
		builder.append(armaD);
		builder.append(", armaI=");
		builder.append(armaI);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonajeAL other = (PersonajeAL) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
	public void addArmadura (TipoArmadura ar) {
		
		int posicion = this.armadura.indexOf(ar); 
		
		
		if (posicion>=0) {
			this.armadura.remove(posicion); 
		}else {
			this.armadura.add(ar); 
		}
		
	}
	
	
	
	public String listarArmaduraDFisico () {
		
		StringBuffer sb = new StringBuffer();
		for (TipoArmadura a :this.armadura) {
			
		
			sb.append("DefensaFisica ="); 
			sb.append(a.getDefensaFisica()); 
			sb.append("\n");
		}
		
		return sb.toString(); 
		
	}
	
	public String listarArmaduraDMagico () {
		
		StringBuffer sb = new StringBuffer();
		for (TipoArmadura a :this.armadura) {
	 
			sb.append(" DefensaMagica ="); 
			sb.append(a.getDefensaMagica()); 
			sb.append("\n");
		
		}
		
		return sb.toString(); 
		
	}
	
	
	public String listarArmaduraZona () {
		
		StringBuffer sb = new StringBuffer();
		for (TipoArmadura a :this.armadura) {
		
			sb.append(" Zona="); 
			sb.append(a.getZona()); 
			sb.append("\n");
		
		}
		
		return sb.toString(); 
		
	}
	
	
	
	
	
	
}
