Feature: Tme product

  Background: Open Tme page
    Given Open login page


  Scenario:   Search a product

   And        Search product "Fluke 87V"
   Then       Add product in Favorite
    *         Insert LoginUser "Ovidiu_New86"
    *         Insert LoginPass "AziMutFinal_10052023"
    *         Click on Loginbutton "loginBtn"
    *         Create a Favorite folder "Multimetru"
    *         Add the product to Favorite Folder
    *         Check the Favorite Folder
    *         Delete the product from Favorite