package br.org.cesar.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
import br.org.cesar.util.SpreadsheetData;


@RunWith(Parameterized.class)
public class TC_Calculadora_XLS extends BaseTestcase{


	private Double numero1;
	private Double numero2;
	private String operacao;
	private Double resultado;
	
	public TC_Calculadora_XLS(Double numero1, String operacao, Double numero2, Double resultado){
		this.numero1 = numero1;
		this.operacao = operacao;
		this.numero2 = numero2;
		this.resultado = resultado;
	}
	
	
	@Parameters
	public static Collection spreadsheetData() throws IOException {
        InputStream spreadsheet = new FileInputStream("src\\main\\resources\\calculate2numbers.xls");
        return new SpreadsheetData(spreadsheet).getData();
    }
	
	
	@Test
	public void validaCalculadora() {
		//fail("Not yet implemented");
		PO_Calculadora.entradaNumero1(String.valueOf(this.numero1.intValue()));
		PO_Calculadora.selecaoOperacao(String.valueOf(this.operacao));
		PO_Calculadora.entradaNumero2(String.valueOf(this.numero2.intValue()));
		PO_Calculadora.clickCalcular();
		PO_Calculadora.verificaResultado(String.valueOf(this.resultado.intValue()));
		
	}
	


}
