Feature: Tme val max

  Background: Open Tme page
    Given Open login page


  Scenario:   Add a product to shopping cart

    Then      Search product "Fluke 87V"
    And       Order the Product
    *         Insert LoginUser "Ovidiu_New86"
    *         Insert LoginPass "AziMutFinal_10052023"
    *         Click on Loginbutton "loginBtn"
    *         In popup page Click on button "Pasul urmator"
    *         In the new page Click on button "Continuaţi cumpărăturile"

#    // nu mai functioneaza pt ca am atins numarul maxim de comenzi pe site =))

  Scenario:   Check the shopping cart

    Then      Click on shopping basket "Coş"
    And       In right side Click on "Va rugam logati-va"
    *         Insert user "Ovidiu_New86"
    *         Insert password "AziMutFinal_10052023"
    *         Click on button "Logati-va"
    *         Click again on shopping basket "Coş"
    *         For the product select "10" parts
    *         Save the modification

#  Scenario:   Val max of order for normal client


#    *         Check the error from message