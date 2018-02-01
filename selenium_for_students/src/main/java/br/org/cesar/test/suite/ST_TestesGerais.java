package br.org.cesar.test.suite;

//import static org.junit.Assert.*;

//import org.junit.After;
import org.junit.AfterClass;
//import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;

import br.org.cesar.common.Property;
import br.org.cesar.common.Selenium;
import br.org.cesar.test.TC_ClasseDeTestes;
import br.org.cesar.test.TC_FormSimples;




	@RunWith(Suite.class)
	@Suite.SuiteClasses({
		TC_ClasseDeTestes.class,
		TC_FormSimples.class,
	})


public class ST_TestesGerais {
		
		protected static WebDriver driver;
		
	@BeforeClass
	public static void BeforeClass() throws Exception {
		driver = Selenium.getDriver();
		driver.navigate().to(Property.SITE_ADDRESS);
	}

	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
	}

	

}
