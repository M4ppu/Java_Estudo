package sequencias_basicas;

import java.util.Scanner;

public class questao_6 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = keyboard.nextInt();
		
		System.out.println("O antecessor de "+num+" é "+ (num-1));
		System.out.println("O sucessor de "+num+" é "+(num+1));
	}
}