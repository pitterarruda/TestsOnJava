//package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.*; // fiz essa importação

public class ExportacaoTeste {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass // fiz isso tbm
  public static void classSetUp(){
	//  System.setProperty("webdriver.gecko.driver", "C:\\Users\\arruda\\seleniumReferenciasExternas\\driverFirefox\\geckodriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\arruda\\seleniumReferenciasExternas\\chromedriver_win32\\chromedriver.exe");
	   
  }
  
  
  @Before
  public void setUp() throws Exception {
   // driver = new FirefoxDriver();
	  driver = new ChromeDriver();
    baseUrl = "http://book.theautomatedtester.co.uk"; // alterei a URL base
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testExportacaoTeste() throws Exception {
    driver.get(baseUrl + "/chapter1");
    driver.findElement(By.id("radiobutton")).click();
    new Select(driver.findElement(By.id("selecttype"))).selectByVisibleText("Selenium Core");
    try {
      assertTrue(isElementPresent(By.id("verifybutton")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("Assert that this text is on the page", driver.findElement(By.id("divontheleft")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("Home Page")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
