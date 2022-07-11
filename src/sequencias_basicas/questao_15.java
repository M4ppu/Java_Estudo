package sequencias_basicas;

import java.util.Scanner;

public class questao_15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double dias, salario;
		
		System.out.print("Dias trabalhados: ");
		dias = ler.nextInt();
		while(dias < 0) {
			System.out.print("Dias inválidos! Dias trabalhados: ");
			dias = ler.nextInt();
		}
		salario = (dias*8)*25;
		
		System.out.printf("Salário: R$%.2f", salario);
	}
}