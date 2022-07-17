package condicoes_compostas;

import java.util.Scanner;

public class questao_37 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int anoDeEmpresa, genero;
		double salario, salarioFinal;
		String generoMH;
		final double MULHER_15MENOS = 1.05, MULHER15_20 = 1.12, MULHER_20MAIS = 1.23, 
				HOMEM_20MENOS = 1.03, HOMEM_20ATE30 = 1.13, HOMEM_30MAIS = 1.25;
		
		System.out.println("1 - Mulher");
		System.out.println("2 - Homem");
		System.out.print("Escolha seu gênero: ");
		genero = read.nextInt();
		while(genero != 1 && genero != 2) {
			System.out.println("Opção inválida");
			System.out.println("1 - Mulher");
			System.out.println("2 - Homem");
			System.out.print("Escolha seu gênero: ");
			genero = read.nextInt();
		}
		
		System.out.print("Salário atual: R$");
		salario = read.nextDouble();
		while(salario <= 0) {
			System.out.println("Entrada inválida");
			System.out.print("Salário atual: R$");
			salario = read.nextDouble();
		}
		System.out.print("Anos de empresa: ");
		anoDeEmpresa = read.nextInt();
		if(genero == 1) {
			generoMH = "Mulher";
			if(anoDeEmpresa < 15)
				salarioFinal = salario * MULHER_15MENOS;
			else if(anoDeEmpresa >= 15 && anoDeEmpresa <= 20)
				salarioFinal = salario * MULHER15_20;
			else
				salarioFinal = salario * MULHER_20MAIS;			
		}
		else {
			generoMH = "Homem";
			if(anoDeEmpresa < 20)
				salarioFinal = salario * HOMEM_20MENOS;
			else if(anoDeEmpresa >= 20 && anoDeEmpresa <= 30)
				salarioFinal = salario * HOMEM_20ATE30;
			else
				salarioFinal = salario * HOMEM_30MAIS;
		}	
		System.out.println();
		System.out.println("O genero escolhido foi: " + generoMH);
		System.out.printf("Antigo salário de: R$%.2f", salario);
		System.out.printf("\nO salário ficou em: R$%.2f", salarioFinal);
	}
}