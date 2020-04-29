package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebPage {
	
	public LoginWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
	
	@FindBy(id = "user-name")
	private WebElement usernameCampo;
	
	@FindBy(id = "password")
	private WebElement usernamePassword;
	
	@FindBy(xpath = "//input[@class='btn_action']")
	private WebElement botaoLogin;
	
	@FindBy(xpath = "//div[@class='product_label']")
	private WebElement tagValidacao;
	
	public WebElement getBotaoLogin() {
		return botaoLogin;
	}
	
	public WebElement getUsernameCampo() {
		return usernameCampo;
	}

	public WebElement getUsernamePassword() {
		return usernamePassword;
	}
	
	public WebElement getTagValidacao() {
		return tagValidacao;
	}
	
}
