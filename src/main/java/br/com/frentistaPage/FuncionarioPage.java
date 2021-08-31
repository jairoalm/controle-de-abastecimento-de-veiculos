package br.com.frentistaPage;

import org.openqa.selenium.By;
import br.com.jairo.page.BasePage;

public class FuncionarioPage extends BasePage {	
	
	public void btnAbastecimentoPendentes(){
		clicarBotao(By.xpath("//button[@class='btn btn-bold btn-pure btn-secondary']"));
	}
		
	public void codigo_ID_Veiculo(String abastecimento){
		escrevendo_e_precionando_enter("buscar_abastecimento", abastecimento);
	}
	
	public void teste(){
		obterValorCombo("id_veiculo");
	}
}
