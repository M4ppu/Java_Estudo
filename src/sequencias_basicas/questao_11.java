package sequencias_basicas;

import java.util.Scanner;

public class questao_11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, delta;
		
		System.out.print("Diga o valor de A: ");
		a = ler.nextDouble();
		System.out.print("Diga o valor de B: ");
		b = ler.nextDouble();
		System.out.print("Diga o valor de C: ");
		c = ler.nextDouble();
		
		delta = (Math.pow(b, 2))-4*a*c;
		
		System.out.println("O valor de delta é: " + delta);
	}
}