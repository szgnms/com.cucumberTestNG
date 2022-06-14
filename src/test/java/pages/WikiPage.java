package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class WikiPage {

    public WikiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //    'List of companies acquired by Dell Inc.' isimli tabloya gidin,
    @FindBy (xpath = "//caption[normalize-space()='List of companies acquired by Dell Inc.']")
    public WebElement companyList;

    //    tablonun 4. satırını konsolda yazdırın
    @FindBy (xpath = "(//*[@class=\"wikitable sortable jquery-tablesorter\"]//tr)[5]")
    public WebElement satirDortList;
    //    ayrıca 5. satırdaki 2. ve 3. öğeleri (ortadaki 2 öğe) konsola yazdırın
    @FindBy (xpath = "((//*[@class=\"wikitable sortable jquery-tablesorter\"]//tr)[5])//td[1]")
    public WebElement satirBesikinci;
    //    ( 2nd and 3rd ogeler : November 2, Cloud integration leader)
    @FindBy (xpath = "((//*[@class=\"wikitable sortable jquery-tablesorter\"]//tr)[5])//td[2]")
    public WebElement satirBesucuncu;
    //    6. satirin ilk hucresinde Compellent yazisinin goruntulendigini dogrulayin
    @FindBy (xpath = "((//*[@class=\"wikitable sortable jquery-tablesorter\"]//tr)[7])//th")
    public WebElement satirAltibirinci;
}
