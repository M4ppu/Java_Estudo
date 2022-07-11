package condicoes_basicas;

import java.util.Scanner;

public class questao_17 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 double velocidade, multa;
		 
		 velocidade = ler.nextDouble();
		 if(velocidade > 80) {
			 multa = (velocidade - 80)*5;
			 System.out.printf("Você foi multado! Valor de: R$%.2f", multa);			 
			 }
		 else {
			 System.out.println("Passou abaixo do limite");
		 }
	}
}