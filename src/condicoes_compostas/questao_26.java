package condicoes_compostas;

import java.util.Scanner;

public class questao_26 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Primeiro número: ");
		num1 = ler.nextInt();
		System.out.print("Segundo número: ");
		num2 = ler.nextInt();
		
		if(num1> num2)
			System.out.println("O primeiro número é maior");
		else if(num1< num2)
			System.out.println("O segundo número é maior");
		else
			System.out.println("Os números são iguais");
	}
}