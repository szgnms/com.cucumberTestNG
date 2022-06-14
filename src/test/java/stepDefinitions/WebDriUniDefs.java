package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.WebDriUniPage;
import utilities.Driver;

import java.awt.*;
import java.util.ArrayList;

public class WebDriUniDefs {

    WebDriUniPage wdu=new WebDriUniPage();
    ArrayList<String>handles;
    Robot rbt;

    {
        try {
            rbt = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    Actions act= new Actions(Driver.getDriver());
    String url;
    @And("login portala kadar sayfayi indir")
    public void loginPortalaKadarSayfayiIndir() {
        rbt.mouseWheel(3);
        url=Driver.getDriver().getCurrentUrl();

    }

    @Then("login portala tiklayin")
    public void loginPortalaTiklayin() {
        wdu.loginPortal.click();
    }

    @Then("diger windowa gecin")
    public void digerWindowaGecin() {
        handles=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(handles.get(1));
    }

    @And("username ve password kutularina deger yazin")
    public void usernameVePasswordKutularinaDegerYazin() {
       wdu.username.sendKeys("user");
       act.sendKeys(Keys.TAB).sendKeys("pass").perform();

    }

    @And("login butonuna tiklayin")
    public void loginButonunaTiklayin() {
        wdu.loginButton.click();
    }

    @Then("popup'ta cikan yazinin {string} oldugunu test edin")
    public void popupTaCikanYazininOldugunuTestEdin(String kelime) {
        Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().contains(kelime));
    }

    @Then("ok diyerek Popup`i kapatin")
    public void okDiyerekPopupIKapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("ilk sayfaya geri donun")
    public void ilkSayfayaGeriDonun() {
        Driver.getDriver().switchTo().window(handles.get(0));
    }

    @Then("ilk sayfaya donuldugunu test edin")
    public void ilkSayfayaDonuldugunuTestEdin() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),url);

    }


    @Then("tum sayfalari kapatir")
    public void tumSayfalariKapatir() {
        Driver.quitDriver();
    }
}
