package br.com.jairo.loginTest;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.loginPage.LoginPage;

public class LoginValidoFrentistaTest extends Listener {
	
	LoginPage login = new LoginPage();
	
	@Test
	public void test6_conectandoComUsuarioSenhaValidos(){		
		login.usuario("usuario");
		login.senha("senha");
		login.btnLogin();
		
		Assert.assertEquals("POSTO TESTE", login.validarAcesso());		
	}

}
