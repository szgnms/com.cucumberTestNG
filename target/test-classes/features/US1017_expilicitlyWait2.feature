@exwait2
Feature: US1017 ExplicitlyWait
  Scenario: alerts

    Given kullanici "demogaDyUrl" anasayfasinda
    Then  will enable bes seconds butonunun enable olmasini  bekleyin
    Then will enable bes seconds butonunun enable oldugunu test  edin
