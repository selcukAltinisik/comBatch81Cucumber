@US1011ClassWork
Feature: US1011ClassWork

  Scenario: Herocap sitesi buton tarama

    Given User goes to direct "https://the-internet.herokuapp.com/add_remove_elements/"
    When Add Element butona basin
    And Delete butonu gorunur oluncaya kadar bekleyin
    Then Delete butonunun gorunur oldugunu test edin
    And Delete butonuna basarak butonu silin
    Then AddRemove Elements yazisinin gorunurlugunu test eder
    And User waits 3 second
    And Delete butonunun gorunmedigini test edin
    And User waits 3 second
    And User close browser
