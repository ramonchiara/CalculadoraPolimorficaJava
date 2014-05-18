package br.pro.ramon.oo.calculadora;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try {
			Scanner console = new Scanner(System.in);
			
			Operacao[] operacoes = new Operacao[] {
					new Soma(),
					new Subtracao(),
					new Multiplicacao(),
					new Divisao(),
					new RestoDaDivisao(),
					new Exponenciacao(),
					new Fatorial()
			};
			
			System.out.println("Opera��es dispon�veis: ");
			for (int i = 0; i < operacoes.length; i++) {
				System.out.println(i + " - " + operacoes[i].getDescricao());
			}
			System.out.print("Qual a opera��o desejada: ");
			int opcao = Integer.parseInt(console.nextLine());
			
			Operacao escolhida = operacoes[opcao]; 
			double resultado = escolhida.executar();
			
			System.out.println(resultado);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Op��o digitada n�o existe!");
		}
		catch(NumberFormatException ex) {
			System.out.println("N�mero digitado � inv�lido!");
		}
		catch(DivisaoPorZeroException ex) {
			System.out.println("N�o pode dividir por zero!");
		}
		catch(NumeroNegativoException ex) {
			System.out.println("N�o pode entrar com n�mero negativo para essa opera��o!");
		}
	}

}
