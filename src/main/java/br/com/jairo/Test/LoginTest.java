package br.com.jairo.Test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.LoginPage.Login;
import br.com.jairo.config.Listener;


public class LoginTest extends Listener {
	
	Login login = new Login();
	
	@Test
	public void conectandoAoControleInternoDoAbastecimento(){
		
		login.usuario("frentistateste");
		login.senha("parateste");
		login.btnConectar();
		
		Assert.assertEquals("POSTO TESTE", login.validarAcesso());
		
		
		
	}

}
