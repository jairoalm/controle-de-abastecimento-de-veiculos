package br.com.jairo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.com.jairo.loginTest.LoginPrefeitoTest;
import br.com.jairo.test.VeiculoTest;

@RunWith(Suite.class)
@SuiteClasses({
	LoginPrefeitoTest.class,
	VeiculoTest.class
	
})
public class SuitePrefeito {

}
