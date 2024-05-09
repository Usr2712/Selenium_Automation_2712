package Codefiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Logincode {

    public static WebDriver driver;

    static Properties prop = new Properties();
    static FileInputStream File;


    public static void SetDriver() throws IOException {
        File = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Utilities\\Config.properties");
        prop.load(File);
        if (prop.getProperty("Browser").equals("Chrome")) {
         //   System.setProperty("webdriver.chrome.driver", "C:\\Intel\\chromedriver-win64\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
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






