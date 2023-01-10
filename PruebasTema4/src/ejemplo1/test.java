package ejemplo1;

public class test {

	public static void main(String[] args) {
	
		bicicleta bici = new bicicleta(); 
		
		System.out.println(bici.marca);
		System.out.println(bici.precio);
		System.out.println(bici.material);
		System.out.println(bici.precioCondescuento());
	
		System.out.println();
		
		bicicleta bici2 = new bicicleta(true , "Orbea" , "Simano","Simano","Fox","Fibra de carbono",4500);
	
		System.out.println(bici2.marca);
		System.out.println(bici2.precio);
		System.out.println(bici2.material);
		System.out.println(bici2.precioCondescuento());
		
		bici2.precio=3000; 
		System.out.println(bici2.precio);

	}

}
