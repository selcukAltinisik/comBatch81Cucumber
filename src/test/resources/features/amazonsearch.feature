Feature: Amazon Search

  Scenario: TC01 Kullanıcı amazonda nutella aratır

    Given Kullanici amazon sayfasina gider
    Then Kullanici nutella aratir
    And sonuclarin nutella icerdigini test eder
    And sayfayi kapatir