package sequencias_basicas;

import java.util.Scanner;

public class questao_14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double km, dias, total;
		
		System.out.print("Km percorridos: ");
		km = ler.nextDouble();
		while(km <= 0) {
			System.out.print("Km inválido! Km percorridos: ");
			km = ler.nextDouble();
		}
		System.out.print("Dias alugados: ");
		dias = ler.nextDouble();
		while(dias <= 0) {
			System.out.print("Dias inválidos! Dias alugados: ");
			dias = ler.nextDouble();
		}
		
		total = (dias * 90)+(km*0.20);
		
		System.out.printf("Total a pagar: R$%.2f", total);
	}
}