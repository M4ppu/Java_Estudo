package condicoes_basicas;

import java.util.Scanner;

public class questao_24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double km, valor;
		
		System.out.print("Kilometragem: ");
		km = ler.nextInt();
		if(km <= 200) {
			valor = 200 * 0.50;
		}
		else {
			valor = 200 * 0.45;
		}
		System.out.printf("Valor da passagem de: R$%.2f",valor);
	}
}