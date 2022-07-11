package condicoes_basicas;

import java.util.Scanner;

public class questao_18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoAtual, anoNascimento, idade;
		
		System.out.print("Ano que estamos: ");
		anoAtual = ler.nextInt();
		while(anoAtual<0) {
			System.out.println("Valor inválido!");
			System.out.print("Ano que estamos: ");
			anoAtual = ler.nextInt();
		}
		System.out.print("Seu ano de nascimento: ");
		anoNascimento = ler.nextInt();
		while(anoNascimento<0) {
			System.out.println("Valor inválido!");
			System.out.print("Seu ano de nascimento: ");
			anoNascimento = ler.nextInt();
		}
		
		idade = anoAtual - anoNascimento;
		
		if(idade<16) {
			System.out.println("Não pode votar!");
		}
		else {
			System.out.println("Pode votar!");
		}
	}
}