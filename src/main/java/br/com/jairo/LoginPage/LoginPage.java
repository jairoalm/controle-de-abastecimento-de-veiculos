package br.com.jairo.loginPage;

import org.openqa.selenium.By;

//import br.com.jairo.config.DriverFactory;
import br.com.jairo.page.BasePage;

public class LoginPage extends BasePage {

	/*public void acessarTelaInicial(){
		DriverFactory.getDriver().get("https://posto.controlleinterno.com.br/accounts/login/?next=/");

	}*/
	
	public void usuario(String usuario) {
		escrever("username", usuario);
	}

	public void senha(String senha) {
		escrever("password", senha);
	}

	public void btnLogin() {
		clicarBotao(By.xpath("//button[@type='submit']"));
	}

	public String validarAcesso() {
		return getObetrTexto(By.xpath("//h1[@class='card-title pr-2 font-weight-bold text-center']"));

	}

	public String getTextoAcessoInvalido(){		
	    return getObterTexto("swal2-content");
	
	}

	public void btnOK() {
		clicarBotao(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
	}
	
}
