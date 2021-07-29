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
		login.getTextoAcessoInvalido();		
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
		
	}
	
	@Test
	public void test2_LogarComUsuarioValido(){
		login.usuario("frentistateste");
		login.btnLogin();
		login.getTextoAcessoInvalido();
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
	}
	
	@Test
	public void test3_LogarSenhaValida(){
		login.senha("parateste");
		login.btnLogin();
		login.getTextoAcessoInvalido();
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
	}
	
	@Test
	public void test4_LogarComUsuarioInvalido(){
		login.usuario("jose");
		login.senha("parateste");
		login.btnLogin();
		login.getTextoAcessoInvalido();
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
	}
	
	@Test
	public void test5_LogarComSenhaInvalida(){
		login.usuario("frentistateste");
		login.senha("jose");
		login.btnLogin();
		login.getTextoAcessoInvalido();
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
	}
			
	@Test
	public void test6_conectandoComUsuarioSenhaValidos(){
		
		login.usuario("frentistateste");
		login.senha("parateste");
		login.btnLogin();
		
		Assert.assertEquals("POSTO TESTE", login.validarAcesso());		
	}

}
