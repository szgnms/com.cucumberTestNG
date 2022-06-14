@exwait
Feature: US1017 ExplicitlyWait
  Scenario: alerts

    Given kullanici "demogaDyUrl" anasayfasinda
    Then visible After bes seconds butonunun gorunur olmasini  bekleyin
    Then visible After bes seconds butonunun gorunur oldugunu test edin

