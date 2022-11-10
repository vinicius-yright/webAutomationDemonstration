package br.com.automacao.configuration;

import br.com.automacao.commons.BaseTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest{
	
	@Before
		public void before() {
			initializeWebApplication(Web.CHROME_WINDOWS);
		}
	@After
		public void after() {
			closeWeb();
		}

}
