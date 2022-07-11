package condicoes_basicas;

import java.util.Scanner;

public class questao_21 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int ano;
		
		System.out.print("Diga um ano: ");
		ano = ler.nextInt();
		
		if(ano%400 == 0 && ano%100 != 0) {
			System.out.println("Bissexto");
		}
		else if(!(ano%100 != 0 && ano%4 != 0 && ano%400 != 0)) {
			System.out.println("Bissexto");
			
		}
		else {
			System.out.println("Não é bissexto");
		}
	}
}