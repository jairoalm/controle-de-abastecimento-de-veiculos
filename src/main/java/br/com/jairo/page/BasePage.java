package br.com.jairo.page;

import org.openqa.selenium.By;

import br.com.jairo.config.DriverFactory;

public class BasePage {
	
	public void escrever(By by, String texto){
		DriverFactory.getDriver().findElement(by).sendKeys(texto);	
	}
	public void escrever(String id, String texto){
		escrever(By.id(id),(texto));
	}
	
	public void clicarBotao(By by){
		DriverFactory.getDriver().findElement(by).click();
	}
	public void clicarBotao(String id){
		clicarBotao(By.id(id));
	}
	
	public String getObetrTexto(By by){
		return DriverFactory.getDriver().findElement(by).getText();
		
	}
	
	public String getObterTexto(String id){
		return getObetrTexto(By.id(id));
	}

}
