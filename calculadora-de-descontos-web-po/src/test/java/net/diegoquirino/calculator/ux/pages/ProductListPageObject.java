package net.diegoquirino.calculator.ux.pages;

import org.openqa.selenium.WebDriver;

public class ProductListPageObject extends PageObject {

    public ProductListPageObject(WebDriver driver) {
        super(driver);
    }

    public ProductDiscountFormPageObject selectProductFromListCode(int code) {
        clickElementByXpath(Locators.XPATH_TABLE_ITEM_PRODUCT_LIST+code+"')]");
        return new ProductDiscountFormPageObject(driver);
    }

}
