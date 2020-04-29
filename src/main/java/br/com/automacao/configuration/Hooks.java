package br.com.automacao.configuration;

import br.com.automacao.commons.BaseTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest{
	
	@Before(value = "@startWeb") 
		public void beforeTestLogin() {
			initializeWebApplication(Web.CHROME_WINDOWS, true);
		}
	@Before(value = "@pegar4dev")
		public void before4Dev() {
			initializeWebApplication(Web.CHROME_WINDOWS, false);
	    }
	@After(value = "@pegar4dev") 
		public void after4Dev() {
			closeWeb();
		}
	@After(value = "@startWeb")
		public void afterTestLogin() {
			closeWeb();
	}
	
}
