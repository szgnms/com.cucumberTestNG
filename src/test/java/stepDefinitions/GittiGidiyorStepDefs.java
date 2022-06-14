package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.GittiGidiyorPage;
import utilities.Driver;

import java.awt.*;
import java.io.*;
import java.time.Duration;

public class GittiGidiyorStepDefs {
    GittiGidiyorPage gtd = new GittiGidiyorPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
     String gtdUrl;
     Robot rbt=new Robot();
     Actions act= new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));

    public GittiGidiyorStepDefs() throws AWTException {
    }

    @Then("Arama kutucuguna bilgisayar kelimesi girilir")
    public void aramaKutucugunaBilgisayarKelimesiGirilir() {
        gtd.cookie.click();
        gtd.aramaKutusu.sendKeys("bilgisayar" + Keys.ENTER);

    }


    @And("Arama sonuclari sayfasindan ikinci sayfa acilir")
    public void aramaSonuclariSayfasindanIkinciSayfaAcilir()  {
      rbt.mouseWheel(42);
        wait.until(ExpectedConditions.visibilityOf(gtd.ikinciSayfa));
        gtd.ikinciSayfa.click();


    }

    @Then("ikinci sayfanin acildigi kontrol edilir")
    public void ikinciSayfaninAcildigiKontrolEdilir() {
        gtdUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(gtdUrl.contains("sf=2"));

    }

    @Then("Sonuca gore sergilenen urunlerden rastgele bir urun secilir")
    public void sonucaGoreSergilenenurunlerdenRastgeleBirUrunSecilir() {
        gtd.urunAc.click();
    }

    @Then("Secilen urunun urun bilgisi ve tutar bilgisi txt dosyasina yazilir")
    public void secilenUrununUrunnBilgisiVeTutarBilgisiTxtDosyasinaYazilirr() throws IOException {
      writefile();

    }

    @Then("Secilen urun sepete eklenir")
    public void secilenUrunSepeteEklenir() {
        gtd.sepeteEkle.click();

    }

    @Then("urun sayfasindaki fiyat ile sepette yer alan urun fiyatinin dogrulugu karsilastirilir")
    public void urunSayfasindakiFiyatIleSepetteYerAlanUrunFiyatininDogruluguKarsilastirilir() {
        String urunfiyat=gtd.urunFiyati.getText();
        act.moveToElement(gtd.sepeteGit);
        gtd.sepeteGit.click();
        String sepetfiyat=gtd.sepetUrunFiyat.getText();
        Assert.assertEquals(urunfiyat,sepetfiyat);

    }

    @Then("Adet arttirilarak urun adedinin iki oldugu dogrulanir")
    public void adetArttirilarakUrunAdedininOlduguDogrulanir() throws InterruptedException {
        gtd.sepetAdetArttir.click();
        Thread.sleep(2000);

        Assert.assertTrue(gtd.sepetAdet.getText().contains("2 Adet"));
    }

    @Then("urun sepetten silinerek sepetin bos oldugu kontrol edilir")
    public void urunSepettenSilinerekSepetinBosOlduguKontrolEdilir() throws InterruptedException {
        gtd.urunSil.click();
        Thread.sleep(2000);
        Assert.assertTrue(gtd.bosSepet.isDisplayed());
    }
    public void writefile() throws IOException {
        File file = new File("C:\\Users\\ms\\Documents\\GitHub\\com.cucumberTestNG\\Gittigidiyor.txt");
        FileWriter fl=new FileWriter(file);
           fl.write(gtd.urunAdi.getText());
           fl.write("\n");
            fl.write(gtd.urunFiyati.getText());
            fl.close();


    }
}
