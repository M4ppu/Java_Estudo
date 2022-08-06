package repeticoes_while;

import java.util.Scanner;

public class questao_49 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int i = 0, soma = 0, num, par = 0, impar = 0;
		while(i != 6) {
			i++;
			System.out.print("Número " + i + ": ");
			num = read.nextInt();
			soma += num;
			if(num %2 == 0)
				par++;
			else
				impar++;
		}
		System.out.println("Números pares: " + par);
		System.out.println("Números ímpares: " + impar);		
	}
}