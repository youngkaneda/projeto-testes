package net.diegoquirino.calculator.ux.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListPageObject extends PageObject {

    @FindBy(xpath = "//a[contains(@href, '/itens/add/produto/')]")
    private List<WebElement> allProductsDollarButton;

    public void selectProductFromTableListWithId(int i) {
        for(WebElement e: allProductsDollarButton) {
            if(e.getAttribute("href").contains("/" + i)) {
                e.click();
                break;
            }
        }
    }

}
