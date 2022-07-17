package condicoes_compostas;

import java.util.Scanner;

public class questao_35 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int opcao, qntDias;
		double km, precoFinal;
		final double POPULAR_MENOS100 = 0.2, POPULAR_MAIS100 = 0.1, LUXO_MENOS100 = 0.3, LUXO_MAIS100 = 0.25;
		final int POPULAR_DIA = 90, LUXO_DIA = 150;
		String tipo;
		
		System.out.println("1 - Carro popular");
		System.out.println("2 - Carro de luxo");
		System.out.print("Escolha uma opção: ");
		opcao = read.nextInt();
		while(opcao != 1 && opcao != 2) {
			System.out.println("Opção inválida");
			System.out.println("1 - Carro popular");
			System.out.println("2 - Carro de luxo");
			System.out.print("Escolha uma opção: ");
			opcao = read.nextInt();
		}
		System.out.print("Dias com o carro: ");
		qntDias = read.nextInt();
		while(qntDias <= 0) {
			System.out.println("Entrada inválida");
			System.out.print("Dias com o carro: ");
			qntDias = read.nextInt();
		}
		System.out.print("Km rodados: ");
		km = read.nextDouble();
		if (opcao == 1) {
			tipo = "Carro popular";
			if(km >= 100)
				precoFinal = (POPULAR_DIA * qntDias) + (km * POPULAR_MENOS100);
			else
				precoFinal = (POPULAR_DIA * qntDias) + (km * POPULAR_MAIS100);
		}
		else {
			tipo = "Carro de luxo";
			if(km >= 100)
				precoFinal = (LUXO_DIA * qntDias) + (km * LUXO_MENOS100);
			else
				precoFinal = (LUXO_DIA * qntDias) + (km * LUXO_MAIS100);
		}
		System.out.println("O tipo escolhido foi: " + tipo);
		System.out.printf("O preço ficou em R$%.2f ", precoFinal);
	}
}