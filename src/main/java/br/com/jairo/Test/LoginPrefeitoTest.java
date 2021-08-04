package br.com.jairo.Test;

import org.junit.Test;

import br.com.jairo.LoginPage.LoginPage;
import br.com.jairo.config.Listener;

public class LoginPrefeitoTest extends Listener{
	
	LoginPage login = new LoginPage();
	
	@Test
	public void realizarLoginPrefeitoComUsuarioSenhaValidos(){
		login.usuario("prefeitoteste");
		login.senha("parateste");
		login.btnLogin();
		
	}
	

}
