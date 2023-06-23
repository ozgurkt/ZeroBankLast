package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.signInButton.click();
    }

    @Given("User logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String userName, String passWord) {
        if(userName.equals(ConfigurationReader.get("userName"))&&passWord.equals(ConfigurationReader.get("passWord"))){
            loginPage.loginBox.sendKeys(userName);
            loginPage.passwordBox.sendKeys(passWord);
            loginPage.submit.click();
            Driver.get().get("http://zero.webappsecurity.com/bank/account-summary.html");
        }else{
            loginPage.loginBox.sendKeys(userName);
            loginPage.passwordBox.sendKeys(passWord);
            loginPage.submit.click();
        }
    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String expectedTab) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTab));
    }

    @Then("Error message {string} should be displayed")
    public void error_message_should_be_displayed(String expectedError) {
        String actualError = loginPage.errorMessage.getText();
        Assert.assertEquals("Verify the Message",expectedError,actualError);
    }

}
