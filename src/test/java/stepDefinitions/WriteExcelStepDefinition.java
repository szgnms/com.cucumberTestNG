package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javax.swing.*;
import javax.swing.text.html.StyleSheet;
import java.io.*;

public class WriteExcelStepDefinition {
    String dosyaYolu = "src/test/resources/ulkeler.xlsx";
    FileInputStream fis;
    Workbook wk;
    FileOutputStream fos;

    @Given("kullanici yeni bir sutun olusturur")
    public void kullaniciYeniBirSutunOlusturur() throws IOException {
        fis = new FileInputStream(dosyaYolu);
        wk = WorkbookFactory.create(fis);
        wk.getSheet("Sayfa1").getRow(0).createCell(4);
    }

    @Then("baslik satirinda ilk bos hucreye yeni bir cell olusturalimOlusturdugumuz hucreye ulke nufusu yazdiralim")
    public void baslikSatirindaIlkBosHucreyeYeniBirCellOlusturalimOlusturdugumuzHucreyeUlkeNufusuYazdiralim() {
        wk.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("POPULATION");
    }

    @Then("{int}.satir nufus kolonuna {int} milyon yazdiralim")
    public void satirNufusKolonunaMilyonYazdiralim(int row, int yazi) {
        wk.getSheet("Sayfa1").getRow(row).createCell(4).setCellValue(yazi);
    }

    @Then("Dosyayi kaydedelim")
    public void dosyayiKaydedelim() throws IOException {
        fos = new FileOutputStream(dosyaYolu);
        wk.write(fos);
    }

    @Then("Dosyayi kapatalim")
    public void dosyayiKapatalim() throws IOException {
        wk.close();
        fis.close();
        fos.close();
    }
}

















