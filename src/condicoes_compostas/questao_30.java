package condicoes_compostas;

import java.util.Scanner;

public class questao_30 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		System.out.print("Lado 1: ");
		lado1 = ler.nextInt();
		System.out.print("Lado 2: ");
		lado2 = ler.nextInt();
		System.out.print("Lado 3: ");
		lado3 = ler.nextInt();		
		
		if(lado1+lado2>=lado3 && lado1+lado3>=lado2 && lado3+lado2>=lado1) {
			if(lado1 == lado2 && lado2 == lado3)
				System.out.println("Triângulo equilátero");
			else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
				System.out.println("Triângulo isósceles");
			else
				System.out.println("Triângulo escaleno");
		}
		else
			System.out.println("Não é triângulo");
	}
}