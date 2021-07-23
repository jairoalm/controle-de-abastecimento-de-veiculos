package br.com.jairo.LoginPage;

import org.openqa.selenium.By;

import br.com.jairo.page.BasePage;

public class Login extends BasePage{
	
	public void usuario(String texto){
		escrever("username", texto);
	}
	
	public void senha(String texto){
		escrever("password", texto);
	}
	
	public void btnConectar(){	
		clicarBotao(By.xpath("//button[@type='submit']"));
	}
	
	public String validarAcesso(){		
		return getObetrTexto(By.xpath("//h1[@class='card-title pr-2 font-weight-bold text-center']"));
		
	}

}
