package br.com.automacao.web.funcionalidade;

import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.LoginWebPage;

public class LoginWebFuncionalidade extends BaseTest{
	
	private LoginWebPage loginWebPage;

	public LoginWebFuncionalidade() {
        this.loginWebPage = new LoginWebPage(webDriver);
    }
	
	public void loginUsuarios()  {
//		wait.until(ExpectedConditions.visibilityOf(this.loginWebPage.getUsernameCampo()));
		this.loginWebPage.getUsernameCampo().sendKeys("standard_user");
		this.loginWebPage.getUsernamePassword().sendKeys("secret_sauce");;
	}

	public void clicaBotaoLogin() {
		wait.until(ExpectedConditions.elementToBeClickable(this.loginWebPage.getBotaoLogin()));
		this.loginWebPage.getBotaoLogin().click();
	}

	public String verificaPagHome() {
		wait.until(ExpectedConditions.visibilityOf((this.loginWebPage.getTagValidacao())));
		return this.loginWebPage.getTagValidacao().getText();
	}
	
	

}
