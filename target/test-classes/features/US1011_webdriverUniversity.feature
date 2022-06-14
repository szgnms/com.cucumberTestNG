@webdri

Feature: US1011 webdriveruniversity test

  Scenario: webdriveruniversity testi

    Given kullanici "webDrUniUrl" anasayfasinda
    And login portala kadar sayfayi indir
    And kullanici 2 saniye bekler
    Then login portala tiklayin
    Then diger windowa gecin
    And username ve password kutularina deger yazin
    And login butonuna tiklayin
    Then popup'ta cikan yazinin "validation failed" oldugunu test edin
    Then ok diyerek Popup`i kapatin
    And ilk sayfaya geri donun
    Then ilk sayfaya donuldugunu test edin
    Then tum sayfalari kapatir







