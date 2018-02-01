package livraria;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		
		
		Autor autor = new Autor();
		autor.setNome("Pitter Arruda");
		
		/*Livro livro = new Livro(autor);
		livro.setValor(60.0);
		
		System.out.println("Valor atual: " + livro.getValor());
		
		if (!livro.aplicaDescontoDe(0.4)) {
			
			System.out.println("Desconto não pode ser maior do que 30%");
			
		} else {
			
			System.out.println("Valor com desconto: " + livro.getValor());
			
		}*/
		
		
		
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(30.0);
		
		System.out.println("Valor atual: " + ebook.getValor());
		
		if (!ebook.aplicaDescontoDe(0.12)) {
			
			System.out.println("Desconto não pode ser maior do que 15%");
			
		} else {
			
			System.out.println("Valor com desconto: " + ebook.getValor());
			
		}
		
		
		
		
	}

}
