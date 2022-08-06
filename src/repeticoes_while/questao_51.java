package repeticoes_while;

import java.util.Scanner;

public class questao_51 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i = 0;
		double maiorPreco = 0, menorPreco = 0;
		while(i != 8) {
			i++;
			System.out.print("Diga o valor do produto " + i + " R$");
			double preco = read.nextDouble();
			if(preco > maiorPreco)
				maiorPreco = preco;
			if(menorPreco == 0)
				menorPreco = preco;
			if(menorPreco > preco)
				menorPreco = preco;			
		}
		System.out.printf("Maior preço: R$ %.2f", maiorPreco);
		System.out.printf("\nMenor preço: R$ %.2f", menorPreco);
	}
}