@wip
Feature: US1003 kullanici parametre kullanrak arama yapabilmeli

  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli

    Given kullanici "amazonUrl" anasayfasinda
    And kullanici "java" icin arama yapar
    And sonuclarin "hava" icerdigini test eder
    Then sayfayi kapatir