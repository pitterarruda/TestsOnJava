package br.org.cesar.common;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.org.cesar.util.Utils;


public class PO_ClasseDeTestes {
	
	
	private static final WebDriver driver;
	private static final WebDriverWait wait;
	
	static{
		driver = Selenium.getDriver();
		wait = new WebDriverWait(driver,10);
	}
	
	// Locator´s
	static By MenuHome = By.id("menu-item-103");
	static By MenuSelenium = By.id("menu-item-6");
	static By SubMenuFormSimples = By.id("menu-item-51");
	static By SubMenuCursoSelenium = By.id("menu-item-52");
	static By AjaxLink = By.xpath(".//*[@id='post-8']/div/p[3]/a");
	static By BotaoAjax = By.xpath(".//*[@id='start']/button");
	static By Mensagem = By.xpath(".//*[@id='finish']/h4");
	static By TituloDaPagina = By.className("entry-title");
	static By MostraBusca = By.xpath(".//*[@id='site-navigation']/a");
	static By CampoBusca = By.xpath(".//*[@id='search-2']/form/label/input");
	static By TextoBusca = By.xpath(".//*[@id='main']/header/h1");
	
	
	public PO_ClasseDeTestes(){
		
	}
		
	//métodos que serão consumidos
	
	public static void isTitleCorrect (String TituloExperado){
		assertThat("Titulo Incorreto", driver.getTitle(), is(TituloExperado));
	}
	
	
	public static void isURLcorrect(String URL){
		assertThat("URL Incorreta", driver.getCurrentUrl(), is(URL));
	}
	
	
	public static void isMensagecorrect(String mensagem){
		wait.until(ExpectedConditions.visibilityOfElementLocated(Mensagem));
		assertThat("Mensagem incorreta", driver.findElement(Mensagem).getText(), is(mensagem));
	}
	
	
	public static void TituloEstaCerto (String titulo){
		wait.until(ExpectedConditions.visibilityOfElementLocated(TituloDaPagina));
		assertThat("Titulo da pagina incorreto", driver.findElement(TituloDaPagina).getText(), is(titulo));
	}
	
	public static void TituloBuscaEstaCerto (String titulo){
		wait.until(ExpectedConditions.visibilityOfElementLocated(TextoBusca));
		assertThat("Titulo da pagina incorreto", driver.findElement(TextoBusca).getText(), is(titulo));
	}
	
	
	
	
	public static void clickMenuHome(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(MenuHome));
		driver.findElement(MenuHome).click();	
	}
	
	public static void openMenuSelenium(){
		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MenuSelenium));
		WebElement we = driver.findElement(MenuSelenium);
		action.moveToElement(we).build().perform();
	}
	
	
	public static void clickSubMenuSelenium(String opcao){
		By subMenu = null;
		if (opcao.equalsIgnoreCase("Curso Selenium")) {
			subMenu = SubMenuCursoSelenium;
		}else if (opcao.equalsIgnoreCase("Formulário Simples")) {
			subMenu = SubMenuFormSimples;
		}
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(subMenu));
		driver.findElement(subMenu).click();
		
	}
	
	
	public static void clickLinkAjax(){
		Utils.isVisible(AjaxLink);
		driver.findElement(AjaxLink).click();
	}
	
	
	public static void clickBotaoAjax(){
		Utils.isClickable(BotaoAjax);
		driver.findElement(BotaoAjax).click();
	}
	
	
	public static void clickMostarBusca(){
		Utils.isClickable(MostraBusca);
		driver.findElement(MostraBusca).click();
	}
	
	
	public static void realizaBusca(String texto){
		Utils.isVisible(CampoBusca);
		driver.findElement(CampoBusca).sendKeys(texto);
		driver.findElement(CampoBusca).sendKeys(Keys.RETURN);
	}
	
	
	
	
}
