package PracticaClase;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Pedido {

	enum Estado {RECIBIDO , PROCESADO , ENVIADO }; 
	
	private Long id ; 
	private LocalDate fechaEnvio ;
	private Estado estado; 
	private  Cliente cliente ; 
	private Set<Producto>productos ;
	
	
	
	public Pedido(Long id, LocalDate fechaEnvio, Estado estado, Cliente cliente) {
		super();
		this.id = id;
		this.fechaEnvio = fechaEnvio;
		this.estado = estado;
		this.cliente = cliente;
		this.productos= new TreeSet <>();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public LocalDate getFechaEnvio() {
		return fechaEnvio;
	}



	public void setFechaEnvio(LocalDate fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}



	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Set<Producto> getProductos() {
		return productos;
	}
	
	public void Hacerpedido (Producto p ) {
		this.productos.add(p);
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [id=");
		builder.append(id);
		builder.append(", fechaEnvio=");
		builder.append(fechaEnvio);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
