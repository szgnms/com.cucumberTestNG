package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.WikiPage;
import utilities.Driver;

import java.awt.*;
import java.util.List;

public class WikiStepDefs {
    Actions act=new Actions(Driver.getDriver());
    WikiPage wiki =new WikiPage();
    @Then("List of companies acquired by Dell Inc. tablosuna git")
    public void listOfCompaniesAcquiredByDellIncTablosunaGit() {
        act.moveToElement(wiki.companyList).perform();

    }
    @And("tablonun {int}. satirini konsolda yazdirin")
    public void tablonunSatiriniKonsoldaYazdirin(int arg0) {
        System.out.println(wiki.satirDortList.getText());
    }
    @And("ayrica besinci satirdaki iki ve ucuncu ogeleri konsola yazdirin")
    public void ayricaSatirdakiikiveucuncuOgeleriKonsolaYazdirin() {
        System.out.println(wiki.satirBesikinci.getText());
        System.out.println(wiki.satirBesucuncu.getText());


    }

    @Then("altinci satirin birinci hucresinde Compellent yazisinin goruntulendigini dogrulayin")
    public void altinciSatirinHucresindeCompellentYazisininGoruntulendiginiDogrulayin() {
        Assert.assertTrue(wiki.satirAltibirinci.getText().contains("Compellent"));
    }
}
