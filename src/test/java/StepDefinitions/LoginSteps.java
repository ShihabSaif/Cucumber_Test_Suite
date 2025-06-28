package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("given block 1");
    }

    @When("user enters username and password")
    public void userEntersUsernameAndPassword() {
        System.out.println("when block 2");
    }

    @And("click login button")
    public void clickLoginButton() {
        System.out.println("and block 3");
    }
}
