package sequencias_basicas;

import java.util.Scanner;

public class questao_5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Nota 1: ");
		nota1 = keyboard.nextFloat();
		System.out.println("Nota 2: ");
		nota2 = keyboard.nextFloat();
		
		media = (nota1+nota2)/2;
		
		System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
	}
}