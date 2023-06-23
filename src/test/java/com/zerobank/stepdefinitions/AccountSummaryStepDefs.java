package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryStepDefs {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    @Then("Account summary page should have to following account types:")
    public void account_summary_page_should_have_to_following_account_types(List<String> expectedAccountTypes) {

        List<String> actualAccountTypes = BrowserUtils.getElementsText(accountSummaryPage.accountTypes);
        Assert.assertEquals(expectedAccountTypes,actualAccountTypes);
        System.out.println("actualAccountTypes = " + actualAccountTypes);
        System.out.println("expectedAccountTypes = " + expectedAccountTypes);

    }

    @Then("Credit Accounts table must have columns")
    public void credit_Accounts_table_must_have_columns(List<String> expectedCreditColumns) {

        List<String> actualCreditColumns = BrowserUtils.getElementsText(accountSummaryPage.creditColumns);
        Assert.assertEquals(expectedCreditColumns,actualCreditColumns);
        System.out.println("actualCreditColumns = " + actualCreditColumns);
        System.out.println("expectedCreditColumns = " + expectedCreditColumns);


    }


}
