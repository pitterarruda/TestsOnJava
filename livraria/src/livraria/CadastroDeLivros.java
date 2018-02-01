package livraria;


public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789.10");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setIsbn("978-85-66250-46-6");
		livro.setValor(60.00);
		
		//livro.aplicaDescontoDe(0.5);
		//livro.setAutor(autor);/////
		
		livro.mostrarDetalhes();
//		livro.autor.mostrarDetalhes();
		
		/*System.out.println(livro.nome);
		System.out.println(livro.descricao);
		System.out.println(livro.valor);
		System.out.println(livro.isbn);*/
		
		/*Autor outroAutor = new Autor();
		outroAutor.nome = "Paulo Silveira";
		outroAutor.email = "paulo.silveira@caelum.com.br";
		outroAutor.cpf = "123.456.789.10";
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de Programação";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";
		outroLivro.autor = outroAutor;///////
		
		outroLivro.mostrarDetalhes();
		outroLivro.autor.mostrarDetalhes();*/
		
		/*System.out.println("---------------------------------");
		System.out.println(outroLivro.nome);
		System.out.println(outroLivro.descricao);
		System.out.println(outroLivro.valor);
		System.out.println(outroLivro.isbn);*/
		
		/*Autor autor1 = new Autor();
		autor1.nome = "Rodrigo Turini";
		
		Livro livro1 = new Livro();
		livro1.autor = autor1;
		
		livro1.autor.nome = "Guilherme Silveira";
		System.out.println(autor1.nome);
		System.out.println(livro1.autor.nome);
*/
		
	}

}
