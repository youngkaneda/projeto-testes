package net.diegoquirino.calculator.ux.pages;

import org.openqa.selenium.WebDriver;

public class InitialPageObject extends PageObject {

    public InitialPageObject(WebDriver driver) {
        super(driver);
    }

    public ProductListPageObject goToProductsListFromMenu() {
        clickElementByCss(Locators.CSS_MENU_PRODUCT);
        return new ProductListPageObject(driver);
    }

    public ContactPageObject goToContactPageFromMenu() {
        clickElementByCss(Locators.CSS_CONTACT_MENU);
        return new ContactPageObject(driver);
    }
}
