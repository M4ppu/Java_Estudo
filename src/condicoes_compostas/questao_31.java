package condicoes_compostas;

import java.util.Scanner;

public class questao_31 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int pessoa1, pessoa2;
		
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.print("Primeiro jogador: ");
		pessoa1 = ler.nextInt();
		System.out.print("Segundo jogador: ");
		pessoa2 = ler.nextInt();
		
		
		if((pessoa1 == 1 && pessoa2 == 3)||(pessoa1 == 3 && pessoa2 == 2)||(pessoa1 == 2 && pessoa2 == 1)) {
			System.out.println("Primeiro jogador ganhou.");
		}
		else if((pessoa2 == 1 && pessoa1 == 3)||(pessoa2 == 3 && pessoa1 == 2)||(pessoa2 == 2 && pessoa1 == 1)) {
			System.out.println("Segundo jogador ganhou.");
		}
		else
			System.out.println("Empate!");
	}
}