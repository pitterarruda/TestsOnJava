package livraria;


public abstract class Livro implements Produto {
	
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public Autor getAutor() {
		return autor;
	}


	/*public void setAutor(Autor autor) {
		this.autor = autor;
	}*/


	
	// Construtores da classe
	Livro(Autor autor){
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
	
	/*Livro(){
	}
	*/
	
	// secao de metodos
	
	public void mostrarDetalhes() {
		System.out.println("----- Mostrando detalhes do livro ------");
		System.out.println("Nome: " + nome);
		System.out.println("Descri��o: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		System.out.println("-----------------------------------------");

		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		
	}
	
	
	//public abstract boolean aplicaDescontoDe(double porcentagem);
		

		
		/*if (porcentagem > 0.3) {
			return false;
		}
			System.out.println("aplicando desconto na super classe Livro");
			this.valor -= this.valor * porcentagem;
			return true;*/
	
	
	
	private boolean temAutor(){
		return this.autor != null;
	}
	
	
	
}
