/**
 * 
 */
package br.org.cesar.test;

//import static org.junit.Assert.*;

//import org.junit.Before;
import org.junit.Test;

import br.org.cesar.common.PO_FacebookHomePage;

/**
 * @author arruda
 *
 */
public class TC_FacebookHomePage extends BaseTestcase{

	//@Before
	//public void beforeteste(){
	//	driver.get("https://www.facebook.com/");
	//}
	
	@Test
	public void testFacebookHomePage() {
		PO_FacebookHomePage.fillOutName("Pitter");
		PO_FacebookHomePage.fillOutLastName("Arruda");
		PO_FacebookHomePage.fillOutCel("13981255234");
		PO_FacebookHomePage.fillKey("1234456");
		PO_FacebookHomePage.selectDay("25");
		PO_FacebookHomePage.selectMonth("10");
		PO_FacebookHomePage.selectYear("1983");
		PO_FacebookHomePage.ClickRadioButton();
	}

}
