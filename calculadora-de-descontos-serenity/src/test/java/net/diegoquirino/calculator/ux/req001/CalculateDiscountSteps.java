package net.diegoquirino.calculator.ux.req001;

import net.diegoquirino.calculator.ux.pages.ProductResultsPageObject;
import net.diegoquirino.calculator.ux.pages.ProductFormPageObject;
import net.diegoquirino.calculator.ux.pages.SharedPageObject;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculateDiscountSteps {

    ProductFormPageObject productFormPageObject;
    ProductResultsPageObject productResultsPageObject;

    @Step
    public void sendForm(String clientType, String quantity) {
        productFormPageObject.setClientType(clientType);
        productFormPageObject.setQuantity(quantity);
        productFormPageObject.send();
    }

    @Step
    public void verifyDiscountFactor(String discountFactor) {
        assertThat(productResultsPageObject.getDiscountFactor(), is(discountFactor));
    }

    @Step
    public void verifyDiscountFactorErrorMessage(String errorMessage) {
        assertThat(productResultsPageObject.getDiscountFactorErrorMessage(), is(errorMessage));
    }
}
