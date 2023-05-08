Feature: Tme Login

  Background: Open Tme page
    Given Open login page

  Scenario: Login page user and password
    Then    Click on "Va rugam logati-va"
#    Wrong user and password
    And     Insert user "ovidiu.plesa"
    And     Insert password "nenea eu"
    Then    Click on login button
    And     Check the Error text
#    User ok and No password
    Then    Insert LoginUser "Ovidiu_New86"
    And     Insert LoginPass ""
    Then    Click on Loginbutton "loginBtn"
    And     Check the Error text
#   User and password ok
    Then    Insert LoginUser "Ovidiu_New86"
    And     Insert LoginPass "AziMutFinal_10052023"
    And     Click on Loginbutton "loginBtn"
    Then    Click on Logout button
