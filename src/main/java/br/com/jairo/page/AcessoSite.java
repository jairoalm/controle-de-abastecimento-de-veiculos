package br.com.jairo.page;

import org.junit.Before;

import br.com.jairo.config.DriverFactory;

public class AcessoSite {	

	@Before
	public void inicializar(){
		/*pagelogin.usuario("");
		pagelogin.senha("");
		pagelogin.btnLogin();*/
		DriverFactory.getDriver().get("https://posto.controlleinterno.com.br/accounts/login/?next=/");
	}

}
