package Ejercicio3;

import java.util.HashMap;

public class Usuario {

	private static int cont =0 ; 
	
	private Integer id ; 
	private String nombre ; 
	private String email; 
	private String nick ; 
	private HashMap<Juego,Puntuacion>puntuaciones ;
	
	
	public Usuario(String nombre, String email, String nick) {
		super();
		this.id=++cont;
		this.nombre = nombre;
		this.email = email;
		this.nick = nick;
		this.puntuaciones= new HashMap<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public Integer getId() {
		return id;
	}


	public HashMap<Juego, Puntuacion> getPuntuaciones() {
		return puntuaciones;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [Nick=");
		builder.append(nick);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	} 
	
	
	public void addPuntuacion (Juego juego , boolean haganado , Integer puntosObtenidos) {
		
		if (this.puntuaciones.containsKey(juego)==true) {
			
				Puntuacion p = this.puntuaciones.get(juego);
			
				if (haganado==true ) {
			
				this.puntuaciones.put(juego, new Puntuacion(puntosObtenidos + p.getPuntos(),p.getPartidasJugadas()+1,p.getPartidasGanadas()+1,p.getPartidasPerdidas()));
				
				}else {
				
					this.puntuaciones.put(juego, new Puntuacion (puntosObtenidos + p.getPuntos(), p.getPartidasJugadas()+1 , p.getPartidasGanadas(),p.getPartidasPerdidas()+1));
				}
			
			
			
		}else {
			
			if(haganado == true ) {
				this.puntuaciones.put(juego, new Puntuacion(puntosObtenidos,1,1,0) );
			
			}else {
				this.puntuaciones.put(juego, new Puntuacion(puntosObtenidos,1,0,1));
			}
			
			
			
		}
					
		
		
	}
	
	public Puntuacion getPuntuacion (Juego juego) {
		
		return this.puntuaciones.get(juego);
		
	}
	
	
	
	
	
	
	
	
}
