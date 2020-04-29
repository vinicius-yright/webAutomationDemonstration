package br.com.automacao.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	protected static WebDriver webDriver;
	protected static WebDriver segundoDriver;
	protected static WebDriverWait wait;
	
	protected void initializeWebApplication(WebApplication webApplication, boolean valor) {
		webDriver = webApplication.getDriver();
		webDriver.manage().window().maximize();
		if (valor == true) {
			webDriver.get(PropertiesManager.getPropertiesValue("URL_QA"));
		} else if (valor == false) {
			webDriver.get(PropertiesManager.getPropertiesValue("URL_DEV"));
		}
		wait = new WebDriverWait(webDriver, 30);
	}
	
	protected static void closeWeb() {
		webDriver.quit();
	}
}
