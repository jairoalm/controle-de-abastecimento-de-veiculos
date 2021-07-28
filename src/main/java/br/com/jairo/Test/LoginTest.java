package br.com.jairo.Test;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.jairo.LoginPage.LoginPage;
import br.com.jairo.config.Listener;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends Listener {
	
	LoginPage login = new LoginPage();
	
	@Test
	public void test1_interagindoComAlertOps() {
		login.btnLogin();
		login.acessandoTela();
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.acessandoTela());
		System.out.println(login.acessandoTela());
	}
	
	@Test
	public void test2_conectandoAoControleInternoDoAbastecimento(){
		
		login.usuario("frentistateste");
		login.senha("parateste");
		login.btnLogin();
		
		Assert.assertEquals("POSTO TESTE", login.validarAcesso());		
		System.out.println(login.validarAcesso());
	}

}
