package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class Driver {

    private Driver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver() {
        ConfigReader configReader = new ConfigReader();

        if (driver == null) {
            switch (configReader.getProperty("browser")) {
                case "safari" -> {
                    WebDriverManager.edgedriver().setup();
                    driver = new SafariDriver();
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                case "headless-chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                }
                default -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }

    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }


    }
}