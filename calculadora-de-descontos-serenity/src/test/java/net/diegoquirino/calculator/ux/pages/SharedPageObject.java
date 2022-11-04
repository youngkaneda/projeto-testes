package net.diegoquirino.calculator.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SharedPageObject extends PageObject {

    public void setDefaultBrowserProperties() {
        getDriver().manage().window().setSize(new Dimension(1920, 1080));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    public void sendKeys(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.clear();
        if(text == null) {
            element.sendKeys("");
        } else {
            if(text.equals("\"BLANKS\"")) {
                element.sendKeys("     ");
            } else {
                element.sendKeys(text);
            }
        }
    }

}
