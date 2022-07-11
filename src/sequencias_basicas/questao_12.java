package sequencias_basicas;

import java.util.Scanner;

public class questao_12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double produto;
		
		System.out.print("Diga o valor do produto: R$");
		produto = ler.nextDouble();
		while(produto <= 0) {
			System.out.println("Valor inválido, digite novamente: ");
			produto = ler.nextDouble();
		}
		System.out.printf("Valor do produto com desconto: R$%.2f", produto*0.95);
	}
}