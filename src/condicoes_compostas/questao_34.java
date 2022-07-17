package condicoes_compostas;

import java.util.Scanner;

public class questao_34 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double peso, altura, resultado;
		
		System.out.print("Peso: ");
		peso = read.nextDouble();
		System.out.print("Altura: ");
		altura = read.nextDouble();
		resultado = peso/(Math.pow(altura, 2));
		
		if(resultado <= 18.5)
			System.out.println("Abaixo do peso");
		else if(resultado > 18.5 && resultado <= 25)
			System.out.println("Peso ideal");
		else if(resultado > 25 && resultado <= 30)
			System.out.println("Sobrepeso");
		else if(resultado > 30 && resultado <= 40)
			System.out.println("Obesidade");
		else
			System.out.println("Obesidade mórbida");
	}
}