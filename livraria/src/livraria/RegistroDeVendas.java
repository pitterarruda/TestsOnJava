package livraria;

public class RegistroDeVendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Autor autor = new Autor();
		autor.setNome("Pitter Arruda");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Os três porquinhos");
		fisico.setValor(100.00);
		fisico.aplicaDescontoDe10Porcento();
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Virtual things today");
		ebook.setValor(100.00);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: " + carrinho.getTotal());
		
		
	}

}
