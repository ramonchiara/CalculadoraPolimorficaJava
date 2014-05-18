package br.pro.ramon.oo.calculadora;

public class Exponenciacao extends Operacao {

	@Override
	public double calcular(double n1, double n2) {
		return Math.pow(n1, n2);
	}

	@Override
	public String getDescricao() {
		return "Exponenciação";
	}

}
