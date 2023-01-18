package ejemploTieneUn;

public class Partida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		jugador j1 = new jugador ("player1","Gat"); 
		jugador j2 = new jugador ("player2" , "Dog"); 
		
		
		j1.setArmade(new arma("Hacha grande", 50));
		j1.golpearDerecha(j2);
		j1.golpearIzquierda(j2);
		
		j2.setArmaiz(new arma("Pistola láser brutal", 250));
		j2.golpearIzquierda(j1);
		j2.golpearIzquierda(j1);
		
		System.out.println(j1);
		System.out.println(j2);		
	}

}
