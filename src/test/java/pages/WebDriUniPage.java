package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriUniPage {
    public WebDriUniPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h4[normalize-space()='Login Portal']")
    public WebElement loginPortal;

    @FindBy(xpath = "//input[@id='text']")
    public WebElement username;

    @FindBy(xpath = "//button[@id='login-button']")
    public WebElement loginButton;
}
