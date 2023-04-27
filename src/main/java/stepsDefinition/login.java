package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static java.lang.Thread.sleep;
import org.openqa.selenium.*;

public class login {

    @Given("Open login page")
    public void open_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.startBrowser("https://www.tme.eu/ro/");
        sleep(2000);
     // Remove website cookies
        WebDriverInit.getDriver().findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
        sleep(2000);
    }

    @Then("Click on {string}")
    public void login_to(String buttonlog) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@aria-label='"+buttonlog+"']"))
                .click();
        sleep(1000);

    }
    @Then("Insert user {string}")
    public void insert_user(String user) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                        .xpath("//*[@class='c-login-modal__input o-form__input u-font-size-base js-processed']"))
                .sendKeys(user);
        sleep(1000);
    }
    @Then("Insert password {string}")
    public void insert_password(String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                        .xpath("//*[@class='c-login-modal__input c-login-modal__input--password o-form__input u-font-size-base js-processed']"))
                .sendKeys(password);
        sleep(1000);
    }
    @Then("Click on button {string}")
    public void click_on_buttton(String enterbutton) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                        .xpath("//*[@class='c-login-modal__submit-btn js-login-modal__submit-btn o-button o-button--medium o-button-filled--blue js-processed']"))
                .click();
        sleep(1000);
    }
    @Then("Check the Error text")
    public void check_the_errpr_text() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(WebDriverInit.getDriver().findElement(By
                .xpath("//*[@class='alert alert-block alert-error']")).getText());
        sleep(1000);
    }

    // User ok and No Password
    @Then("Insert LoginUser {string}")
    public void Insert_LoginUser(String login2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@id='FormLogin_login']")).clear();
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//*[@id='FormLogin_login']")).sendKeys(login2);
        sleep(1000);
    }


    @Then("Insert LoginPass {string}")
    public void Insert_LoginPass(String logpass) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@id='FormLogin_password']")).sendKeys(logpass);
        sleep(1000);
    }

    @Then("Click on Loginbutton {string}")
    public void ClickonLoginbutton(String loginbtn) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@id='"+loginbtn+"']")).click();
        sleep(1000);
    }
// Scenarion Search a product and add to favorite

    @Then("Search product {string}")
    public void Searchproduct(String multimetru) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@name='search']")).sendKeys(multimetru);
        sleep(500);
        WebDriverInit.getDriver().findElement(By.xpath("//*[@class='c-header__search-button o-button o-button-filled--red']")).click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)WebDriverInit.getDriver();
        jse.executeScript("window.scrollBy(0,350)");
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//*[@class='button button-grey']")).click();
        sleep(1000);
    }
    //    Actions actions = new Actions(driver);
    //        actions.scrollByAmount(0, 1200).perform();

    @Then("Add product in Favorite")
    public void addproductinfavorite() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
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


    }
    @Then("Create a fav folder {string}")
    public void createafavfolder(String folder) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@placeholder='Denumire folder']")).sendKeys(folder);
        sleep(1000);
//        driver.findElement(By.xpath("//button[@class='o-button o-button--medium o-button-filled--blue']"))
        WebDriverInit.getDriver().findElement(By.xpath("//*[@data-gtm-prod-id='FLK-87V']//*[contains(text(), 'Adaugă la Favorite')]"))
                .click();
        sleep(1000);
    }

    @Then("Delete the product from Favorite")
    public void deletetheproductfromfavorite() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        sleep(1000);
    }

}
