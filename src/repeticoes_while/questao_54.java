package repeticoes_while;

import java.util.Scanner;

public class questao_54 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double mediaAltura = 0, somaAltura = 0, pesoMais90 = 0, 
				pesoMenos50Altura160Menos = 0, pessoaAltura190MaisPeso100Mais = 0;
		int i = 0;
		while(i != 7) {
			i++;
			System.out.println("\tPessoa " + i);
			System.out.print("Altura: ");
			double altura = read.nextDouble();
			System.out.print("Peso: ");
			double peso = read.nextDouble();
			somaAltura += altura;
			if(peso > 90)
				pesoMais90++;
			if(peso < 50 && altura < 1.6)
				pesoMenos50Altura160Menos++;
			if(peso > 100 && altura > 1.9)
			pessoaAltura190MaisPeso100Mais++;
		}
		mediaAltura = somaAltura/i;
		System.out.printf("Média das alturas: %.2f\n", mediaAltura);
		System.out.printf("\nPessoas com mais de 90Kg: %.0f", pesoMais90);
		System.out.printf("\nPessoas que pesam menos de 50Kg tem menos de 1.60m: %.0f",pesoMenos50Altura160Menos);
		System.out.printf("\nPessoas que medem mais de 1.90m pesam mais de 100Kg: %.0f",pessoaAltura190MaisPeso100Mais);
	}
}