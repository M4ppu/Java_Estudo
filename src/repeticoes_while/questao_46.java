package repeticoes_while;

public class questao_46 {
	public static void main(String[] args) {
		int i = 6, soma = 0;
		while(100 >= i) {
			i += 2;
			soma += i;
		}
		System.out.println("Soma total: " + soma);
	}
}