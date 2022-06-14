@exwait
Feature: US1016 ExplicitlyWait
  Scenario: Day36 ExplicitlyWait

    Given kullanici "demogaUrl" anasayfasinda
    Then Alerts’e tiklayin
    Then On button click, alert will appear after bes seconds karsisindaki click me butonuna basin
    Then Allert’in gorunur olmasini bekleyin
    Then Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test   edin
    Then Ok diyerek alerti kapatin

