@US018
Feature: US018 Class Work

  Scenario: explicitly wait
    # https://demoqa.com/dynamic-properties
    Given kullanici "demoqaUrl" anasayfasinda
    Then Visible After five seconds butonunun gorunur olmasini bekleyin
    And Visible After five seconds butonunun gorunur oldugunu test edin