package modelos;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EstacionMeteorologica {

	
	private long id ; 
	private String nombre ; 
	private String comunidad ;
	private double latitud ; 
	private double longitud ; 
	private Set <RegistrosDatosDia> registros ;
	
	
	public EstacionMeteorologica() {
		super();
	}


	public EstacionMeteorologica(long id, String nombre, String comunidad, double latitud, double longitud) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.comunidad = comunidad;
		this.latitud = latitud;
		this.longitud = longitud;
		this.registros= new TreeSet <>(Comparator.comparing(RegistrosDatosDia :: getFecha));
	  //this.registros = new TreeSet<>( (r1,r2) -> r1.getFecha().compareTo(r2.getFecha()) );
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the comunidad
	 */
	public String getComunidad() {
		return comunidad;
	}


	/**
	 * @param comunidad the comunidad to set
	 */
	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}


	/**
	 * @return the latitud
	 */
	public double getLatitud() {
		return latitud;
	}


	/**
	 * @param latitud the latitud to set
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}


	/**
	 * @return the longitud
	 */
	public double getLongitud() {
		return longitud;
	}


	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}


	/**
	 * @return the registros
	 */
	public Set<RegistrosDatosDia> getRegistros() {
		return registros;
	}


	@Override
	public String toString() {
		return "EstacionMeteorologica [id=" + id + ", nombre=" + nombre + ", comunidad=" + comunidad + ", latitud="
				+ latitud + ", longitud=" + longitud + ", registros=" + registros + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstacionMeteorologica other = (EstacionMeteorologica) obj;
		return id == other.id;
	}
	
	
	
	/*METODOS*/
	
	/**
	 * Añade un nuevo registro a la EstacionMeteorologica 
	 * @param rd
	 */
	
	public void nuevoRegistro (RegistrosDatosDia rd) {
		
		
		this.registros.add(rd);
	}
	/**
	 * Elimina un registro de la EstacionMeteorologica
	 * @param rd
	 */
	public void eliminarRegistro (RegistrosDatosDia rd) {
		this.registros.remove(rd);
	}
	/**
	 * Devuelve todos los registros de esta Estación Meteorológica que se tomaron a partir del día indicado
	 * @param fecha
	 * @return
	 */
	public List<RegistrosDatosDia> buscarRegistro(LocalDate fecha){
		
	return this.registros.stream()
	.filter(rd -> rd.getFecha().isAfter(fecha))
	.collect(Collectors.toList());
	
	}
}
