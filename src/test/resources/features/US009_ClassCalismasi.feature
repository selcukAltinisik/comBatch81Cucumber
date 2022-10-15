@ClassCalismasi
Feature: Class Calismasi

  Scenario Outline: Class Calismasi Outline
    Given kullanici "dataUrl" adresine gider
    Then new butonuna basar
    Then kullanici 2 saniye bekler
    And isim bolumune "<firstname>" girer
    And soyisim bolumune "<lastname>" girer
    And position bolumune"<position>" girer
    And ofis bolumune "<ofisbilgisi>" girer
    And extension bolumune "<extension>" girer
    And startdate bolumune"<Stardate>"  girer
    And salary bolumune "<Salary>" girer
    And Create tusuna basar
    Then kullanici 3 saniye bekler
    When kullanici "<firstname>" ile arama yapar
    Then kullanici 2 saniye bekler
    Then isim bolumunde "<firstname>" oldugunu dogrular
    Then kullanici 2 saniye bekler
    Examples:
      | firstname | lastname | position | ofisbilgisi | extension | Stardate   | Salary |
      | Ali       | Veli     | Qa       | Google      | Senior    | 2022-10-12 | 15000  |
      | Ahmet     | Mehmet   | Qa       | Google      | Junior    | 2022-10-12 | 10500  |
      | Hasan     | Duman    | Dev      | Amazon      | Junior    | 2022-10-12 | 25000  |
      | Akin      | Alkan    | Dev      | Amazon      | Senior    | 2022-10-12 | 50000  |
      | Orhan     | Duman    | PO       | WallMart    | Senior    | 2022-10-12 | 30000  |

    #5 farkli kullanici bilgisi girer