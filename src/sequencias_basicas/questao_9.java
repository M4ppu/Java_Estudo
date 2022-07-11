package sequencias_basicas;

import java.util.Scanner;

public class questao_9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double real, convert;
		
		System.out.print("Escreva seu dinheiro em R$: ");
		real = ler.nextDouble();
		
		while(real <= 0) {
			System.out.print("Valor inválido! Escreva seu dinheiro em R$: ");
			real = ler.nextDouble();
		}		
		convert = real/3.45;
		System.out.println("Você pode comprar: U$" + convert + " dólares");
		}
}