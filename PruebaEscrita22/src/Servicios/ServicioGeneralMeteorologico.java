package Servicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import modelos.EstacionMeteorologica;
import modelos.RegistrosDatosDia;

public class ServicioGeneralMeteorologico {

	
	private List <EstacionMeteorologica> estaciones ;

	
	
	public ServicioGeneralMeteorologico() {
		super();
		this.estaciones= new ArrayList <>();
	}



	@Override
	public String toString() {
		return "ServicioGeneralMeteorologico [estaciones=" + estaciones + "]";
	}



	/**
	 * @return the estaciones
	 */
	public List<EstacionMeteorologica> getEstaciones() {
		return estaciones;
	} 
	
	/*	METODOS  */
	
	public EstacionMeteorologica buscarPorId(int id) {
		
		return this.estaciones.parallelStream()
			.filter( em -> em.getId() == id)
			.findFirst()
			.orElse(null);		
	}
	
	public void nuevaEstacion(EstacionMeteorologica em) throws Exception {
		
		int posicion = this.estaciones.indexOf(em);
		
		if ( posicion <0) {
			this.estaciones.add(em);
		}else {
			throw new Exception("Esta estacion ya existe");
		}
		
	}
	
	
	
	public void eliminarEstacion (EstacionMeteorologica em) {
		this.estaciones.remove(em);
	}
	
	public EstacionMeteorologica buscarEstacion(String nombre) {
		
		
		return this.estaciones.stream()
			.filter(em-> em.getNombre().equals(nombre))
			.findFirst()
			.orElseThrow();
	}
	
	
	public List<RegistrosDatosDia> getTempPorEstacion(int id){
		
	return	this.estaciones.stream()
			.filter(em-> em.getId()==id)
			.flatMap(em->em.getRegistros().stream())
			.collect(Collectors.toList());
	
	/*otra opcion */
	
	/* EstacionMeteorologica emt = this.estaciones.stream()
			.filter( em -> em.getId() == id)
			.findFirst()
			.orElse(null);
		
		return emt.getLecturas().stream().collect(Collectors.toList());	*/
	
	}
	
	public List<RegistrosDatosDia> getTempPorAnioEstacion(int id, int anio){
		
		 return this.estaciones.stream()
			.filter(em -> em.getId()==id)
			.flatMap (em -> em.getRegistros().stream().filter(r-> r.getFecha().getYear()==anio))
			.collect(Collectors.toList());
	
		 /*otra opcion 
		 * 	EstacionMeteorologica emt = this.estaciones.stream()
			.filter( em -> em.getId() == id)
			.findFirst()
			.orElse(null);
		
		return emt.getLecturas().stream()
				.filter(rdd -> rdd.getFecha().getYear() == anio)
				.collect(Collectors.toList());	*/
		 
	}
	
	
	public  List<RegistrosDatosDia> getTempPorComunidad(String comunidad){
		
	 return	this.estaciones.stream()
			.filter(em -> em.getComunidad().equals(comunidad))  /*Para ordenarlo seria de esta manera pero ya esta ordenado de antes */
			.flatMap(em->em.getRegistros().stream()/*.sorted(Comparator.comparing(RegistrosDatosDia::getFecha))*/)
			.collect(Collectors.toList());
		
	}
	
	
	public RegistrosDatosDia getTempMaxRegistrada() {
		
		/*RegistrosDatosDia rd =this.estaciones.stream()
			.flatMap(em->em.getRegistros().stream())
			.collect(Collectors.maxBy(Comparator.comparing(RegistrosDatosDia::getTempMax)))
			.orElseThrow();
					
		return rd ; */
		
		/*A mi manera */
		List <RegistrosDatosDia>lista = this.estaciones.stream()
				.flatMap(em->em.getRegistros().stream())
				.collect(Collectors.toList());
		
		RegistrosDatosDia rd = lista.stream()
			.max(Comparator.comparing(RegistrosDatosDia::getTempMax))
			.orElseThrow();
		
	return rd ; 
	}	
	
	
	public Map<String, List<EstacionMeteorologica>> getEstacionesPorComunidad(){
		
		return this.estaciones.stream()
			.collect(Collectors.groupingBy(EstacionMeteorologica::getComunidad));
		
	}
	
	
	
	public boolean isTempMediaAlta() {
		
		List <RegistrosDatosDia>lista =this.estaciones.stream()
			.flatMap(em->em.getRegistros().stream())
			.collect(Collectors.toList());
		
		lista.stream()
		.filter(r ->r.getTempMedia()>30)
		.findAny();
		
		if (lista.size()>=0) {
			return true ;
		}
		return false;
		
	/*return this.estaciones.stream()
				.flatMap( em -> em.getLecturas().stream() )
				.anyMatch( rdd -> rdd.getTempMax() >= 30);
				*/	
	
	}
	
	
	
	/*
	public Map<String, Double> getTempMaxPorComunidad() {
		return this.estaciones.stream()
				.collect(Collectors.groupingBy(EstacionMeteorologica::getComunidad, em -> {
					RegistroDatosDia rddmax = em.getLecturas().stream()
							.collect(Collectors.maxBy( Comparator.comparing(RegistroDatosDia::getTempMax))).orElse(null);
					return rddmax.getTempMax();
				}));
	}
	*/
	
	
	public void borrarEstacionesComunidad(String comunidad) {
		this.estaciones.stream()
			.filter(em -> em.getComunidad().equals(comunidad))
			.forEach(em->this.eliminarEstacion(em));
	}
	
	
	public Map<String, Long> getNumRegistros() {
		return this.estaciones.stream()
			.collect(Collectors.groupingBy(EstacionMeteorologica::getComunidad, Collectors.counting()));
	}
}
