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
			
			System.out.println("Operações disponíveis: ");
			for (int i = 0; i < operacoes.length; i++) {
				System.out.println(i + " - " + operacoes[i].getDescricao());
			}
			System.out.print("Qual a operação desejada: ");
			int opcao = Integer.parseInt(console.nextLine());
			
			Operacao escolhida = operacoes[opcao]; 
			double resultado = escolhida.executar();
			
			System.out.println(resultado);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Opção digitada não existe!");
		}
		catch(NumberFormatException ex) {
			System.out.println("Número digitado é inválido!");
		}
		catch(DivisaoPorZeroException ex) {
			System.out.println("Não pode dividir por zero!");
		}
		catch(NumeroNegativoException ex) {
			System.out.println("Não pode entrar com número negativo para essa operação!");
		}
	}

}
