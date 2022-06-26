package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;


public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();



    ConfigReader configReader = new ConfigReader();

    public AmazonStepDefinitions() {
    }

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
            Driver.getDriver().get(configReader.getProperty("amazonUrl"));

    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullanici_nutella_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini test eder")
    public void sonuclarin_nutella_icerdigini_test_eder() {
        String arananKelime = "Nutella";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullanici_java_icin_arama_yapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @Then("sonuclarin Java icerdigini test eder")
    public void sonuclarin_java_icerdigini_test_eder() {
        String arananKelime = "Java";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime = "iphone";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }


    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String kelime) {
        amazonPage.aramaKutusu.sendKeys(kelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String kelime) {
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(kelime));
    }

    @And("url`nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String kelime) {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(kelime));


    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int sn) {
        try {
            Thread.sleep(sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String Url)  {
        Driver.getDriver().get(configReader.getProperty(Url));
    }
}
