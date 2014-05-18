package br.pro.ramon.oo.calculadora;

public class Exponenciacao extends Operacao {

	@Override
	public double calcular(double[] n) {
		return Math.pow(n[0], n[1]);
	}

	@Override
	public String getDescricao() {
		return "Exponenciação";
	}

	@Override
	public int getQuantidadeDeParametros() {
		return 2;
	}

}
