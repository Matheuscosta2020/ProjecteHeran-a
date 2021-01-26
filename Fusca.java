package modeloCarro;

import funcoes.Carro;

public class Fusca {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.ano = 1970;
		fusca.cor = "Azul";
		
		System.out.println("--- Fusca ---");
		System.out.println("Cor: " + fusca.cor);
		System.out.println("Ano: " + fusca.ano);
		
		
		fusca.Ligar();
		fusca.Acelerar();
		fusca.Desligar();

	}

}
