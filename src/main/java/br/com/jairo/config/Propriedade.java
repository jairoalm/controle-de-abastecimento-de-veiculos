package br.com.jairo.config;

public class Propriedade {
	//Defimir qual o browser será utilizado
	public static boolean FECHAR_BROWSER = true;
	
	public static Browsers browser = Browsers.CHROME;
	
	public enum Browsers{
		CHROME,
		FIREFOX,
		IE,
		SAFARI, 
		OPERA	
	}
	
}
