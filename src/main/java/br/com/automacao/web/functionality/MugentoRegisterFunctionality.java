package br.com.automacao.web.functionality;

import br.com.automacao.commons.BaseTest;
import br.com.automacao.web.pages.MugentoRegisterPage;

public class MugentoRegisterFunctionality extends BaseTest {

    private MugentoRegisterPage mugentoRegisterPage;

    public MugentoRegisterFunctionality() {
        this.mugentoRegisterPage = new MugentoRegisterPage(webDriver);
    }

    public void writeGoogleSearchBar(String text) {
        this.mugentoRegisterPage.getGoogleSearchBar().sendKeys(text);
    }

    public void clickGoogleSearchButton() {
        this.mugentoRegisterPage.getGoogleSearchButton().click();
    }
}
