package br.org.cesar.test;



//import static org.junit.Assert.*;
import org.junit.Test;

import br.org.cesar.common.PO_ClasseDeTestes;
import br.org.cesar.common.PO_FormSimples;

import org.junit.Before;



public class TC_FormSimples extends BaseTestcase {

	
	
	@Before
	public void beforeTest() {
		//fail("Not yet implemented");
		PO_ClasseDeTestes.openMenuSelenium();
		PO_ClasseDeTestes.clickSubMenuSelenium("Formulário Simples");
	}
	
	
	@Test
	public void testFormSimples() {
		//fail("Not yet implemented");
		PO_FormSimples.EmpreencherCampos("Pitter", "arruda@gmail.com", "www.sembugs.com.br", "teste de form simples");
		PO_FormSimples.ValidarMensagem("A mensagem foi enviada (voltar)");
	}

}
