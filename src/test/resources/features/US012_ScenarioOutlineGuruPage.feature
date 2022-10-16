@US011ClassWork
Feature: US011 Class Work

  @guru
  Scenario Outline: TC01_kullanici_sutun_basligi_ile_liste_alabilmeli
    Given kullanici "guruUrl" ana sayfasinda
    And "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |
    Scenario: Kullanici Sayfayi Kapatir
      Given sayfayi kapatir