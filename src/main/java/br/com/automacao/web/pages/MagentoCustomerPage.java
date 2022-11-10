package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagentoCustomerPage {

    public MagentoCustomerPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }


    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    private WebElement msgSuccessfulRegister;

    public WebElement getMsgSuccessfulRegister() {
        return msgSuccessfulRegister;
    }

}
