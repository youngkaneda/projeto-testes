package net.diegoquirino.calculator.ux.shared;

import net.diegoquirino.calculator.ux.pages.InitialPageObject;
import net.diegoquirino.calculator.ux.pages.ProductListPageObject;
import net.diegoquirino.calculator.ux.pages.SharedPageObject;
import net.thucydides.core.annotations.Step;

public class SharedSteps {

    SharedPageObject sharedPageObject;
    InitialPageObject initialPageObject;

    ProductListPageObject productListPageObject;

    @Step
    public void openBrowserAndAccessURL() {
        sharedPageObject.openUrl("https://calculadora.diegoquirino.net/");
        sharedPageObject.setDefaultBrowserProperties();
    }

    @Step
    public void selectMenuCalcularDesconto() {
        initialPageObject.accessMenuCalculateDiscount();
    }

    @Step
    public void selectMenuContato() {
        initialPageObject.accessMenuContact();
    }

    @Step
    public void selectProductFromTableListWithId(int i) {
        productListPageObject.selectProductFromTableListWithId(i);
    }
}
