package condicoes_basicas;

import java.util.Scanner;

public class questao_22 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoAtual, anoNasc, idade, tempoP, tempoF;
		
		System.out.print("Ano atual: ");
		anoAtual = ler.nextInt();
		System.out.print("Ano nascimento: ");
		anoNasc = ler.nextInt();
		idade = anoAtual - anoNasc;
		tempoP = idade - 18;
		tempoF = 18 - idade;
		
		if(idade > 18) {
			System.out.println("Já se passaram " + tempoP + " anos para o seu alistamento.");
		}
		else {
			System.out.println("Falta " + tempoF + " anos para o seu alistamento.");
		}
	}
}