
@Background
Feature: US001 Background Kullanimi

  Background: Ortak adimlar
    Given kullanici amazon sayfasina gider

  @gp1
  Scenario: TC01 kullanici amazonda Nutella aratir

    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
  @gp3
  Scenario: TC02 kullanici amazonda Selenium aratir

    Then kullanici Selenium icin arama yapar
    And sonuclarin Selenium icerdigini test eder
  @gp2
  Scenario: TC03 kullanici amazonda iphone aratir

    Then kullanici iphone icin arama yapar
    And sonuclarin iphone icerdigini test eder
    And sayfayi kapatir
