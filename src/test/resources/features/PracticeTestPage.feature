@practiceClick
Feature: Cucumber Java Manipulation

  Scenario: Practice Click and Keys

    Given "https://testpages.herokuapp.com/styled/key-click-display-test.html" adresine gidin
    And 50 defa click me ye tiklayin
    And 50 defa Space dugmesine basin
    And Down yazisindaki iki basamakli sayilarin hepsini toplayin
    And Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin
    Then sonucun 1100 oldugunu dogrulayin
    And sayfayi kapatir