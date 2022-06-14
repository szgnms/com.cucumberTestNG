package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.ExplicitlyPage;
import utilities.Driver;

import java.time.Duration;

public class ExplicitlyStepDefs {
    ExplicitlyPage exp= new ExplicitlyPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @Then("Alerts’e tiklayin")
    public void alertsETiklayin() {
        exp.alertButton.click();
    }

    @Then("On button click, alert will appear after bes seconds karsisindaki click me butonuna basin")
    public void onButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasin() {
        exp.clickMeButton.click();
    }

    @Then("Allert’in gorunur olmasini bekleyin")
    public void allertInGorunurOlmasiniBekleyin() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @Then("Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test   edin")
    public void allertUzerindekiYazininThisAlertAppearedAfterSecondsOldugunuTestEdin() {
        Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().contains("This alert appeared after 5 seconds"));
    }

    @Then("Ok diyerek alerti kapatin")
    public void okDiyerekAlertiKapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }
}
