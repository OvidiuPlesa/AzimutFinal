package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class login {

    @Given("Open login page")
    public void openLoginPage() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.startBrowser("https://www.tme.eu/ro/");
        sleep(2000);
        // Remove website cookies
        WebDriverInit.getDriver().findElement(By
                        .xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']"))
                .click();
        sleep(2000);
    }

    @Then("Click on {string}")
    public void clickOn(String buttonlog) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@aria-label='" + buttonlog + "']"))
                .click();
        sleep(2000);

    }

    @Then("Insert user {string}")
    public void insertUser(String user) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                        .xpath("//*[@class='c-login-modal__input o-form__input" +
                                " u-font-size-base js-processed']"))
                .sendKeys(user);
        sleep(2000);
    }

    @Then("Insert password {string}")
    public void insertPassword(String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                        .xpath("//*[@class='c-login-modal__input c-login-modal__input--password" +
                                " o-form__input u-font-size-base js-processed']"))
                .sendKeys(password);
        sleep(2000);
    }

    @Then("Click on login button")
    public void clickOnLoginButtton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                        .xpath("//*[@class='c-login-modal__submit-btn js-login-modal__submit-btn" +
                                " o-button o-button--medium o-button-filled--blue js-processed']"))
                .click();
        sleep(2000);
    }

    @Then("Check the Error text")
    public void checkTheErrorText() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(WebDriverInit.getDriver().findElement(By
                .xpath("//*[@class='alert alert-block alert-error']")).getText());
        sleep(2000);
    }

    // User ok and No Password
    @Then("Insert LoginUser {string}")
    public void insertLoginUser(String login2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@id='FormLogin_login']")).clear();
        sleep(1000);
        WebDriverInit.getDriver().findElement(By.xpath("//*[@id='FormLogin_login']")).sendKeys(login2);
        sleep(1000);
    }

    @Then("Insert LoginPass {string}")
    public void insertLoginPass(String logpass) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@id='FormLogin_password']"))
                .sendKeys(logpass);
        sleep(2000);
    }

    @Then("Click on Loginbutton {string}")
    public void clickOnLoginButton(String loginbtn) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By.xpath("//*[@id='" + loginbtn + "']"))
                .click();
        sleep(2000);
    }

    //    Logout the User at the end of the test
    @Then("Click on Logout button")
    public void clickOnLogoutButton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                        .xpath("//button[@class='js-logout c-header__login t-logout']"))
                .click();
        sleep(2000);
    }


}
