package modeloCarro;

import funcoes.Carro;

public class Ferrari {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 2020;
		ferrari.cor = "Preto";
		
		System.out.println("--- Ferrari ---");
		System.out.println("Cor: " + ferrari.cor);
		System.out.println("Ano: " + ferrari.ano);
		
		
		ferrari.Ligar();
		ferrari.Acelerar();
		ferrari.Desligar();

	}

}
