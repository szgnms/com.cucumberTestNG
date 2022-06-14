package stepDefinitions;

import com.google.common.base.Supplier;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class GuruStepDefs {
    GuruPage guru = new GuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenBaslik) {
        List<List<WebElement>> sutunBaslikListesi = new ArrayList<>();
        sutunBaslikListesi.add(guru.sutunBaslikList1);
        sutunBaslikListesi.add(guru.sutunBaslikList2);
        sutunBaslikListesi.add(guru.sutunBaslikList3);
        sutunBaslikListesi.add(guru.sutunBaslikList4);
        sutunBaslikListesi.add(guru.sutunBaslikList5);

        switch (istenenBaslik) {
            case "Company" -> sutunBaslikListesi.get(0).forEach(t -> System.out.println(t.getText()));
            case "Group" -> sutunBaslikListesi.get(1).forEach(t -> System.out.println(t.getText()));
            case "Prev Close (Rs)" -> sutunBaslikListesi.get(2).forEach(t -> System.out.println(t.getText()));
            case "Current Price (Rs)" -> sutunBaslikListesi.get(3).forEach(t -> System.out.println(t.getText()));
            case "% Change" -> sutunBaslikListesi.get(4).forEach(t -> System.out.println(t.getText()));
        }
    }
}