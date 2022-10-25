package net.diegoquirino.calculator.ux.pages;

import org.openqa.selenium.WebDriver;

public class ProductDiscountResultPageObject extends PageObject {

    public ProductDiscountResultPageObject(WebDriver driver) {
        super(driver);
    }

    public String getDiscountFactorText() {
        return getInputValueById(Locators.ID_INPUT_DISCOUNT_FACTOR_RESULT);
    }

}
