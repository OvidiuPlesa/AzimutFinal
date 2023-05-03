Feature: Tme product

  Background: Open Tme page
    Given Open login page


  Scenario:   Search a product and add to Favorite Folder

   And        Search product "Fluke 87V"
   Then       Add product in Favorite
    *         Insert LoginUser "Ovidiu_New86"
    *         Insert LoginPass "AziMutFinal_10052023"
    *         Click on Loginbutton "loginBtn"
    *         Create a Favorite folder "Multimetru"
    *         Add the product to Favorite Folder

  Scenario: Check and delete Favorite Folder
# Preconditions - the Scenario with Favorite Folder should be performed ok

   And        Click on the Favorite Button
   Then       Insert user "Ovidiu_New86"
    *         Insert password "AziMutFinal_10052023"
    *         Click on button "Logati-va"
    *         Open Favorite folder named "Multimetru"
    *         Select checkbox for product
    *         Delete the product from Favorite
    *         Check button "execută"
    *         Delete the Favorite folder
    *         Check button "execută"