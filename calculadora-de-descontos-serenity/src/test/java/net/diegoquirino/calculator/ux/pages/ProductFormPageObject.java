package net.diegoquirino.calculator.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductFormPageObject extends PageObject {

    @FindBy(id = "tipoCliente")
    private WebElement clientType;
    @FindBy(id = "quantidade")
    private WebElement quantity;

    public void setClientType(String value) {
        new Select(clientType).selectByValue(value);
    }

    public void setQuantity(String quantity) {
        new SharedPageObject().sendKeys(this.quantity, quantity);
    }

    public void send() {
        this.quantity.submit();
    }

}
