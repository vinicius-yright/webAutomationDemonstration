package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MugentoRegisterPage {

    public MugentoRegisterPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement googleSearchBar;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@value='Pesquisa Google'][@role='button']")
    private WebElement googleSearchButton;

    public WebElement getGoogleSearchBar() {
        return googleSearchBar;
    }

    public WebElement getGoogleSearchButton() {
        return googleSearchButton;
    }
}
