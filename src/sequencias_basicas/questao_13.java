package sequencias_basicas;

import java.util.Scanner;

public class questao_13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario;
		
		System.out.print("Diga o valor do salario: R$");
		salario = ler.nextDouble();
		while(salario <= 0) {
			System.out.println("Salário inválido, digite novamente: ");
			salario = ler.nextDouble();
		}
		System.out.printf("Novo salário: R$%.2f", salario*1.15);
	}
}