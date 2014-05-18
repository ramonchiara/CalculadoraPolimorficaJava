package br.pro.ramon.oo.calculadora;

public class Soma extends Operacao {

	@Override
	public double calcular(double[] n) {
		return n[0] + n[1];
	}

	@Override
	public String getDescricao() {
		return "Soma";
	}

	@Override
	public int getQuantidadeDeParametros() {
		return 2;
	}

}
