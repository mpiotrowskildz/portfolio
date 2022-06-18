package io.cucumber.skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void typeLogin (String login){
        webDriver.findElement(By.id("username")).sendKeys(login);
    }
    public void typePassword (String password){
        webDriver.findElement(By.cssSelector("input[name=password]")).sendKeys(password);
    }
    public void clickLogin (){
        webDriver.findElement(By.cssSelector("button[type=submit]")).click();
    }
    public String getLoggedInfo (){
        return webDriver.findElement(By.id("flash-messages")).getText();
    }
}
