@wip
Feature: US1005 wiki list
  @wiki
  Scenario: Wikipeda tables

  Given kullanici "wikiDellUrl" sayfasinda
  Then List of companies acquired by Dell Inc. tablosuna git
  And tablonun 4. satirini konsolda yazdirin
  And ayrica besinci satirdaki iki ve ucuncu ogeleri konsola yazdirin
  #( 2nd and 3rd ogeler : November 2, Cloud integration leader)
  Then altinci satirin birinci hucresinde Compellent yazisinin goruntulendigini dogrulayin

