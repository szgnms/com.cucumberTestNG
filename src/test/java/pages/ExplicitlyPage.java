package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExplicitlyPage {
    public ExplicitlyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//span[normalize-space()='Alerts']")
    public WebElement alertButton;

    @FindBy (xpath = "//button[@id='timerAlertButton']")
    public WebElement clickMeButton;

}
