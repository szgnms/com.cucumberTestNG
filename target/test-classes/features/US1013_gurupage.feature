Feature: US1013 guru page test

  @guru
  Scenario Outline: guru page webtable testi
    Given kullanici "guruUrl" anasayfasinda
    And "<istenenBaslik>", sutunundaki tum degerleri yazdirir

    Examples:
      | istenenBaslik      |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |



