package sequencias_basicas;

import java.util.Scanner;

public class questao_16 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double qntCigarroPorDia, anosFumados, minutosPerdidos, diasPerdidos;
		
		System.out.print("Quantos cigarros por dia: ");
		qntCigarroPorDia = ler.nextDouble();
		while(qntCigarroPorDia < 0) {
			System.out.println("Valor inválido!");
			System.out.print("Quantos cigarros por dia: ");
			qntCigarroPorDia = ler.nextDouble();
		}
		System.out.print("Quantos anos fumando: ");
		anosFumados = ler.nextDouble();
		while(anosFumados < 0) {
			System.out.println("Valor inválido!");
			System.out.print("Quantos anos fumando: ");
			anosFumados = ler.nextDouble();
		}
		
		minutosPerdidos = (qntCigarroPorDia * (anosFumados*365))*10;
		diasPerdidos = (minutosPerdidos/60)/24;
		
		System.out.printf("Dias de vida perdidos: %.0f", diasPerdidos);
	}

}
