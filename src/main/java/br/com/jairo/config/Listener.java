package br.com.jairo.config;

import org.junit.After;
import org.junit.Before;

public class Listener {
	
	@Before
	public void inicializar(){
		DriverFactory.getDriver().get("https://posto.controlleinterno.com.br/accounts/login/?next=/");
	}
	/*@After
	public void finalizar(){
		DriverFactory.getDriver().quit();		
	}*/

}
