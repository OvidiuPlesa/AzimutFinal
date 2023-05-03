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
        WebDriverInit.getDriver().findElement(By
                .xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']"))
                .click();
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
                .xpath("//*[@class='c-login-modal__submit-btn js-login-modal__submit-btn" +
                        " o-button o-button--medium o-button-filled--blue js-processed']"))
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
//    Logout the User at the end of the test
    @Then("Click on Logout button")
    public void ClickonLogoutbutton() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebDriverInit.getDriver().findElement(By
                .xpath("//button[@class='js-logout c-header__login t-logout']"))
                .click();
        sleep(2000);
}


}
