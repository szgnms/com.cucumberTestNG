package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerOkuPage {
    public HerOkuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@onclick='addElement()']")
    public WebElement addElement;

    @FindBy (xpath = "//button[@class='added-manually']")
    public WebElement delButton;

    @FindBy (id = "elements")
    public WebElement del;

    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement firstname;
}
