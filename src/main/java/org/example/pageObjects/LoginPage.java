package org.example.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@type = 'text']")
    private WebElement loginField;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    public void setLoginField(String message) {
       loginField.sendKeys(message);
    }

    public void setPasswordField(String message) {
        passwordField.sendKeys(message);
    }

    public void setSubmitButton(String message) {
        passwordField.sendKeys(message);
    }
}
