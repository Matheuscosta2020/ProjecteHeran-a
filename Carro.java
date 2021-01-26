package funcoes;

import java.util.Random;

public class Carro {
	public int ano;
	public String cor;
	
	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);

	}
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}
	public void Acelerar() {
		System.out.println("VRUMMMMM.....");
	}
	public void Ligar() {
		System.out.println("Engine ON");
	}
	public void Desligar() {
		System.out.println("Engine OFF");
	}
}
