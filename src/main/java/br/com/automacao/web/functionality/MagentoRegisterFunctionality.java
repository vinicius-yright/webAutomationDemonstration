package br.com.automacao.web.functionality;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.MagentoRegisterPage;

public class MagentoRegisterFunctionality extends BaseTest {

    private MagentoRegisterPage magentoRegisterPage;

    public MagentoRegisterFunctionality() {
        this.magentoRegisterPage = new MagentoRegisterPage(webDriver);
    }

    public void writeFields(String fName, String lName, String email, String pass) {
        this.magentoRegisterPage.getFirstnameField().sendKeys(fName);
        this.magentoRegisterPage.getLastnameField().sendKeys(lName);
        this.magentoRegisterPage.getEmailField().sendKeys(email);
        this.magentoRegisterPage.getPasswordField().sendKeys(pass);
        this.magentoRegisterPage.getPasswordConfirmField().sendKeys(pass);
    }

    public void clickCreateAccountBtn() {
        this.magentoRegisterPage.getCreateAccountBtn().click();
    }
}
