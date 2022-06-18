package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDefinitions {
    WebDriver webDriver;
    WebDriverWait wait;
    LoginPage loginPage;

    @Before
    public void iHaveMyBrowserOpened() {
        System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        wait = new WebDriverWait(webDriver, 5);
    }

    @Given("I have the login page opened")
    public void iHaveTheLoginPageOpened() {
        webDriver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(webDriver);
    }

    @When("I type the {string} login")
    public void iTypeTheLogin(String arg0) {
        loginPage.typeLogin(arg0);
    }

    @And("I type the {string} password")
    public void iTypeThePassword(String arg0) {
        loginPage.typePassword(arg0);
    }

    @And("I click login")
    public void iClickLogin() {
        loginPage.clickLogin();
    }

    @Then("I am logged in")
    public void iAmLoggedIn() throws InterruptedException {
        Thread.sleep(1000);
        String expectedInfo = "You logged into a secure area!";
        String currentInfo = loginPage.getLoggedInfo();
        assertTrue(currentInfo.contains(expectedInfo));
    }

    @Then("I am not logged in")
    public void iAmNotLoggedIn() throws InterruptedException {
        Thread.sleep(1000);
        String expectedInfo = "Your password is invalid!";
        String currentInfo = loginPage.getLoggedInfo();
        assertTrue(currentInfo.contains(expectedInfo));
    }
}