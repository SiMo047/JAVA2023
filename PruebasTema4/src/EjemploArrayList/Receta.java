package EjemploArrayList;

import java.util.ArrayList;

public class Receta {

	private String nombre ; 
	private ArrayList<Ingrediente>ingredientes;

	
	
	public Receta(String nombre) {
		super();
		this.nombre = nombre;
		
		this.ingredientes = new ArrayList<>();
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	/*---------------------------------------------------*/
	
	public void pintaringrediente() {
		System.out.println("Receta de "+this.nombre);
		int cont=0; 
		for (Ingrediente in : this.ingredientes) {
			
			System.out.println(cont++ +" "+in);
			System.out.println();
		}
	}
	
	
	public void addingrediente(Ingrediente ingre) {
		ingredientes.add(ingre); 
	}
	
	
	public boolean eliminaringre(Ingrediente in) {
		int posi = this.ingredientes.indexOf(in); 
		
		if (posi>=0) {
			this.ingredientes.remove(posi);
			return true ; 
			}else {
				return false ; 
			}
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Receta: ");
		builder.append(nombre);
		builder.append("\n");
		for (Ingrediente i : this.ingredientes) {
			builder.append(i);
			builder.append("\n");
		}
		return builder.toString();
	}
	
	
	
	
	
	
}
