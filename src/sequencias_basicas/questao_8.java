package sequencias_basicas;

import java.util.Scanner;

public class questao_8 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double distancia;
		System.out.print("Digite uma distância em metros: ");
		distancia = keyboard.nextDouble();
		
		System.out.println("A distânciia de "+distancia+"m corresponde a:");
		System.out.println(distancia/1000 + "km | "+distancia/100+"hm");
		System.out.println(distancia/10 + "dam | "+distancia*10+"hm");
		System.out.println(distancia*100 + "cm | "+distancia*1000+"mm");
	}
}