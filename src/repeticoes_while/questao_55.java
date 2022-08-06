package repeticoes_while;

import java.util.Random;
import java.util.Scanner;

public class questao_55 {
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		int numSort, numDito, i = 0;
		numSort = gerador.nextInt(1, 5);
		while (i != 4) {
			i++;
			System.out.print("Diga um número: ");
			numDito = ler.nextInt();
			if (numSort == numDito) {
				System.out.println("Você acertou!!");
				break;
			}
			else
				System.out.println("Você errou");
			System.out.println();
		}
		System.out.println();
		System.out.println("Número sorteado: " + numSort);
	}
}