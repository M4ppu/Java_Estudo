package sequencias_basicas;

import java.util.Scanner;

public class questao_04 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, soma;
		
		System.out.println("Dina um número: ");
		num1 = keyboard.nextInt();
		
		System.out.println("Diga outro número: ");
		num2 = keyboard.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + soma + ".");
	}
}