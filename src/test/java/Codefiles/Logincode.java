package Codefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Logincode {

    public static WebDriver driver;

    static Properties prop = new Properties();
    static FileInputStream File;

    public static void SetDriver() throws IOException {
        File = new FileInputStream("C:\\Users\\DELL\\Sai\\SeleniumAutomation\\src\\test\\resources\\Utilities\\Config.properties");
        prop.load(File);
        if (prop.getProperty("Browser").equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Intel\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    public static WebDriver getdriver() throws IOException {
        SetDriver();
        return driver;

    }

    public void OpenBrowser() throws IOException {

        getdriver().get(prop.getProperty("Url"));
        driver.manage().window().maximize();

    }
}






