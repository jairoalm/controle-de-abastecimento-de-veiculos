package br.com.jairo.test;


import org.junit.Test;
import br.com.frentistaPage.FuncionarioPage;
import br.com.jairo.config.Listener;
import br.com.jairo.page.BasePage;



public class FuncionarioTest extends Listener {
	
	FuncionarioPage func = new FuncionarioPage();
	BasePage page = new BasePage();
	
	
	@Test
	public void acessoFuncinario(){
		func.btnAbastecimentoPendentes();
		func.codigo_ID_Veiculo("906916");
				
	}

}
