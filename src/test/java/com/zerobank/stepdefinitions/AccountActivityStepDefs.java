package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityStepDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    @When("User navigates to {string}")
    public void user_navigates_to(String string) {
        accountActivityPage.accountActivity.click();
    }

    @Then("user select {string} option")
    public void user_select_option(String text) {
        Select select = new Select(accountActivityPage.dropdownElement);
        select.selectByVisibleText(text);
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedText) {
        Select select = new Select(accountActivityPage.dropdownElement);
        String actualText = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedText,actualText);
        //System.out.println("actualText = " + actualText);
        //System.out.println("expectedText = " + expectedText);
    }

}
