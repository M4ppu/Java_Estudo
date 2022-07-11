package condicoes_basicas;

import java.util.Scanner;

public class questao_20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.print("Diga um número: ");
		num = ler.nextInt();
		if(num%2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
	}
}