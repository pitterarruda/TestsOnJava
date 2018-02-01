package br.org.cesar.test;

//import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import br.org.cesar.common.PO_Calculadora;


@RunWith(Parameterized.class)
public class TC_Calculadora extends BaseTestcase{


	private String numero1;
	private String numero2;
	private String operacao;
	private String resultado;
	
	public TC_Calculadora(String numero1, String operacao, String numero2, String resultado){
		this.numero1 = numero1;
		this.operacao = operacao;
		this.numero2 = numero2;
		this.resultado = resultado;
	}
	
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { "1", "plus", "1", "2" },
				{ "2", "times", "2", "4" }, { "5", "divide", "2", "2.5" },
				{ "10", "minus", "4", "6" }});
	}
	
	
	@Test
	public void validaCalculadora() {
		//fail("Not yet implemented");
		PO_Calculadora.entradaNumero1(this.numero1);
		PO_Calculadora.selecaoOperacao(this.operacao);
		PO_Calculadora.entradaNumero2(this.numero2);
		PO_Calculadora.clickCalcular();
		PO_Calculadora.verificaResultado(this.resultado);
		
	}
	


}
