package br.com.jairo.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import br.com.jairo.config.DriverFactory;




public class BasePage {
	
	//***** Escrever no campo *****//
	public void escrever(By by, String texto){
		DriverFactory.getDriver().findElement(by).sendKeys(texto);	
	}
	public void escrever(String id, String texto){
		escrever(By.id(id),(texto));
	}
	
	//***** Botão *****//
	public void clicarBotao(By by){
		DriverFactory.getDriver().findElement(by).click();
	}
	public void clicarBotao(String id){
		clicarBotao(By.id(id));
	}
	//***** Escrevendo no input e apertando a tecla ENTER *****//
	public void escrevendo_E_Apertando_Enter(String id, String valor){
		DriverFactory.getDriver().findElement(By.id(id)).sendKeys(valor + Keys.ENTER);		
	}
	
	public String obterValorCombo(String id) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		return combo.getFirstSelectedOption().getText();
	}
	
	//***** Obter mensagem de texto *****//
	public String getObetrTexto(By by){
		return DriverFactory.getDriver().findElement(by).getText();
		
	}
	
	public String getObterTexto(String id){
		return getObetrTexto(By.id(id));
	}
	
	//****** Alert *****//
	public String getMensagemAlert(){
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		return alert.getText();
	}
	
}
