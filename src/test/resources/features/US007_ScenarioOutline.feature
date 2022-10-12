@US007
Feature: USA006 Scenario Outline Kullanimi

  Scenario Outline: TC01 ConfigReader ile Scenario Outline Kullanimi
    Given kullanici "<arananURL>" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'nin "<arananKelime>" icerdigini test edelim
    And sayfayi kapatir
    Examples:
      | arananURL | arananKelime |
      | amazonUrl | amazon       |
      | faceUrl   | face         |
      | brcUrl    | blue         |
      | google    | google       |
