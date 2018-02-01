package livraria;

public class Ebook extends Livro implements Promocional{
	
	private String waterMark;
	
	
	

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	
	
	public Ebook(Autor autor){
		super(autor);
	}
	
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		
		System.out.println("aplicando desconto na subclasse Ebook");
		
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
		//return super.aplicaDescontoDe(porcentagem);
	}
	
}
