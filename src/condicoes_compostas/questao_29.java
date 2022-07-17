package condicoes_compostas;

import java.util.Scanner;

public class questao_29 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		double salario, novoSalario;
		int anosDeTrab;
		
		System.out.print("Nome: ");
		nome = ler.next();
		System.out.print("Salário: ");
		salario = ler.nextDouble();
		System.out.println("Anos de empresa: ");
		anosDeTrab = ler.nextInt();
		
		if(anosDeTrab <= 3)
			novoSalario = salario * 1.03;
		else if(anosDeTrab >3 && anosDeTrab <= 10)
			novoSalario = salario * 1.125;
		else
			novoSalario = salario * 1.2;
		
		System.out.printf("Novo salário: R$%.2f", novoSalario);		
	}
}