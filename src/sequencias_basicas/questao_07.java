package sequencias_basicas;

import java.util.Scanner;

public class questao_07 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double num;
		
		System.out.print("Digite um número: ");
		num = keyboard.nextDouble();
		System.out.println("O dobro de " + num + " é " + num*2);
		System.out.println("A terça parte de " + num + " é " + num/3);		
	}
}