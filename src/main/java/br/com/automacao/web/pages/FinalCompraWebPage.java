package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalCompraWebPage {

	public FinalCompraWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
	
	@FindBy(xpath = "//a[@class='btn_action checkout_button']")
	private WebElement botaoCheckout;
	
	@FindBy(id = "first-name")
	private WebElement priNomeCampo;;
	
	@FindBy(id = "last-name")
	private WebElement ultNomeCampo;
	
	@FindBy(id = "postal-code")
	private WebElement cepCampo;
	
	@FindBy(xpath = "//input[@class=\"btn_primary cart_button\"]")
	private WebElement btnContinue;
	
	@FindBy(xpath = "//a[@class=\"btn_action cart_button\"]")
	private WebElement btnFinaliza;
	
	@FindBy(xpath = "//h2[@class=\"complete-header\"]")
	private WebElement txtConfirmacao;

	public WebElement getBotaoCheckout() {
		return botaoCheckout;
	}

	public WebElement getPriNomeCampo() {
		return priNomeCampo;
	}

	public WebElement getUltNomeCampo() {
		return ultNomeCampo;
	}

	public WebElement getCepCampo() {
		return cepCampo;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getBtnFinaliza() {
		return btnFinaliza;
	}

	public WebElement getTxtConfirmacao() {
		return txtConfirmacao;
	}
	
	
	
}
