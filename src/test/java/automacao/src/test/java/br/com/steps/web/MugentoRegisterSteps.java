package automacao.src.test.java.br.com.steps.web;

import br.com.automacao.web.functionality.MugentoRegisterFunctionality;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

public class MugentoRegisterSteps {

    private WebDriver webDriver;

    private MugentoRegisterFunctionality mugentoRegisterFunctionality = new MugentoRegisterFunctionality();

    @Given("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {
        mugentoRegisterFunctionality.writeGoogleSearchBar(arg1);
    }

    @Then("^google should show me results$")
    public void i_google_should_show_me_results() {
        mugentoRegisterFunctionality.clickGoogleSearchButton();
    }
}