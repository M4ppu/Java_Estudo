package repeticoes_while;

import java.util.Scanner;

public class questao_52 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double mediaIdade = 0;
		int i = 0, idade18mais = 0, idade5menos = 0, maiorIdade = 0, somaIdade = 0;
		while(i != 10) {
			i++;
			System.out.print("Idade da pessoa " + i + ": ");
			int idade = read.nextInt();
			somaIdade += idade;
			if(idade > 18)
				idade18mais++;
			if(idade < 5)
				idade5menos++;
			if(maiorIdade < idade)
				maiorIdade = idade;			
		}
		mediaIdade = somaIdade/10;
		System.out.println("Pessoas com mais de 18: " + idade18mais);
		System.out.println("Pessoas com menos de 5: " + idade5menos);
		System.out.printf("Média da idade das pessoas %.2f: ", mediaIdade);
		System.out.println("\nMaior idade lida: " + maiorIdade);
	}
}