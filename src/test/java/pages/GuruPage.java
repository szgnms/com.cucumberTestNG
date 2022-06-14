package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;


public class GuruPage {
    public GuruPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//tbody//tr//td[1]")
    public List<WebElement> sutunBaslikList1;
    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> sutunBaslikList2;
    @FindBy(xpath = "//tbody//tr//td[3]")
    public List<WebElement> sutunBaslikList3;
    @FindBy(xpath = "//tbody//tr//td[4]")
    public List<WebElement> sutunBaslikList4;
    @FindBy(xpath = "//tbody//tr//td[5]")
    public List<WebElement> sutunBaslikList5;
}