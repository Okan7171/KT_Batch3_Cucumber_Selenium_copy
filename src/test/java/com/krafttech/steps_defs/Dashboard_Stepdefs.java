package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Dashboard_Stepdefs {

    @Then("Validate all tabs are on the page")
    public void validate_all_tabs_are_on_the_page(List<String> tabNames) {
        DashboardPage dashboardPage = new DashboardPage();
        List<String> expected = tabNames;
        List<String> actual = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(expected,actual);
        BrowserUtils.waitFor(5);
    }

    @Then("Enter credentials and validate that user is on the home page")
    public void enter_credentials_and_validate_that_user_is_on_the_home_page(Map<String, String> map) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(
            map.get("userEmail"),
            map.get("password")
        );
        BrowserUtils.waitFor(3);
        String expected = map.get("name");
        String actual = loginPage.getAccountName();
        Assert.assertEquals(expected,actual);
    }

}
