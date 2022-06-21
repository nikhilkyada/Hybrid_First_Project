package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    //Objects
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    VerifyRegisterSuccess verifyRegisterSuccess = new VerifyRegisterSuccess();

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegister();
        registrationPage.verifyRegistrationPageURL();
    }

    @When("user enter all required filled")
    public void user_enter_all_required_filled() {
        registrationPage.enterAllRegistrationDetails();
    }

    @When("user click on register button")
    public void user_click_on_register_button() {
        registrationPage.clickOnRegisterBtn();
    }

    @Then("user can see Register success message")
    public void user_can_see_register_success_message() {
        verifyRegisterSuccess.verifyRegistrationSuccess();
    }
}
