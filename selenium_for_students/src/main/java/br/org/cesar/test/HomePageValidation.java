package br.org.cesar.test;

import org.junit.*;

import br.org.cesar.common.HomePage;
import br.org.cesar.util.Utils;


/**
 * Classe de testes com cenarios relacionados a pagina inicial
 */
public class HomePageValidation extends BaseTestcase{

	@Before
	public void before() throws Exception {  
	}



	/**
	 * Objetivo: Abrir a home screen e verificar o titulo
	 * 
	 * Passos: Navegar para a home screen e verificar o titulo
	 * 
	 * Resultado Esperado: Titulo da home screen estilo correto
	 */
	@Test
	public void assertHomeScreenTitle() {
			HomePage.clickHomeMenuItem();
			HomePage.isTitleCorrect("Classe de Testes – Testes e Qualidade de Software");
	}

	
	/**
	 * Objetivo: Navegar para a pagina Curso Selenium e verificar o titulo exibido
	 * 
	 * Passos: Navegar para a pagina Curso Selenium, em seguida verificar o titulo exibido
	 * 
	 * Resultado Esperado:Titulo da pagina estilo correto
	 */
	@Test
	public void navigateToCursoSeleniumPage() {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Curso Selenium");
		HomePage.isHeaderTitleCorrect("Curso Selenium");
	}
	
	
	/**
	 * Objetivo: Navegar para a pagina Formulario Simples e verificar o titulo
	 * 
	 * Passos: Navegar para a pagina Formulario Simples e verificar o titulo exibido
	 * 
	 * Resultado Esperado:Titulo da pagina estilo correto
	 */
	@Test
	public void navigateToFormularioSimplesPage() {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Formulário Simples");
		HomePage.isHeaderTitleCorrect("Formulário Simples");
	}
	
	
	/**
	 * Objetivo: Pagina de resultados da busca exibida corretamente
	 * 
	 * Passos: Realiza busca com texto fixo e verifica o titulo da pagina de resultados
	 * 
	 * Resultado Esperado: Titulo da pagina de resultados estilo correto
	 */
	@Test
	public void performSimpleSearch() {
		HomePage.showHiddenOptions();
		HomePage.performSearch("teste");
		HomePage.clickSearchButton();
		HomePage.isSearchResultCorrect("Resultados da pesquisa por: teste");
		Utils.takeScreenshot("print");// inserido por pitter
	}
	
	
	@Test
	public void SearchNoResults(){
		HomePage.showHiddenOptions();
		HomePage.performSearch("futebol");
		HomePage.clickSearchButton();
		HomePage.isHeaderTitleCorrect("Nada Encontrado");
		
	}
	
	
	@After
	public void after() throws Exception {
	}
}
