package br.pro.ramon.oo.calculadora;

public class Multiplicacao extends Operacao {

	@Override
	public double calcular(double[] n) {
		return n[0] * n[1];
	}

	@Override
	public String getDescricao() {
		return "Multiplicação";
	}

	@Override
	public int getQuantidadeDeParametros() {
		return 2;
	}

}
