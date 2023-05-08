Feature: Tme product

  Background: Open Tme page
    Given Open login page


  Scenario:   Search a product and add to Favorite Folder

   When       Search product "Fluke 87V"
   Then       Add product in Favorite
   And        Insert LoginUser "Ovidiu_New86"
   And        Insert LoginPass "AziMutFinal_10052023"
   Then       Click on Loginbutton "loginBtn"
   And        Create a Favorite folder "Multimetru"
   And        Add the product to Favorite Folder

  Scenario: Check and delete Favorite Folder
# Preconditions - the Scenario with Favorite Folder should be performed ok

   When       Click on the Favorite Button
   Then       Insert user "Ovidiu_New86"
   And        Insert password "AziMutFinal_10052023"
   Then       Click on login button
   And        Open Favorite folder named "Multimetru"
   Then       Select checkbox for product
   And        Delete the product from Favorite
   Then       Check button "execută"
   And        Delete the Favorite folder
   And        Check button "execută"