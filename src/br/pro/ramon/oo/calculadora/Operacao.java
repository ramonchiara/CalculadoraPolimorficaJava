package br.pro.ramon.oo.calculadora;

import java.util.Scanner;

public abstract class Operacao {

	public abstract double calcular(double[] n);

	public abstract String getDescricao();
	
	public abstract int getQuantidadeDeParametros();

	public double executar() {
		Scanner console = new Scanner(System.in);
		
		int quantidade = getQuantidadeDeParametros();
		double[] entradas = new double[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.print("N" + (i + 1) + ": ");
			entradas[i] = Double.parseDouble(console.nextLine());
		}
		
		return calcular(entradas);
	}

}
