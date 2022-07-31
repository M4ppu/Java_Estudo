package repeticoes_while;

import java.util.Scanner;

public class questao_45 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int inicio, fim, somar;
		System.out.print("Digite o primeiro Valor: ");
		inicio = read.nextInt();
		System.out.print("Digite o último Valor: ");
		fim = read.nextInt();
		while(fim <= inicio) {
			System.out.println("O número final é maior ou igual que o inicial");
			System.out.print("Digite o último Valor novamente: ");
			fim = read.nextInt();
		}
		System.out.print("Digite o incremento: ");
		somar = read.nextInt();
		System.out.print("Contagem: ");
		while(inicio < fim) {
			System.out.print(inicio + " ");
			inicio += somar;
		}
		System.out.println("Acabou!");
	}
}