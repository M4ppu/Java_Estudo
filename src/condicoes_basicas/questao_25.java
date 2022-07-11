package condicoes_basicas;

import java.util.Scanner;

public class questao_25 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int lado1, lado2, lado3;
		
		lado1 = ler.nextInt();
		lado2 = ler.nextInt();
		lado3 = ler.nextInt();		
		
		if(lado1+lado2>=lado3 && lado1+lado3>=lado2 && lado3+lado2>=lado1) {
			System.out.println("É triângulo");
		}
		else {
			System.out.println("Não é triângulo");
		}
	}
}