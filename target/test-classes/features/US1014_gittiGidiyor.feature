
@gtdgd
Feature: gittigidiyor test

  Scenario: sepet islemleri
    Given kullanici "gittigidiyorUrl" anasayfasinda
    Then Arama kutucuguna bilgisayar kelimesi girilir
    And kullanici 5 saniye bekler
    And Arama sonuclari sayfasindan ikinci sayfa acilir
    And kullanici 2 saniye bekler
    Then ikinci sayfanin acildigi kontrol edilir
    Then Sonuca gore sergilenen urunlerden rastgele bir urun secilir
    Then Secilen urunun urun bilgisi ve tutar bilgisi txt dosyasina yazilir
    And kullanici 2 saniye bekler
    Then Secilen urun sepete eklenir
    And kullanici 2 saniye bekler
    Then urun sayfasindaki fiyat ile sepette yer alan urun fiyatinin dogrulugu karsilastirilir
    And kullanici 2 saniye bekler
    Then Adet arttirilarak urun adedinin iki oldugu dogrulanir
    And kullanici 2 saniye bekler
    Then urun sepetten silinerek sepetin bos oldugu kontrol edilir
    And kullanici 2 saniye bekler
    And sayfayi kapatir





