package automacao.src.test.java.br.com.steps.web;

import br.com.automacao.web.functionality.MugentoHomeFunctionality;
import br.com.automacao.web.functionality.MugentoRegisterFunctionality;
import br.com.automacao.web.pages.MugentoHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class MugentoHomeSteps {

    private WebDriver webDriver;

    private MugentoHomeFunctionality mugentoHomeFunctionality = new MugentoHomeFunctionality();

    @Given("^that i'm on the home page of the website$")
    public void thatIMOnTheHomePageOfTheWebsite() {
    }

    @And("^i click on the Create an Account button$")
    public void iClickOnTheCreateAnAccountButton() {
        mugentoHomeFunctionality.clickCreateAccBtn();
    }
}