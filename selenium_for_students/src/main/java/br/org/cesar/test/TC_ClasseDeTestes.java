package br.org.cesar.test;

//import static org.junit.Assert.*;

import org.junit.Test;
//import org.junit.Before;
import br.org.cesar.common.PO_ClasseDeTestes;




public class TC_ClasseDeTestes extends BaseTestcase  {

	
	//@Before
	//public void setAll(){
	//	driver.get("http://www.classedetestes.wordpress.com");
	//}
	
	
	@Test
	public void Test00() {
		PO_ClasseDeTestes.clickMenuHome();
		PO_ClasseDeTestes.isTitleCorrect("Classe de Testes – Testes e Qualidade de Software");
	}

	
	@Test
	public void Test01(){
		PO_ClasseDeTestes.openMenuSelenium();
		PO_ClasseDeTestes.clickSubMenuSelenium("Curso Selenium");
		PO_ClasseDeTestes.isTitleCorrect("Curso Selenium – Classe de Testes");
		//PO_ClasseDeTestes.clickLinkAjax();
		//PO_ClasseDeTestes.isURLcorrect("http://the-internet.herokuapp.com/dynamic_loading/1");
		//PO_ClasseDeTestes.clickBotaoAjax();
		//PO_ClasseDeTestes.isMensagecorrect("Hello World!");
		
	}
	
	
	@Test
	public void Test02(){
		PO_ClasseDeTestes.openMenuSelenium();
		PO_ClasseDeTestes.clickSubMenuSelenium("Formulário Simples");
		PO_ClasseDeTestes.TituloEstaCerto("Formulário Simples");
	}
	
	
	@Test
	public void Test03(){
		PO_ClasseDeTestes.clickMostarBusca();
		PO_ClasseDeTestes.realizaBusca("teste");
		PO_ClasseDeTestes.TituloBuscaEstaCerto("Resultados da pesquisa por: teste");
	}
	
	
}
