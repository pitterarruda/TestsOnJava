package livraria;

public class CarrinhoDeCompras {
	
	
	private double total;
	
	
	
	CarrinhoDeCompras(){
		this.total = 0;
	}
	
	
	public void adiciona(Produto produto){
		System.out.println("Adicionando: " + produto);
		//produto.aplicaDescontoDe(0.16);
		total += produto.getValor();
	}

	
	public double getTotal(){
		return this.total;
	}
	
	
}
