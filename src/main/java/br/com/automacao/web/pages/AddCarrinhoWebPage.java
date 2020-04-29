package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCarrinhoWebPage {

	public AddCarrinhoWebPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
	
	@FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
	private WebElement botaoAddToCart;
	
	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	private WebElement botaoCarrinho;
	
	@FindBy(xpath = "//div[contains(text(), 'Your Cart')]")
	private WebElement textoYourCart;
	
	@FindBy(xpath = "//div[contains(text(), 'Sauce Labs Backpack')]")
	private WebElement mochilaCart;
	
	@FindBy(xpath = "//div[contains(text(), 'Sauce Labs Bolt T-Shirt')]")
	private WebElement camisaCart;
	
	@FindBy(xpath = "//div[contains(text(), 'Sauce Labs Bike Light')]")
	private WebElement luzCart;
	
	public WebElement getBotaoAddToCart() {
		return botaoAddToCart;
	}

	public WebElement getBotaoCarrinho() {
		return botaoCarrinho;
	}

	public WebElement getTextoYourCart() {
		return textoYourCart;
	}
	
	public WebElement getMochilaCart() {
		return mochilaCart;
	}

	public WebElement getCamisaCart() {
		return camisaCart;
	}

	public WebElement getMacacaoCart() {
		return luzCart;
	}
	
}
