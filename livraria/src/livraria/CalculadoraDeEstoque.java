package livraria;

public class CalculadoraDeEstoque {
	
	public static void main(String[] args) {
		
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		
		double soma = livroJava8 + livroTDD;
		
		System.out.println("O total do estoque �: " + soma);
		
		if (soma < 150) {
			System.out.println("Seu estoque est� baixo !!!!");
		} else {
			System.out.println("Seu estoque est� OK !!!");
		}
		
	}

}
