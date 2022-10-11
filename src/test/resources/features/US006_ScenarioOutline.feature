Feature: US006 kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 kullanici istedigi kelimeleri aratir

    Given kullanici amazon sayfasina gider
    Then kullanici "<istenenKelime>" icin arama yapar
    Then sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | nutella       | nutella              |
      | selenium      | selenium             |
      | sql           | sql                  |

    # TestNG'deki dataProvider kullanımındaki gibi Cucumberda da Scenario Outline kullaniriz.
    # Bu şekilde birden fazla kelimeyi tek seferde aratabiliriz.
