package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class GittiGidiyorPage {
    public GittiGidiyorPage()  {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Keşfetmeye Bak']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//span[normalize-space()='2']")
    public WebElement ikinciSayfa;

    @FindBy(xpath = "//span[normalize-space()='Kapat']")
    public WebElement cookie;
    @FindBy(xpath = "//h1[@id='sp-title']")
    public WebElement urunAdi;
    @FindBy(xpath = "//span[@id='sp-price-highPrice']")
    public WebElement urunFiyati;

    @FindBy(xpath = "(//*[@class='sc-1nx8ums-0 dyekHG'])[2]")
    public WebElement urunAc;

    @FindBy(xpath = "//div[@id='sp-addbasket-button']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//a[@class='gg-ui-btn-default padding-none']")
    public WebElement sepeteGit;

    @FindBy(xpath = "//*[@class='total-price-box']")
    public WebElement sepetUrunFiyat;

    @FindBy(xpath = "((//select[@class='amount'])[1]//option)[2]")
    public WebElement sepetAdetArttir;

    @FindBy(xpath = "//*[@class='gg-d-16 gg-m-14 detail-text']")
    public WebElement sepetAdet;

    @FindBy(xpath = "(//*[@class='gg-icon gg-icon-bin-medium'])[1]")
    public WebElement urunSil;

    @FindBy(xpath = "//h2[contains(text(),'Sepetinizde ürün bulunmamaktadır.')]")
    public WebElement bosSepet;


    }
