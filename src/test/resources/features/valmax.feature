Feature: Tme val max

  Background: Open Tme page
    Given Open login page


  Scenario:   Add a product to shopping cart

    Then      Search product "Fluke 87V"
    And       Order the Product
    Then      Insert LoginUser "Ovidiu_New86"
    And       Insert LoginPass "AziMutFinal_10052023"
    Then      Click on Loginbutton "loginBtn"
    And       In popup page Click on button "Pasul urmator"
    Then      In the new page Click on button "Continuaţi cumpărăturile"


  Scenario:   Check the shopping cart
# Precondition: The scenario for add a product to cart should be performed first

    Then      Click on shopping basket "Coş"
    And       In right side Click on "Va rugam logati-va"
    Then      Insert user "Ovidiu_New86"
    And       Insert password "AziMutFinal_10052023"
    Then      Click on login button
    And       Click again on shopping basket "Coş"
    And       Click on button for basket "Mergeți la coș"
    Then      For the product select "10" parts
    And       Save the modification
    And       Check the error from message

  Scenario: Deleted a product from shopping cart
#Precondition: The scenario for add a product to cart should be performed first
    Then    Click on "Va rugam logati-va"
    And     Insert user "Ovidiu_New86"
    And     Insert password "AziMutFinal_10052023"
    Then    Click on login button
    Then    Click on shopping basket "Coş"
    And     Click on button for basket "Mergeți la coș"
    Then    Click on button to delete the product
    And     Then user Logout





