package br.com.automacao.web.functionality;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.MugentoHomePage;
import br.com.automacao.web.pages.MugentoRegisterPage;

public class MugentoHomeFunctionality extends BaseTest {

    private MugentoHomePage mugentoHomePage;

    public MugentoHomeFunctionality() {
        this.mugentoHomePage = new MugentoHomePage(webDriver);
    }

    public void clickCreateAccBtn() {
        this.mugentoHomePage.getMugentoCreateAccBtn().click();
    }

    public void clickCreateSignInBtn() {
        this.mugentoHomePage.getMugentoSignInBtn().click();
    }
}
