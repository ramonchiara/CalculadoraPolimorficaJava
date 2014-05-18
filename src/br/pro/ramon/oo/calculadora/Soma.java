package br.pro.ramon.oo.calculadora;

public class Soma extends Operacao {

	@Override
	public double calcular(double n1, double n2) {
		return n1 + n2;
	}

	@Override
	public String getDescricao() {
		return "Soma";
	}

}
