package br.org.cesar.test;

import org.junit.Before;
import org.junit.Test;

import br.org.cesar.common.FormularioSimplesPage;
import br.org.cesar.common.HomePage;

/**
 * Classe de testes com cenarios relacionados a pagina inicial
 */
public class FormularioSimplesPageValidation extends BaseTestcase{

	/**
	 * Antes de cada teste acessa a pagina de formulario simples
	 * @throws Exception
	 */
	@Before
	public void before() throws Exception {
		HomePage.clickSeleniumMenuItem();
		HomePage.clicksubMenuItem("Formulário Simples");
	}


	/**
	 * Objetivo: Enviar um comentario com sucesso
	 * 
	 * Passos: Preencher campos do formulario com informacoes validas e submeter
	 * 
	 * Resultado Esperado: Mensagem de sucesso exibida
	 */
	@Test
	public void sendCommentSuccessfully() {
		FormularioSimplesPage.fillOutFormularioSimples("jose", "teste@gmail.com", "website", "mensagem");
		FormularioSimplesPage.assertSuccessMessageIsShown();
	}
	
	/**
	 * Objetivo:  Enviar um comentario sem preencher o nome
	 * 
	 * Passos: Preencher campos do formulario (sem informar o nome) e submeter
	 * 
	 * Resultado Esperado: Mensagem de erro exibida
	 */
	@Test
	public void sendCommentWithoutName() {
		FormularioSimplesPage.fillOutFormularioSimples("", "teste@gmail.com", "website", "mensagem");
		FormularioSimplesPage.assertErrorMessageIsShown();
		FormularioSimplesPage.assertDetailedErrorMessageIsShown("Nome");
	}
	
	
}
