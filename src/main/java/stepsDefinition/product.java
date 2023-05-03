package stepsDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import static java.lang.Thread.sleep;

public class product {

//      Scenario Search a product and add to favorite
    @Then("Search product {string}")
    public void searchProduct(String multimetru) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@name='search']")).sendKeys(multimetru);
        sleep(1000);
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[@class='c-header__search-button o-button o-button-filled--red']"))
                .click();
        sleep(1000);
        //Scroll down in the web page
        JavascriptExecutor jse = (JavascriptExecutor)WebDriverInit.getDriver();
        jse.executeScript("window.scrollBy(0,350)");
        sleep(1000);
        //Hide filters by click on button "Ascunde filtrele"
        WebDriverInit.getDriver().findElement(By.xpath("//*[@class='button button-grey']")).click();
        sleep(1000);
    }

    @Then("Add product in Favorite")
    public void addProductInFavorite() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[@data-gtm-prod-id='FLK-87V']" +
                        "//a[@class='c-product-row__option-link c-product-option__link']")).click();
        sleep(2000);
    }

    @Then("Create a Favorite folder {string}")
    public void createAFavoriteFolder(String folder) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[contains(text(),'Creare folder nou')]")).click();
        sleep(1000);
        WebDriverInit.getDriver().findElement(By
                .xpath("//input[@name='parking-directory-name']")).sendKeys(folder);
        sleep(1000);
        WebDriverInit.getDriver().findElement(By
                .xpath("//a[contains(text(),'Salvează')]")).click();
        sleep(1000);
    }

    @Then("Add the product to Favorite Folder")
    public void addTheProductToFavoriteFolder() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//a[contains(text(),'OK')]")).click();
        sleep(2000);
    }

//      Scenario: Check and delete Favorite Folder

    @Then("Click on the Favorite Button")
    public void clickOnTheFavoriteButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//button[@class='c-header__favourites-button']"))
                .click();
        sleep(2000);
    }
    @Then("Open Favorite folder named {string}")
    public void openFavoriteFolderNamed(String favname) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[contains(text(),'"+favname+"')]"))
                .click();
        sleep(2000);
    }

    @Then("Select checkbox for product")
    public void selectCheckboxForProduct() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[@class='rd-table items clean tablesorter-ready tablesorter hasSaveSort']" +
                        "//*[@class='rd-checkmark']")).click();
        sleep(2000);
    }
    @Then("Delete the product from Favorite")
    public void deleteTheProductFromFavorite() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[@id='directory-container']//*[contains(text(),'Ştergere')]")).click();
        sleep(2000);
    }

    @Then("Check button {string}")
    public void checkButtton(String ackdelet) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                        .xpath("//*[@class='popup_panel']//*[contains(text(),'"+ackdelet+"')]")).click();
        sleep(2000);
    }

    @Then("Delete the Favorite folder")
    public void deleteTheFavoriteFolder() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@class='parking__option-button " +
                        "parking__option-remove parking__option-button--danger']")).click();
        sleep(2000);
    }


}
