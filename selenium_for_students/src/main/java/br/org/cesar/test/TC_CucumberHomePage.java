package br.org.cesar.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//import java.util.function.ToIntFunction;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TC_CucumberHomePage{

	protected static WebDriver driver;
	protected static WebDriverWait wait;
	
	//@BeforeClass
	//public void beforeClass(){
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\arruda\\seleniumReferenciasExternas\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		//wait = new WebDriverWait(driver,10);
		//driver.manage().window().maximize();
		//driver.get("http://www.classedetestes.wordpress.com");
	//}
	
	//@AfterClass
	//public static void afterClass(){
	//}
	
	// test 01
	@Given("^I access the home page$")
	public void i_access_the_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arruda\\seleniumReferenciasExternas\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.get("http://www.classedetestes.wordpress.com");
	}


	@When("^I click Home menu Item$")
	public void i_click_Home_menu_Item() throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu-item-103")));
		driver.findElement(By.id("menu-item-103")).click();
	}
	

	@Then("^Title is correct$")
	public void title_is_correct() throws Throwable {
		assertThat("Titulo Incorreto", driver.getTitle(), is("Classe de Testes – Testes e Qualidade de Software"));
	}
	
	
	// ------------------------  Scenario 02 -------------------------------------
	
	@Given("^I access the form complet page$")
	public void i_access_the_form_complet_page() throws Throwable {
	    driver.get("https://classedetestes.wordpress.com/formulario-completo/");
	}

	@When("^I fill out \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_fill_out_and(String nome, String estado) throws Throwable {
		int index = Integer.parseInt(estado);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("g22-nome")));
	    driver.findElement(By.id("g22-nome")).sendKeys(nome);
	    Select select = new Select (driver.findElement(By.id("g22-estado")));
	    select.selectByIndex(index);
	}
	
	@When("^I click on radio button$")
	public void i_click_on_radio_button() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='contact-form-22']/form/div[3]/label[2]/input")).click();
	}
	
	@When("^I click checkBox$")
	public void i_click_checkBox() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='contact-form-22']/form/div[4]/label/input")).click();
	}

	@When("^I click button$")
	public void i_click_button() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='contact-form-22']/form/p/input[1]")).click();
		
	}

	@Then("^Verify the mensage \"([^\"]*)\"$")
	public void verify_the_mensage(String mensage) throws Throwable {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3")));
	    assertThat("Erro na identificação do texto", driver.findElement(By.cssSelector("h3")).getText(), is(mensage));
		//driver.quit();
	}
}
