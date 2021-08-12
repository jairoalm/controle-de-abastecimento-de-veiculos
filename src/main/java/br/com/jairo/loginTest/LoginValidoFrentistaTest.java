package br.com.jairo.loginTest;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.loginPage.LoginPage;
import br.com.jairo.page.AcessoSite;

public class LoginValidoFrentistaTest extends Listener {
	
	LoginPage login = new LoginPage();
	AcessoSite site = new AcessoSite();
	
	@Test
	public void test6_conectandoComUsuarioSenhaValidos(){		
		site.inicializar();
		login.usuario("nome");
		login.senha("senha");
		login.btnLogin();
		
		Assert.assertEquals("POSTO TESTE", login.validarAcesso());		
	}

}
