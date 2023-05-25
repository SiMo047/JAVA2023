package com.daw.servicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.daw.modelos.Hotel;
import com.daw.modelos.HotelPlaya;
import com.daw.modelos.HotelRural;
import com.daw.modelos.Reserva;

public class Buking {

	private List <Hotel>hoteles ;
	private Set <Reserva>reservas ; 
	
	
	
	
	
	
	public Buking() {
		super();
		this.hoteles= new ArrayList<>();
		this.reservas= new TreeSet <>();
	}
	
	public String listarHoteles() {
		StringBuffer sb = new StringBuffer();
		for (Hotel h : this.hoteles) {
			
			sb.append(h);
			sb.append("\n");
		}
		return sb.toString();	}
	
	/**
	 * Metodo que añade un hotel a la lista 
	 * @param h
	 * @throws Exception
	 */
	
	
	public void addHotel (Hotel h ) throws Exception {
		int posicion = this.hoteles.indexOf(h); 
		
		if ( posicion<0) {
			this.hoteles.add(h);
		}else {
			throw new Exception("Esta hotel ya existe");
		}
	}
	/**
	 * Metodo que borra el hotel de la lista 
	 * @param id
	 */
	public void deleteHotel (int id ) {
		
		Hotel h1= new Hotel();
		h1.setId(id);
		
		for (Hotel h : this.hoteles) {
			if (h.equals(h1)) {
				this.hoteles.remove(h);
			}
		}
	}
	
	/**
	 * Metodo que añade una reserva a lista(reservas) ,comprobando que el hotel esta en la lista(hoteles) 
	 * @param r
	 */
	public void addReserva (Reserva r ) {
		
		int posicion = this.hoteles.indexOf(r.getHotel());
		if (posicion>=0) {
		this.reservas.add(r);
		}
	}
	
	/**
	 * Metodo que borra la reserva de la lista (reservas)
	 */
	public void deleteReserva(int id) {
		
		for (Reserva r :this.reservas) {
			if (r.getId()==id) {
				this.reservas.remove(r);
			}
		}
	}
	
	/**
	 *Metodo que devuelve un hotel pasandole un id 
	 * @param id
	 * @return
	 */
	
	public Hotel findHotelById(int id) {
		
		return this.hoteles.stream()
			.filter(h-> h.getId()== id )
			.findFirst()
			.orElseThrow();
		
	}
	
	/**
	 * Metodo que devuelve una lista de hoteles de la provincia que le pasas 
	 */
	public List<Hotel> findHotelByProvincia(String provincia){
		
		return this.hoteles.stream()
			.filter(h->h.getProvincia().equals(provincia))
			.collect(Collectors.toList());
	}
	
	
	/**
	 * 	Metodo que devuelve una lista de hoteles que tengan menos de 20 habitaciones 
	 * ordenados de mayor a menor por precio 
	 */
	public List<Hotel> getHotelesPequeños(){
			
			return this.hoteles.stream()
				.filter(h->h.getNumHabitaciones()<=20)
				.sorted(Comparator.comparing(Hotel::getPrecionoche).reversed())
				.collect(Collectors.toList());
	}
	
	
	/**
	 * Metodo que devuelve 2 hoteles con los precios mas altos
	 */
	public List<Hotel> getHotelesCaros(){
		
		return this.hoteles.stream()
			.sorted(Comparator.comparing(Hotel::getPrecionoche))
			.limit(2)
			.collect(Collectors.toList());
	}
	
	/**
	 * Metodo que devuelve un los Hoteles agrupados por localidad 
	 * de mayor a menor precio 
	 */
	public Map<String, List<Hotel>> getHotelesLocalidad(){
		
		
	return	this.hoteles.stream()
			.sorted(Comparator.comparing(Hotel::getPrecionoche).reversed())
			.collect(Collectors.groupingBy(Hotel::getLocalidad));
			
			
	}
	/**
	 * Metodo que devuelve una lista de todos los hoteles que sean de playa 
	 * @return
	 */
	public Set<Hotel> getHotelesPlaya(){
	
		
			TreeSet t = new TreeSet<>();
			
			for (Hotel h : this.hoteles) {
				if (h instanceof HotelPlaya) {
					t.add(h);
				}
			}
			
			return t;
	}
	
	/**
	 * Metodo que devuelve una lista de todo los hoteles que sean rurales 
	 */
	public Set<Hotel> getHotelesRurales(){
		
		TreeSet t = new TreeSet<>();
		
		for (Hotel h : this.hoteles) {
			if (h instanceof HotelRural) {
				t.add(h);
			}
		}
		
		return t;
	}
	/**
	 * Metodo que devuelve un reserva pasandole un id 
	 * @param id
	 * @return
	 */
	
	public Reserva findReservaById(int id) {
		
		return this.reservas.stream()
			.filter(r->r.getId()==id)
			.findFirst()
			.orElseThrow();
	}
	
	/**
	 * Metodo que devuelve una lista con todas las reservas con el DNI que le pases 
	 */
	public List<Reserva> findReservaByDNI(String dni){
	
		return	this.reservas.stream()
			.filter(r->r.getDni().equals(dni))
			.collect(Collectors.toList());
	}
	
	/**
	 * Metodo que agrupa las reservas por pais y cuantas hay 
	 */
	public Map<String, Long> getReservasPais(){
		return this.reservas.stream()
			.collect(Collectors.groupingBy(Reserva::getNacionalidad,Collectors.counting()));
	}
	
	/**
	 * Metodo que devuelve las reservas con mas de 2 habitaciones
	 */
	
	public List<Reserva> getReservasGrandes(){
		return this.reservas.stream()
			.filter(r->r.getCantHabitaciones()>=2)
			.collect(Collectors.toList());
	}
	
	/**
	 * Metodo que devuelve las reservas ordenadas por fecha de entrada 
	 */
	public List<Reserva> getReservasOrdenadas(){
		
		return this.reservas.stream()
			.sorted(Comparator.comparing(Reserva::getFechaEntrada))
			.collect(Collectors.toList());
	}
	
	/**
	 * Metodo que devuelve el importe :
	 * 
	 * Coste = numeroHabitaciones x PrecioHabitacion x numeroDias 
	 */
	
	/*public double getImporteReserva(int idReserva) {
		this.reservas.stream()
			.filter(r->r.getId()==idReserva)
			.forEach(r->r.getCantHabitaciones()*r.getHotel().getPrecionoche()*r.);
			
	}*/
	
	public double getImporteReserva(int idReserva) {
		
		double precio=0 ;
		Reserva r1 = new Reserva ();
		  r1.setId(idReserva);
		for (Reserva r : this.reservas) {
			if(r.equals(r1)) {
				
					LocalDate inicio = r.getFechaEntrada();
					LocalDate fin = r.getFechaSalida();
					long dias = ChronoUnit.DAYS.between(inicio, fin);
				
				 precio =r.getCantHabitaciones()*r.getHotel().getPrecionoche()*dias;
			}
			
		
		}
		return precio ;
	
	}
	
	/**
	 * Metodo que devuelve todas las reservas de ese hotel cuya fecha de entrada sea igual o anterior 
	 * a la de hoy y la fecha salida se posterior o igual a la de hoy 
	 */
	
	/*public List<Reserva> getReservasActivas(int id){
		this.hoteles.stream()
			.filter(h->h.getId()==id)
		
			
	}*/
	
	
}
