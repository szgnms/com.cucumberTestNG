package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.HerOkuPage;
import utilities.Driver;

import java.time.Duration;

public class HerOkuDefs {
    HerOkuPage hop =new HerOkuPage();
    @And("add element butonuna basar")
    public void addElementButonunaBasar() {
        hop.addElement.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(hop.delButton));
    }

    @And("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(hop.delButton.isDisplayed());


    }

    @Then("Delete butonuna basar")
    public void deleteButonunaBasar() {
        hop.delButton.click();


    }

    @And("Delete butonunun gorunmedigini test eder")
    public void deleteButonununGorunmediginiTestEder() {
        Assert.assertFalse(Boolean.parseBoolean(hop.del.getAccessibleName()));



    }
}
