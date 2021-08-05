package br.com.frentistaPage;

import org.openqa.selenium.By;

import br.com.jairo.page.BasePage;

public class FuncionarioPage extends BasePage {
	
	
	public void abastecimentoPendentes(){
		clicarBotao(By.xpath("//button[@class='btn btn-bold btn-pure btn-secondary']"));
	}
	
	public void buscarAbastecimento(String abastecimento){
		escrever("buscar_abastecimento", abastecimento);
	}

}
