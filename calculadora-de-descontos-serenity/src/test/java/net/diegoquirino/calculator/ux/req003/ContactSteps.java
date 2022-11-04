package net.diegoquirino.calculator.ux.req003;

import net.diegoquirino.calculator.ux.pages.ContactFormPageObject;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactSteps {

    private ContactFormPageObject pageObject;

    @Step
    public void sendForm(String name, String email, String typeId, String age, String message) {
        pageObject.setAge(age);
        pageObject.setEmail(email);
        pageObject.setName(name);
        pageObject.setType(typeId);
        pageObject.setMessage(message);
        pageObject.submit();
    }

    @Step
    public void verifyResponseMessage(String expectedMessage) {
        assertThat(pageObject.getResponseMessage(), is(expectedMessage));
    }
}
