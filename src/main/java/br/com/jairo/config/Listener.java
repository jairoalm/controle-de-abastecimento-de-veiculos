package br.com.jairo.config;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//import br.com.jairo.LoginPage.LoginPage;

public class Listener {
	//Código comentado para login unico
	//private LoginPage pagelogin = new LoginPage();
			
	// 
	@Rule
	public TestName testname = new TestName();
	
	@Before
	public void inicializar(){
		/*pagelogin.usuario("");
		pagelogin.senha("");
		pagelogin.btnLogin();*/
		DriverFactory.getDriver().get("https://posto.controlleinterno.com.br/accounts/login/?next=/");
	}
	
	@After
	public void finalizar() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) DriverFactory.getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "print" + 
		    File.separator + testname.getMethodName() + ".jpg"));
		//DriverFactory.getDriver().quit();		
	}

}
