package br.org.cesar.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PO_FacebookHomePage {
	
	private static final WebDriver driver;
	private static final WebDriverWait wait;
	
	static{
		driver = Selenium.getDriver();
		wait   = new WebDriverWait(driver, 10);
	}
	
	//Locator´s
	static By FieldName = By.xpath(".//*[@id='u_0_2']");
	static By FieldLastName = By.id("u_0_4");
	static By FieldCel = By.id("u_0_7");
	static By FieldKey = By.id("u_0_e");
	static By CmbDay = By.id("day");
	static By CmbMonth = By.id("month");
	static By CmbYear = By.id("year");
    static By RadioSexMasc = By.id("u_0_i");
    
	
	public PO_FacebookHomePage(){
		
	}

	
	public static void fillOutName(String name){
		wait.until(ExpectedConditions.visibilityOfElementLocated(FieldName));
		driver.findElement(FieldName).sendKeys(name);
	}
	
	public static void fillOutLastName(String Lastname){
		wait.until(ExpectedConditions.visibilityOfElementLocated(FieldLastName));
		driver.findElement(FieldLastName).sendKeys(Lastname);
	}
	
	
	public static void fillOutCel(String cel){
		wait.until(ExpectedConditions.visibilityOfElementLocated(FieldCel));
		driver.findElement(FieldCel).sendKeys(cel);
	}
	
	
	public static void fillKey(String key){
		wait.until(ExpectedConditions.visibilityOfElementLocated(FieldKey));
		driver.findElement(FieldKey).sendKeys(key);
	}
	
	public static void selectDay(String day){
		Select select = new Select(driver.findElement(CmbDay));
		select.selectByValue(day);
	}
	
	
	public static void selectMonth(String month){
		Select select = new Select(driver.findElement(CmbMonth));
		select.selectByValue(month);
	}
	
	public static void selectYear(String year){
		Select select = new Select(driver.findElement(CmbYear));
		select.selectByValue(year);
	}
	
	
	public static void ClickRadioButton(){
		driver.findElement(RadioSexMasc).click();
	}
}
