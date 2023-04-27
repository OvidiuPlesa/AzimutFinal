Feature: Tme Login

  Background: Open Tme page
    Given Open login page

  Scenario: Login page user and password
    Then    Click on "Va rugam logati-va"
#    Wrong user and password
    And     Insert user "ovidiu_plesa@yahoo.com"
    And     Insert password "nenea eu"
    *       Click on button "Logati-va"
    *       Check the Error text
#    User ok and No password
    *       Insert LoginUser "Ovidiu_Plesa"
    *       Insert LoginPass ""
    *       Click on Loginbutton "loginBtn"
    *       Check the Error text

#   User and password ok
    *       Insert LoginUser "Ovidiu_Plesa"
    *       Insert LoginPass "Junior_361"
    *       Click on Loginbutton "loginBtn"
