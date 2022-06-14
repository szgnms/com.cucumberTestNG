package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Explicitly2Page {
    public Explicitly2Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@id='enableAfter']")
    public WebElement clickButton;

    @FindBy (xpath = "//button[@id='visibleAfter']")
    public WebElement afterButton;

}
