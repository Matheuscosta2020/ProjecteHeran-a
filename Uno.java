package modeloCarro;

import funcoes.Carro;

public class Uno {

	public static void main(String[] args) {
		Carro uno = new Carro(1999, "Vermelho");
		
		System.out.println("--- Fusca ---");
		System.out.println("Cor: " + uno.cor);
		System.out.println("Ano: " + uno.ano);
		
		
		uno.Ligar();
		uno.Acelerar();
		uno.Desligar();
	}

}
