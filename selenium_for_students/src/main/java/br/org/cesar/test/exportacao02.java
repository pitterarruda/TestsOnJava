package br.org.cesar.test;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class exportacao02 {
	
  private WebDriver driver;
  private String baseUrl;
 // private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\arruda\\seleniumReferenciasExternas\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://classedetestes.wordpress.com/";
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testExportacao02() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.cssSelector("a.widget-handle.genericon")).click();
    driver.findElement(By.name("s")).clear();
    driver.findElement(By.name("s")).sendKeys("teste");
    driver.findElement(By.cssSelector("input.search-submit")).click(); 
    assertEquals("Resultados da pesquisa por: teste", driver.findElement(By.cssSelector("h1.page-title")).getText());
    }

  @After
  public void tearDown() throws Exception {
    driver.quit();
 }

  
 }
