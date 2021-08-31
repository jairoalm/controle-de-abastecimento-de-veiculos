package br.com.jairo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jairo.loginTest.LoginValidoFrentistaTest;
import br.com.jairo.test.FuncionarioTest;

@RunWith(Suite.class)
@SuiteClasses({
	LoginValidoFrentistaTest.class,
	FuncionarioTest.class
})
public class SuiteFuncionario {

}
