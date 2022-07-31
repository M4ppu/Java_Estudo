package repeticoes_while;

public class questao_47 {
	public static void main(String[] args) {
		int i = 500, soma = 0;
		while(i >= 0) {
			i -= 50;
			soma += i;
		}
		System.out.println("Soma total: " + soma);
	}
}