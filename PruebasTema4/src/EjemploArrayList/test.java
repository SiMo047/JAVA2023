package EjemploArrayList;

public class test {

	public static void main(String[] args) {

		
		
		Receta rc1 = new Receta("Pollo"); 
		
		 
		
		
		/*añadimos los ingredientes al arrayList */
		rc1.addingrediente( new Ingrediente("cebolla",1)); 
		rc1.addingrediente(new Ingrediente("Ajo",1) ); 
		rc1.addingrediente( new Ingrediente ("Patata",3));
		
		/*pintamos los ingredintes */
		
	/**	rc1.pintaringrediente();*/
		
		
		/*eliminar ingrediente */
		
		rc1.eliminaringre(new Ingrediente("Ajo",1) );
		
	/**	rc1.pintaringrediente();*/
		
		System.out.println(rc1);
	}

}
