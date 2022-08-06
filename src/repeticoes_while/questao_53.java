package repeticoes_while;

import java.util.Scanner;

public class questao_53 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i = 0, homem = 0, mulher = 0, somaIdade = 0, somaIdadeH = 0, qntIdade20maisM = 0;
		while(i != 5) {
			i++;
			System.out.println("\nCadastro " + i);
			System.out.println("M - Mulher");
			System.out.println("H - Homem");
			System.out.print("Escolha sua opção: ");
			String sexo = read.next().toLowerCase();
			System.out.print("Diga sua idade: ");
			int idade = read.nextInt();
			if(sexo.equals("m")) {
				mulher++;
				if(idade > 20)
				qntIdade20maisM	++;
			}
			if(sexo.equals("h")) {
				homem++;
				somaIdadeH += idade;
			}
			somaIdade += idade;
		}
		double mediaIdade = somaIdade/5;
		double mediaIdadeH = somaIdadeH/homem;
		System.out.println("Quantidade de mulheres: " + mulher);
		System.out.println("Quantidade de homens: " + homem);
		System.out.printf("\nMédia das idades cadastradas: %.2f\n", mediaIdade);
		System.out.printf("\nMédia da idade dos homens: %.2f\n", mediaIdadeH);
		System.out.println("Quantidade de mulheres com mais de 20 anos: " + qntIdade20maisM);
	}
}