package condicoes_compostas;

import java.util.*;

public class questao_32 {
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		int numSort, numDito;
		
		numSort = gerador.nextInt(1, 5);
		
		System.out.print("Diga um número: ");
		numDito = ler.nextInt();
		if(numSort == numDito)
			System.out.println("Você acertou!!");
		else
			System.out.println("Você errou");
	}

}
