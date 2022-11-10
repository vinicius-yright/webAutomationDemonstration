package br.com.automacao.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MagentoRegisterPage {

    public MagentoRegisterPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "firstname")
    private WebElement firstnameField;

    @FindBy(id = "lastname")
    private WebElement lastnameField;

    @FindBy(id = "email_address")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "password-confirmation")
    private WebElement passwordConfirmField;

    @FindBy(xpath = "//button[@title='Create an Account']")
    private WebElement createAccountBtn;

    public WebElement getFirstnameField() {
        return firstnameField;
    }

    public WebElement getLastnameField() {
        return lastnameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getPasswordConfirmField() {
        return passwordConfirmField;
    }

    public WebElement getCreateAccountBtn() {
        return createAccountBtn;
    }
}
