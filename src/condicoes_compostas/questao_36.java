package condicoes_compostas;

import java.util.Scanner;

public class questao_36 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int horas;
		final int FISICA10 = 2, FISICA10_20 = 5, FISICA20MAIS = 10;
		final double FATURA = 0.05;
		double receber;
		
		System.out.print("Horas treinadas: ");
		horas = read.nextInt();
		while(horas <= 0) {
			System.out.println("Valor incoreto");
			System.out.print("Horas treinadas: ");
			horas = read.nextInt();
		}
		if(horas < 10)
			receber = (horas * FISICA10) * FATURA;
		else if(horas >= 10 && horas <=20)
			receber = (horas * FISICA10_20) * FATURA;
		else
			receber = (horas * FISICA20MAIS) * FATURA;
		
		System.out.printf("O valor recebido é R$%.2f", receber);
	}
}