package condicoes_compostas;

import java.util.Scanner;

public class questao_27 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media;
		final int DIVISOR_MEDIA = 2;
		
		System.out.print("Primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Segunda nota: ");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2)/DIVISOR_MEDIA;
		
		if(media <= 4.9)
			System.out.println("Reprovado!");
		else if(media>=5 && media <=6.9)
			System.out.println("Recuperação!");
		else
			System.out.println("Aprovado!");
	}
}