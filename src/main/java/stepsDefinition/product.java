package stepsDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static java.lang.Thread.sleep;

public class product {

    // Scenario Search a product and add to favorite
    @Then("Search product {string}")
    public void Searchproduct(String multimetru) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@name='search']")).sendKeys(multimetru);
        sleep(1000);
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[@class='c-header__search-button o-button o-button-filled--red']")).click();
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
    public void addproductinfavorite() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[@data-gtm-prod-id='FLK-87V']//a[@class='c-product-row__option-link c-product-option__link']"))
                .click();
        sleep(1000);
        /*
        WebDriverInit.getDriver().findElement(By.xpath("//*[@title='FLK-87V; Multimetru digital; LCD (6000/20000),iluminat; True RMS AC']"))
                .click();
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//*[@class='c-pip__actions-container c-pip__actions-container--desktop']"))
                .click();
        sleep(1000);

//        driver.findElement(By.xpath("//*[contains(text(), ‘Echipamente de atelier')]")).click();
        WebDriverInit.getDriver().findElement(By.xpath("//*[contains(text(), 'Echipamente de atelier')]")).click();
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//*[contains(text(), 'Instrumente de măsurare ')]"))
                .click();
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//*[contains(text(), 'Multimetre digitale ')]"))
                .click();
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//*[contains(text(), 'Multimetre digitale portabile')]"))
                .click();
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//input[@id='parameter_input_2']")).sendKeys("FLUKE");
        sleep(1000);
//        driver.findElement(By.xpath("//*[@id='similar_param_267']")).click();
//        driver.findElement(By.xpath("//*[@id='similar_param_267']/following-sibling::span[@class='rd-checkmark']"))
//                .click();
        WebDriverInit.getDriver().findElement(By.xpath("//*[contains(text(), 'FLUKE')]")).sendKeys(Keys.ENTER);
        sleep(1000);
         */
    }

    @Then("Create a Favorite folder {string}")
    public void createafavfolder(String folder) throws InterruptedException {
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
    public void AddtheproducttoFavoriteFolder() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//a[contains(text(),'OK')]")).click();
        sleep(1000);
    }

    @Then("Check the Favorite Folder")
    public void ChecktheFavoriteFolder() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//button[@class='c-header__favourites-button']")).click();
        sleep(1000);
    }

    @Then("Delete the product from Favorite")
    public void deletetheproductfromfavorite() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        sleep(1000);
    }



}
