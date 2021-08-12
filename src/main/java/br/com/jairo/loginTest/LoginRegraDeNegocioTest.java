package br.com.jairo.loginTest;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.jairo.config.Listener;
import br.com.jairo.loginPage.LoginPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginRegraDeNegocioTest extends Listener {
	
	LoginPage login = new LoginPage();
	
	@Test
	public void test1_logarComCamposVazios() {
		login.btnLogin();
		login.getTextoAcessoInvalido();		
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
		
	}
	
	@Test
	public void test2_LogarComUsuarioValido(){
		login.usuario("nome");
		login.btnLogin();
		login.getTextoAcessoInvalido();
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
	}
	
	@Test
	public void test3_LogarSenhaValida(){
		login.senha("senha");
		login.btnLogin();
		login.getTextoAcessoInvalido();
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
	}
	
	@Test
	public void test4_LogarComUsuarioInvalido(){
		login.usuario("jose");
		login.senha("senha");
		login.btnLogin();
		login.getTextoAcessoInvalido();
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
	}
	
	@Test
	public void test5_LogarComSenhaInvalida(){
		login.usuario("nome");
		login.senha("jose");
		login.btnLogin();
		login.getTextoAcessoInvalido();
		login.btnOK();
		
		Assert.assertEquals("Usuário ou senha incorretos!!", login.getTextoAcessoInvalido());
	}
			
	

}
