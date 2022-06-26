package stepDefinitions;

import io.cucumber.java.en.Then;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Explicitly2Page;
import utilities.Driver;

import java.time.Duration;

public class Expicilitly2StepDefs {
    Explicitly2Page exp2= new Explicitly2Page();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @Then("will enable bes seconds butonunun enable olmasini  bekleyin")
    public void willEnableBesSecondsButonununEnableOlmasiniBekleyin() {
        wait.until(ExpectedConditions.elementToBeClickable(exp2.clickButton));
    }

    @Then("will enable bes seconds butonunun enable oldugunu test  edin")
    public void willEnableBesSecondsButonununEnableOldugunuTestEdin() {
        Assert.assertTrue(exp2.clickButton.isEnabled());
    }


    @Then("visible After bes seconds butonunun gorunur olmasini  bekleyin")
    public void visibleAfterBesSecondsButonununGorunurOlmasiniBekleyin() {
        wait.until(ExpectedConditions.visibilityOf(exp2.afterButton));
    }

    @Then("visible After bes seconds butonunun gorunur oldugunu test edin")
    public void visibleAfterBesSecondsButonununGorunurOldugunuTestEdin() {
        Assert.assertTrue(exp2.afterButton.isDisplayed());
    }
}
