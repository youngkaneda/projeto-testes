package net.diegoquirino.calculator.ux;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "/home/nitro19/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://calculadora.diegoquirino.net/");
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void end() {
        driver.quit();
    }

}
