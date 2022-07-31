package repeticoes_while;

import java.util.Scanner;

public class questao_42 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i = 1, num;
		System.out.print("Diga um número inteiro: ");
		num = read.nextInt();
		while(i <= num) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("Acabou!");
	}
}