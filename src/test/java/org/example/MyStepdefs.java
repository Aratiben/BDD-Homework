package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    RegisterResultPage registerResultPage=new RegisterResultPage();
    LoginPage loginPage=new LoginPage();
    EmailAFriend emailAFriend=new EmailAFriend();
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();}
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registrationPage.fillInDetails();}

    @Then("I should able to registered successfully")
    public void i_should_able_to_registered_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registerResultPage.userShouldSeeTheMessage();
    }



    @Given("I am on HomePage")
    public void i_am_on_home_page() {
        homePage.clickOnRegisterButton();
        registrationPage.fillInDetailstoregister();
        loginPage.userLogin();


    }
    @When("I click on HTC One M8 Android L {double} Lollipop")
    public void i_click_on_htc_one_m8_android_l_lollipop(Double double1) {
        homePage.clickOnHTCOneM8AndroidPhone();

    }
    @When("I click on Email A Friend")
    public void i_click_on_email_a_friend() {
       emailAFriend.enterEmailDetails();

    }
    @Then("I should be able to refer a product to a friend")
    public void i_should_be_able_to_refer_a_product_to_a_friend() {

    }

}
