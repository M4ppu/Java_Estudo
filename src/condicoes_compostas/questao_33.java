package condicoes_compostas;

import java.util.Scanner;

public class questao_33 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, valorDaCasa, valorEmprestimo, anosPagando, prestacao;
		final double PORCENTO = 1.3, MESES = 12;
		
		salario = ler.nextDouble();
		valorDaCasa = ler.nextDouble();
		anosPagando = ler.nextDouble();
		
		prestacao = valorDaCasa/(anosPagando * MESES);
		
		valorEmprestimo = salario * PORCENTO;
		
		if(prestacao <= valorEmprestimo)
			System.out.println("Sim");
		else
			System.out.println("não");		
	}
}