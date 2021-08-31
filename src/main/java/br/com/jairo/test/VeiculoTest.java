package br.com.jairo.test;

import org.junit.Test;
import br.com.jairo.page.VeiculoPage;

public class VeiculoTest {
	
	VeiculoPage veic = new VeiculoPage();
	
	@Test
	public void acessando_tela_cadastro_de_veiculo() {
		veic.combustivel();
		veic.clicar_veiculo();
	}

}
