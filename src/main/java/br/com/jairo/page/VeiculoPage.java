package br.com.jairo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.jairo.config.DriverFactory;

public class VeiculoPage extends BasePage{
	
	public void combustivel() {
		
		WebElement avatar = DriverFactory.getDriver().findElement(By.id("combustivel"));
		Actions builder = new Actions(DriverFactory.getDriver());
		builder.moveToElement(avatar).build().perform();
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("combustivel"))).click();
		
		
	}
	public void clicar_veiculo(){
		clicar_link2(By.xpath("//span[.='Veículo']"));		
	}

}
