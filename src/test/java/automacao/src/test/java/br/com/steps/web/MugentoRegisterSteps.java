package automacao.src.test.java.br.com.steps.web;

import br.com.automacao.web.functionality.MagentoCustomerFunctionality;
import br.com.automacao.web.functionality.MagentoRegisterFunctionality;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class MugentoRegisterSteps {

    private WebDriver webDriver;

    private MagentoRegisterFunctionality magentoRegisterFunctionality = new MagentoRegisterFunctionality();
    private MagentoCustomerFunctionality magentoCustomerFunctionality = new MagentoCustomerFunctionality();

    @And("^i fill in all the required fields with data$")
    public void iFillInAllTheRequiredFieldsWithData() {
        this.magentoRegisterFunctionality.writeFields(
                "marquinhos",
                "ribeiro",
                "marquinhosgostosao@bol.com.br",
                "senhapicatlg#6"
                );
    }

    @And("^i click on the button to finish the process$")
    public void iClickOnTheButtonToFinishTheProcess() {
        this.magentoRegisterFunctionality.clickCreateAccountBtn();
    }

    @Then("^i can see the error message displayed on the website$")
    public void iMOfficiallyRegisteredOnTheWebsite() {
        Assert.assertEquals("There is already an account with this email address. " +
                                "If you are sure that it is your email address, click here to get your password and access your account."
                                , this.magentoCustomerFunctionality.getSuccessfulAccountRegisterMessage());
    }
}