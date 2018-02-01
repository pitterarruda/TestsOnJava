package br.org.cesar.common;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import br.org.cesar.util.Utils;



public class PO_Calculadora {
	
	private static final WebDriver driver;
	
	static {
		driver = Selenium.getDriver();
	}

	//locators
	
	static By number1 = By.id("number1");
	static By number2 = By.id("number2");
	static By botaoCalcular = By.id("calculate");
	static By operacao = By.id("function");
	static By resultado = By.id("answer");
	
	
	public PO_Calculadora(){
		
	}
	
	
	//metodos
	
	public static void entradaNumero1(String num1){
		Utils.isLocated(number1);
		driver.findElement(number1).clear();
		driver.findElement(number1).sendKeys(num1);
	}
	
	public static void entradaNumero2(String num2){
		Utils.isLocated(number2);
		driver.findElement(number2).clear();
		driver.findElement(number2).sendKeys(num2);
	}
	
	public static void selecaoOperacao(String operador){
		Utils.isLocated(operacao);
		new Select (driver.findElement(operacao)).selectByValue(operador);
	}
	
	public static void clickCalcular(){
		Utils.isLocated(botaoCalcular);
		driver.findElement(botaoCalcular).click();
	}
	
	public static void verificaResultado(String resultadoFinal){
		Utils.isLocated(resultado);
		assertThat("Resultado incorreto", driver.findElement(resultado).getText(), is(resultadoFinal));
	}
}
