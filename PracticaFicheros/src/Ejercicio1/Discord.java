package Ejercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class Discord {

	
	private Set <Gamer> gamers;
	
	
	
	
	
	public Discord() {
		super();
		this.gamers = new TreeSet<>();
		this.gamers= (Set<Gamer>) loadGamers();
	}



/*Metodo que le un archivo tipo .txt y apartir de ahi devuelve una lista de obj Gamer */

	public static List<Gamer> loadGamers() {
		
		/*leer fichero */
		Path fichero = Paths.get("src/Ejercicio1/gamers");
		
		/*creamos las listas */
		List <String> line = null ; /*esta para realizar la separcion de campos*/ 
		List <Gamer>gamers = null ; /*y esta para guardar el resultado final con los objetos*/
		
		
		try {
			
			/*leemos todas las lineas del fichero y las introducimos en la lista */
			line = Files.readAllLines(fichero);
					/*de esta manera utlizaremos el .map*/
			gamers = line.stream()
			.map (	l->{
					/*y aqui realizamos la separacion con .split()*/
				String[] d = l.split(";");
				
					return new Gamer(d[0],d[1],d[2],Nivel.valueOf(d[3]));
				})
			/*lo devolvemos en una lista (gamers)*/
			.collect(Collectors.toList());
		
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	return gamers;
		
	}
	
	/*Metodo que añade un Gamer a la coleccion */
	public void addGamer (Gamer g ) {
		this.gamers.add(g);
	}
	/*Metodo que elimina un Gamer de la coleccion */
	public void removeGamer ( Gamer g) {
		this.gamers.remove(g); 
	}
	
	/*devuelve un obj Gamer segun en el nick que le pases */
	public Gamer findGamer (String nick) {
		
		return this.gamers.stream()
			.filter(g -> g.getNick().equals(nick))
			.findFirst()
			.orElseGet(null);
		
	}
	
	/*metodo que muetra todos los gamers con su informacion */
	public List <Gamer> listGamers(){
		
		List<Gamer>gamers ; 
		
		gamers=this.gamers.stream()
		.collect(Collectors.toList());
		
		return gamers;
	}
	
	
	public static void saveGamers() {
		
		/*leer fichero */
		Path fichero = Paths.get("src/Ejercicio1/gamers");
		
		
		
	}
	
	
	
}
