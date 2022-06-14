@excel
Feature: US1015 write excel

  Scenario: write excel

    Given kullanici yeni bir sutun olusturur
    Then  baslik satirinda ilk bos hucreye yeni bir cell olusturalimOlusturdugumuz hucreye ulke nufusu yazdiralim
    Then  2.satir nufus kolonuna 250000000 milyon yazdiralim
    Then  8.satir nufus kolonuna 850000000 milyon yazdiralim
    Then  Dosyayi kaydedelim
    Then  Dosyayi kapatalim