package br.pro.ramon.oo.calculadora;

public class Divisao extends Operacao {

	@Override
	public double calcular(double[] n) {
		if (n[1] == 0) {
			throw new DivisaoPorZeroException();
		}
		
		return n[0] / n[1];
	}

	@Override
	public String getDescricao() {
		return "Divisão";
	}

	@Override
	public int getQuantidadeDeParametros() {
		return 2;
	}

}
