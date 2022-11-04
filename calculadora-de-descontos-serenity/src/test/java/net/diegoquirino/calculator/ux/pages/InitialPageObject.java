package net.diegoquirino.calculator.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class InitialPageObject extends PageObject {

    @FindBy(css = "a.nav-link[href='/produtos']")
    private WebElement linkMenuCalculateDiscount;

    @FindBy(css = "a.nav-link[href='/contato']")
    private WebElement linkMenuContact;

    public void accessMenuCalculateDiscount() {
        linkMenuCalculateDiscount.click();
    }


    public void accessMenuContact() {
        linkMenuContact.click();
    }
}
