Feature: Tme Login

  Background: Open Tme page
    Given Open login page

  Scenario: Login page user and password
    Then    Click on "Va rugam logati-va"
#    Wrong user and password
    And     Insert user "ovidiu.plesa"
    And     Insert password "nenea eu"
    *       Click on login button
    *       Check the Error text
#    User ok and No password
    *       Insert LoginUser "Ovidiu_New86"
    *       Insert LoginPass ""
    *       Click on Loginbutton "loginBtn"
    *       Check the Error text
#   User and password ok
    *       Insert LoginUser "Ovidiu_New86"
    *       Insert LoginPass "AziMutFinal_10052023"
    *       Click on Loginbutton "loginBtn"
    *       Click on Logout button
