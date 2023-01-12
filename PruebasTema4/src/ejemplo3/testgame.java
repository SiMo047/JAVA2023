package ejemplo3;

public class testgame {

	public static void main(String[] args) {

		Enemigo en1 = new Enemigo("Rafa","Monkey",250);

		Enemigo en2 = new Enemigo("Carla","Goat",100);
		
		System.out.println(Enemigo.numenemigos);
		System.out.println(en1);
		System.out.println(en2);
		
		/*subir nivel del en1 7 veces con un bucle */
		for(int i = 0 ; i<7 ; i++) {
			en1.levelup();
		}
		
		/*subir nivel del en2 3 veces con un bucle */
		for(int i = 0 ; i<3 ; i++) {
			en2.levelup();
		}
	
		/*aqui utlizamos el metodo creado para quitar salud al en1 */
		en1.recibirdamage(800);
		
		
		System.out.println(en1);
		System.out.println(en2);
		
		System.out.println(Enemigo.numenemigos);
		
	}

}
