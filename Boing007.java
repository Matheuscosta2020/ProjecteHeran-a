package modeloCarro;
import funcoes.Aviao;

public class Boing007{

	public static void main(String[] args) {
		Aviao boing007 = new Aviao();
		
		boing007.ano = 2015;
		boing007.cor = "Branco";
		boing007.invergadura = 11;
		
		System.out.println("--- Boing007 ---");
		System.out.println("Ano: " + boing007.ano);
		System.out.println("Cor: " + boing007.cor);
		System.out.println("Invergadura: " + boing007.invergadura);
		
		boing007.Ligar();
		boing007.decolar();
		boing007.aterrizar();
		boing007.Acelerar();
		boing007.Desligar();
	}

}
