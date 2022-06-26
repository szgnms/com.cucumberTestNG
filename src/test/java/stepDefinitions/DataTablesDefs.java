package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesDefs {
Actions actions = new Actions(Driver.getDriver());
    DataTablesPage dtb = new DataTablesPage();

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dtb.newButton.click();

    }


    @And("create tusuna basar")
    public void createTusunaBasar() {
        dtb.createButton.click();
    }


    @And("tum bilgileri {string},{string},{string},{string},{string},{string},{string} girer")
    public void tumBilgileriGirer(String firstName, String lastName,
                                  String position, String office ,
                                  String extension, String startDate,
                                  String salary) {
        actions.sendKeys(firstName).sendKeys(Keys.TAB).sendKeys(lastName).sendKeys(Keys.TAB)
                .sendKeys(position).sendKeys(Keys.TAB).sendKeys(office).sendKeys(Keys.TAB)
                .sendKeys(extension).sendKeys(Keys.TAB).sendKeys(startDate).sendKeys(Keys.TAB).sendKeys(salary).perform();

    }

    @When("kullanici ilk isim ile arama yapar{string}")
    public void kullaniciIlkIsimIleAramaYapar(String firstName) {
        dtb.search.sendKeys(firstName+Keys.ENTER);
    }

    @Then("isim bolumunde isminin oldugunu dogrular{string}")
    public void isimBolumundeIsmininOldugunuDogrular(String firstname) {
        Assert.assertTrue(dtb.nameControl.getText().contains(firstname));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        try {
            Thread.sleep(saniye* 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}