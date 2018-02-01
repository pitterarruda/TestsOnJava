package br.org.cesar.common;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



/**
 * Classe Utils para o Selenium
 * Identifica qual o browser escolhido no config.properties e inicializa o webdriver correspondente
 */
public class Selenium {
	
	private static WebDriver driver = null;
	
	
	/**
	 * Verifica qual o browser escolhido no arquivo de propriedades
	 * inicializa o driver apropriado e o retorna
	 * @return retorna instância do WebDriver
	 */
	public static WebDriver getDriver() {
		
		String browser = Property.BROWSER_NAME;
		String headless = Property.CHROME_HEADLESS; //// atualização para chromeHeadless
		
		if (driver == null) {
			if (Browser.CHROME.equals(browser)) {
				File file = new File(Property.CHROME_DRIVE_PATH);
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				if (headless != null) {
					// Adicione as opções do Google Chrome. A opção window-size é importante para sites responsivos
				    ChromeOptions options = new ChromeOptions();
				    options.addArguments("headless");
				    options.addArguments("window-size=1200x600");
					driver = new ChromeDriver(options);
				}else {
					driver = new ChromeDriver();
				}

			} else if (Browser.IE.equals(browser)) {
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				File file = new File(Property.IE64_DRIVE_PATH);
				
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				driver = new InternetExplorerDriver(capabilities);
			}else  if (Browser.FIREFOX.equals(browser)){
				File file = new File(Property.FIREFOX_DRIVE_PATH);//eu
				System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());//eu
				driver = new FirefoxDriver();
			}else  if (Browser.PHANTOMJS.equals(browser)){
				DesiredCapabilities desiredCapabilities = DesiredCapabilities.phantomjs();
				File file = new File(Property.PHANTOMJS_DRIVE_PATH);//eu
				System.setProperty("phantomjs.binary.path", file.getAbsolutePath());//eu
				desiredCapabilities.setJavascriptEnabled(true);
				desiredCapabilities.setCapability("takesSreenshot", true);
				driver = new PhantomJSDriver(desiredCapabilities);
			}
		}
		return driver;
	}
	
}
