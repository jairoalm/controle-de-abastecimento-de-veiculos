package br.com.jairo.page;

import org.openqa.selenium.By;

public class VeiculoPage extends BasePage{
	
	public void combustivel() throws InterruptedException{
		Thread.sleep(5000);
		clicarBotao("combustivel");
	}
	public void clicar_veiculo(){
		clicar_link2(By.xpath("//span[.='Veículo']"));		
	}

}
