package br.com.jairo.loginTest;

import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.loginPage.LoginPage;

public class LoginPrefeitoTest extends Listener{
	
	LoginPage login = new LoginPage();
	
	@Test
	public void realizarLoginPrefeitoComUsuarioSenhaValidos(){
		login.usuario("prefeitoteste");
		login.senha("parateste");
		login.btnLogin();
		
	}
	

}
