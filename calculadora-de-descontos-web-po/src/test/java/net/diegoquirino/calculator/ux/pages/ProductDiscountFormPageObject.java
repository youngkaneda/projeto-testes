package net.diegoquirino.calculator.ux.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;
import java.util.Optional;

public class ProductDiscountFormPageObject extends PageObject {

    private String clientType;

    private Integer quantity;

    public ProductDiscountFormPageObject(WebDriver driver) {
        super(driver);
    }

    public ProductDiscountFormPageObject setClientType(String clientType) {
        this.clientType = clientType;
        new Select(getElementById(Locators.ID_SELECT_CLIENT_TYPE))
                .selectByValue(clientType);
        return this;
    }

    public ProductDiscountFormPageObject setQuantity(Integer quantity) {
        this.quantity = quantity;
        typeInputTextById(Locators.ID_INPUT_QUANTITY, Optional.ofNullable(quantity).map(Objects::toString).orElse(""));
        return this;
    }

    public ProductDiscountResultPageObject submit() {
        clickElementByAttribute("type", "submit");
        return new ProductDiscountResultPageObject(driver);
    }

    public String getClientType() {
        return clientType;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
