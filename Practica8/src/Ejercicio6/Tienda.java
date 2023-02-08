package Ejercicio6;

import java.util.ArrayList;
import Ejercicio5.Producto;

public class Tienda {

	private ArrayList<Producto>producto; 
	private double Totalventas ;
	
	/*constructor*/
	public Tienda () {
		this.producto = new ArrayList<>(); 
		this.Totalventas=0; 
	}

	/*get y set */
	public double getTotalventas() {
		return Totalventas;
	}

	public void setTotalventas(double totalventas) {
		Totalventas = totalventas;
	}
	
	
	public void añadirProducto(Producto producto ) {
		if(this.producto.indexOf(producto)<0) {
			this.producto.add(producto); 
		}
	}
	
	
	public void venderProducto (int identificador , int cantidad) {
		
		Producto vacio = new Producto ();
		vacio.setId(identificador);
		
		/*indexOf si no esta el producto devuelve -1 */
		int posicion = this.producto.indexOf(vacio);
		if (posicion>=0) {
			/*con .get(posicion) saca el objeto del array en la posicion que se le pasa  */
			Producto product = this.producto.get(posicion); 
			
			/*esta condición es para vender si hay suficientes unidades como cantidad o mas */
			if (product.getUnidadesDisponibles()>= cantidad) {
				product.vender(cantidad); 
				
		this.Totalventas+=(product.getPrecioUnitario()-(product.getPrecioUnitario()*product.getDescuento())*cantidad);
			}
		
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tienda [producto=");
		builder.append(producto);
		builder.append(", Totalventas=");
		builder.append(Totalventas);
		builder.append("]");
		return builder.toString();
	}

	

}
