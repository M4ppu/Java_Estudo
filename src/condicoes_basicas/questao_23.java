package condicoes_basicas;

import java.util.Scanner;

public class questao_23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int sexo;
		double valorCompra, valorFinal;
		
		System.out.print("Nome: ");
		nome = ler.next();
		
		System.out.println("1 - Feminino");
		System.out.println("2 - Masculino");
		System.out.print("Diga seu sexo: ");
		sexo = ler.nextInt();
		while(sexo != 1 && sexo != 2) {
			System.out.println("Sexo inválido!");
			System.out.println("1 - Feminino");
			System.out.println("2 - Masculino");
			System.out.print("Diga seu sexo: ");
			sexo = ler.nextInt();
		}
		System.out.print("Diga o valor da compra: ");
		valorCompra = ler.nextDouble();
		while(valorCompra < 0) {
			System.out.println("Valor inválido!");
			System.out.print("Diga o valor da compra: ");
			valorCompra = ler.nextDouble();
		}
		if(sexo == 1) {
			valorFinal = valorCompra * 0.87;
		}
		else {
			valorFinal = valorCompra * 0.95;
		}
		System.out.printf("O valor final da compra de %s foi de R$ %.2f", nome, valorFinal);
	}
}