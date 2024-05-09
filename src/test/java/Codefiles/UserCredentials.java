package Codefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UserCredentials {

    public WebDriver driver;

    @FindBy(xpath = "//input[@id='txt-username']")
    static WebElement UserName;

    @FindBy(xpath = "//input[@id='txt-password']")
    static WebElement Password;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    static WebElement Login;

    public UserCredentials(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    @Test
    public void logintoApplication() {

        UserName.sendKeys("John Doe");
        Password.sendKeys("ThisIsNotAPassword");
        Login.click();
    }
}
