Feature: US1004 kullanici parametre ile configuration file`i kullanabilmeli
 @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanma
    Given kullanici "techproeducationUrl" sayfasinda
   Then kullanici 2 sn bekler
    And url`nin "techpro" icerdigini test eder
    Then sayfayi kapatir