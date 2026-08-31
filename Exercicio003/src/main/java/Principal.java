public class Principal {
	public static void main (String[]args) {
		Veiculo carro = new Carro ();
		Veiculo bicicleta = new Bicicleta ();
		
		Pista pgitista = new Pista ();
		
		System.out.println(pista.iniciarCorrida(carro));
		System.out.println(pista.iniciarCorrida(bicicleta));
		
		System.out.println(carro.acelerar());
		System.out.println(bicicleta.acelerar());
	}
}
