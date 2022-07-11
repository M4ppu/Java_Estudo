package condicoes_basicas;

import java.util.Scanner;

public class questao_19 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		double nota1, nota2, media;
		
		System.out.print("Diga seu nome: ");
		nome = ler.next();
		
		System.out.print("Diga a primeira nota: ");
		nota1 = ler.nextDouble();
		while(nota1 < 0) {
			System.out.println("Nota inválida");
			System.out.print("Diga a primeira nota: ");
			nota1 = ler.nextDouble();
		}
		System.out.print("Diga a segunda nota: ");
		nota2 = ler.nextDouble();
		while(nota2 < 0) {
			System.out.println("Nota inválida");
			System.out.print("Diga a segunda nota: ");
			nota2 = ler.nextDouble();
		}
		media = (nota1 + nota2)/2;
		if(media >= 7) {
			System.out.println("Bom aproveitamento");
		}
		else {
			System.out.println("Mau aproveitamento");
		}		
	}
}