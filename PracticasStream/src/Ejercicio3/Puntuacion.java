package Ejercicio3;

import java.util.Objects;

public class Puntuacion {

	
	private Integer puntos ; 
	private Integer partidasJugadas ; 
	private Integer partidasGanadas ; 
	private Integer partidasPerdidas;
	
	
	



	public Puntuacion(Integer puntos, Integer partidasJugadas, Integer partidasGanadas, Integer partidasPerdidas) {
		super();
		this.puntos = puntos;
		this.partidasJugadas = partidasJugadas;
		this.partidasGanadas = partidasGanadas;
		this.partidasPerdidas = partidasPerdidas;
	}



	public Integer getPuntos() {
		return puntos;
	}






	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}



	public Integer getPartidasJugadas() {
		return partidasJugadas;
	}



	public void setPartidasJugadas(Integer partidasJugadas) {
		this.partidasJugadas = partidasJugadas;
	}



	public Integer getPartidasGanadas() {
		return partidasGanadas;
	}



	public void setPartidasGanadas(Integer partidasGanadas) {
		this.partidasGanadas = partidasGanadas;
	}



	public Integer getPartidasPerdidas() {
		return partidasPerdidas;
	}



	public void setPartidasPerdidas(Integer partidasPerdidas) {
		this.partidasPerdidas = partidasPerdidas;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(puntos);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Puntuacion other = (Puntuacion) obj;
		return Objects.equals(puntos, other.puntos);
	}

	
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Puntuacion [puntos=");
		builder.append(puntos);
		builder.append(", PJ=");
		builder.append(partidasJugadas);
		builder.append(", PG=");
		builder.append(partidasGanadas);
		builder.append(", PP=");
		builder.append(partidasPerdidas);
		builder.append("]");
		return builder.toString();
	} 
	
	
	
	
	
}
