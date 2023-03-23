package com.krafttech.steps_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Open browser and navigate to login page");
    }

    @When("The user enters valid credentials that belongs to Mike")
    public void the_user_enters_valid_credentials_that_belongs_to_Mike() {
        System.out.println("Enter valid credentials that belongs to Mike");
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("verify that user successfully logs in");
    }

    @When("The user enters valid credentials that belongs to Jack")
    public void the_user_enters_valid_credentials_that_belongs_to_Jack() {
        System.out.println("Enter valid credentials that belongs to Jack");
    }

    @When("The user enters valid credentials that belongs to Sebastian")
    public void the_user_enters_valid_credentials_that_belongs_to_Sebastian() {
        System.out.println("Enter valid credentials that belongs to Sebastian");
    }

    @When("The user enters valid credentials that belongs to SDET")
    public void the_user_enters_valid_credentials_that_belongs_to_SDET() {
        System.out.println("Enter valid credentials that belongs to SDET");
    }

}
