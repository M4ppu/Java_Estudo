package sequencias_basicas;

import java.util.Scanner;

public class questao_3 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String nome, mes;
		double salario;
		
		System.out.println("Nome: ");
		nome = keyboard.next();
		
		System.out.println("Mês atual: ");
		mes = keyboard.next();
		
		System.out.println("Salário: ");
		salario = keyboard.nextDouble();
		
		System.out.println("Nome do funcionário: " + nome);
		System.out.println("Salário: " + salario);
		System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario +  " em " + mes);		
	}
}