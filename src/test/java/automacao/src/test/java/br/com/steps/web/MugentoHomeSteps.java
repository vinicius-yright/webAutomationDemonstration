package automacao.src.test.java.br.com.steps.web;

import br.com.automacao.web.functionality.MagentoHomeFunctionality;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class MugentoHomeSteps {

    private WebDriver webDriver;

    private MagentoHomeFunctionality magentoHomeFunctionality = new MagentoHomeFunctionality();

    @Given("^that i'm on the home page of the website$")
    public void thatIMOnTheHomePageOfTheWebsite() {
    }

    @And("^i click on the Create an Account button$")
    public void iClickOnTheCreateAnAccountButton() {
        magentoHomeFunctionality.clickCreateAccBtn();
    }

}