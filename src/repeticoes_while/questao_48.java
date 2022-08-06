package repeticoes_while;

import java.util.Scanner;

public class questao_48 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i = 0, soma = 0, num;
		while(i != 7) {
			i++;
			System.out.print("Número " + i + ": ");
			num = read.nextInt();
			soma += num;
		}
		System.out.println("A soma de todos os números: " + soma);
	}
}