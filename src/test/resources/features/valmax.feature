Feature: Tme val max

  Background: Open Tme page
    Given Open login page


  Scenario:   Search a product
    Then      Click on "Va rugam logati-va"
    And       Insert user "Ovidiu_New86"
    *         Insert password "AziMutFinal_10052023"
    *         Click on button "Logati-va"
    *         Search product "Fluke 87V"