package br.com.automacao.web.functionality;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.MagentoHomePage;

public class MagentoHomeFunctionality extends BaseTest {

    private MagentoHomePage magentoHomePage;

    public MagentoHomeFunctionality() {
        this.magentoHomePage = new MagentoHomePage(webDriver);
    }

    public void clickCreateAccBtn() {
        this.magentoHomePage.getMugentoCreateAccBtn().click();
    }

    public void clickSignInBtn() {
        this.magentoHomePage.getMugentoSignInBtn().click();
    }
}
