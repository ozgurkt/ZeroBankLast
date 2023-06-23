package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivityPage extends BasePage{

    @FindBy(id = "account_activity_tab")
    public WebElement accountActivity;

    @FindBy(id = "aa_accountId")
    public WebElement dropdownElement;

}
