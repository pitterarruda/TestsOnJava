package br.org.cesar.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import br.org.cesar.common.SimplifiedCalculatorPage;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;


@RunWith(JUnitParamsRunner.class)
public class CalculatorByEliasNogueira extends BaseTestcase{
	
	
	@Test
    @FileParameters("src\\main\\resources\\calculate2numbers02.csv")
	
	public void assertCalculation(String number1, String function, String number2, String answer) {
		
		SimplifiedCalculatorPage.enterFirstInput(number1);
		SimplifiedCalculatorPage.enterSecondInput(number2);
		SimplifiedCalculatorPage.selectOperation(function);
		SimplifiedCalculatorPage.calculate();
		SimplifiedCalculatorPage.assertCalculationResult(answer);
	}
	
	
}
