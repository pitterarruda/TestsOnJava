package br.org.cesar.common;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.org.cesar.util.Utils;
//import org.openqa.selenium.support.ui.WebDriverWait;



public class PO_FormSimples {
	
	private static final WebDriver driver;
	//private static final WebDriverWait wait;
	
	static{
		driver = Selenium.getDriver();
		//wait = new WebDriverWait(driver,10);
	}

	
	
	static By CampoNome = By.id("g9-nome");
	static By CampoEmail = By.id("g9-email");
	static By CampoWebSite = By.id("g9-website");
	static By campoComentario = By.id("contact-form-comment-g9-comentrio");
	static By botaoEnviar = By.cssSelector("input.pushbutton-wide");
	static By Mensagem = By.xpath(".//*[@id='contact-form-9']/h3");
	
	
	
	
	public static void EmpreencherCampos(String nome, String email, String website, String comentario){
		
		Utils.isLocated(CampoNome);
		Utils.isLocated(CampoEmail);
		Utils.isLocated(CampoWebSite);
		Utils.isLocated(campoComentario);
		Utils.isLocated(botaoEnviar);
		
		driver.findElement(CampoNome).clear();
		driver.findElement(CampoNome).sendKeys(nome);
		
		driver.findElement(CampoEmail).clear();
		driver.findElement(CampoEmail).sendKeys(email);
		
		driver.findElement(CampoWebSite).clear();
		driver.findElement(CampoWebSite).sendKeys(website);
		
		driver.findElement(campoComentario).clear();
		driver.findElement(campoComentario).sendKeys(comentario);
		
		driver.findElement(botaoEnviar).click();
		
	}
	
	public static void ValidarMensagem(String mensagem){
		Utils.isVisible(Mensagem);
		assertThat("Texto invalido", driver.findElement(Mensagem).getText(), is(mensagem));
	}
	
	
	
}
