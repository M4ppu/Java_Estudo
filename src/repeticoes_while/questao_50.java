package repeticoes_while;

import java.util.Random;

public class questao_50 {
	public static void main(String[] args) {
		Random gerador = new Random();
		int i = 0, maior5 = 0, div3 = 0;
		System.out.print("Números sorteados: ");
		while(i != 20) {
			i++;
			int num = gerador.nextInt(0, 10);
			System.out.print(num + " ");
			if(num > 5)
				maior5++;
			if(num % 3 == 0)
				div3++;
		}
		System.out.println();
		System.out.println("Quantidade de números maiores que 5 sorteados: " + maior5);
		System.out.println("Quantidade de números divisíveis por 3 sorteados: " + div3);
	}
}