package stepsDefinition;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import static java.lang.Thread.sleep;

public class valMaxiProduct {

    @Then("Order the Product")
    public void orderTheProduct() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        sleep(1000);
        //Scroll down in the web page
        JavascriptExecutor jse = (JavascriptExecutor)WebDriverInit.getDriver();
        jse.executeScript("window.scrollBy(0,150)");
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//*[@class='order_button_container']" +
                        "//*[@data-gtm-prod-id='FLK-87V']")).click();
        sleep(2000);
    }
    @Then("In popup page Click on button {string}")
    public void inPopupPageClickOnButton(String buttonnext) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//button[@type='button']" +
                        "//*[contains(text(),'"+buttonnext+"')]")).click();
        sleep(2000);
    }

    @Then("In the new page Click on button {string}")
    public void inTheNewPageClickOnButton(String newbutton1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //Scroll down in the web page
        JavascriptExecutor jse = (JavascriptExecutor)WebDriverInit.getDriver();
        jse.executeScript("window.scrollBy(0,250)");
        sleep(1000);
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[@class='c-cart-footer__container c-cart-footer__container-step-2']" +
                        "//*[contains(text(),'"+newbutton1+"')]")).click();
        sleep(2000);
    }

    //  Scenario:   Check the shopping cart

    @Then("Click on shopping basket {string}")
    public void clickOnShoppingBasket(String shoppingbaschet) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@aria-label='"+shoppingbaschet+"')]"))
                .click();
        sleep(2000);
    }

    @Then("In right side Click on {string}")
    public void inRightSideClickOn(String logbutton) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[@class='c-basket-widget-drawer__login-button-container']" +
                        "//*[contains(text(),'"+logbutton+"')]")).click();
        sleep(2000);
    }

    @Then("Click again on shopping basket {string}")
    public void clickAgainOnShoppingBasket(String basket) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@aria-label='"+basket+"')]")).click();
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//*[@class='c-basket-widget__button-container']" +
                        "//*[contains(text(),'Mergeți la coș ')]")).click();
        sleep(2000);
    }

    //  Scenario:   Val max of order for normal client

    @Then("For the product select {string} parts")
    public void forTheProductSelectParts(String number) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@class='c-order-line__options']"))
                .sendKeys(number);
        sleep(1000);
    }

    @Then("Save the modification")
    public void saveTheModification() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@class='c-order-line__options--grid']"))
                .click();
        sleep(1000);
    }

    /*
    @Then("Check the error from message")
    public void checktherrorfrommessage() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                        .xpath(""))
                .click();
        sleep(1000);
    }

     */

}
