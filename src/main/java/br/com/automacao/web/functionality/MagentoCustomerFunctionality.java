package br.com.automacao.web.functionality;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.MagentoCustomerPage;
import br.com.automacao.web.pages.MagentoHomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MagentoCustomerFunctionality extends BaseTest {

    private MagentoCustomerPage magentoCustomerPage;

    public MagentoCustomerFunctionality() {
        this.magentoCustomerPage = new MagentoCustomerPage(webDriver);
    }

    public String getSuccessfulAccountRegisterMessage() {
        wait.until(ExpectedConditions.visibilityOf(magentoCustomerPage.getMsgSuccessfulRegister()));
        return this.magentoCustomerPage.getMsgSuccessfulRegister().getText();
    }

}
