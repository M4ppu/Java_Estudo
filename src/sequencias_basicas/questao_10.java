package sequencias_basicas;

import java.util.Scanner;

public class questao_10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double altura, largura, area, tinta;
		final int AREA_TINTA = 2; 
		
		System.out.print("Altura: ");
		altura = ler.nextDouble();
		while(altura <= 0) {
			System.out.print("Altura inválida, diga novamente: ");
			altura = ler.nextDouble();
		}
		System.out.print("Largura: ");
		largura = ler.nextDouble();
		while(largura <= 0) {
			System.out.print("Largura inválida, diga novamente: ");
			largura = ler.nextDouble();
		}
		area = altura * largura;
		tinta = area/AREA_TINTA;
		
		System.out.println("A quantidade de tinta necessária é: " + tinta + "L");
		}
}
