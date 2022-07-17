package condicoes_compostas;

import java.util.Scanner;

public class questao_28 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double terreno, largura, comprimento;
		
		System.out.print("Largura: ");
		largura = ler.nextDouble();
		System.out.print("Comprimento: ");
		comprimento = ler.nextDouble();
		
		terreno = largura * comprimento;
		
		if(terreno<100)
			System.out.println("Terreno popular");
		else if(terreno >= 100 && terreno <=500)
			System.out.println("Terreno master");
		else
			System.out.println("Terreno VIP");
	}
}
