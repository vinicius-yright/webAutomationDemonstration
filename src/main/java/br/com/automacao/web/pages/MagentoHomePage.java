package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagentoHomePage {

    public MagentoHomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//div[@class='panel wrapper']//li//a[text()='Create an Account']")
    private WebElement mugentoCreateAccBtn;

    @FindBy(xpath = "//div[@class='panel header']//ul[@class='header links']//li[@class='authorization-link']//a")
    private WebElement mugentoSignInBtn;

    public WebElement getMugentoCreateAccBtn() {
        return mugentoCreateAccBtn;
    }

    public WebElement getMugentoSignInBtn() {
        return mugentoSignInBtn;
    }
}
