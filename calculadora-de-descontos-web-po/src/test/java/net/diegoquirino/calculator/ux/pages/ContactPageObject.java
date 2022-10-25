package net.diegoquirino.calculator.ux.pages;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Optional;

public class ContactPageObject extends PageObject {

    private String name;
    private String email;
    private String messageType;
    private String age;
    private String message;

    public ContactPageObject(WebDriver driver) {
        super(driver);
    }

    public ContactPageObject setName(String name) {
        this.name = name;
        typeInputTextById(Locators.ID_INPUT_NAME, this.name);
        return this;
    }

    public ContactPageObject setEmail(String email) {
        this.email = email;
        typeInputTextById(Locators.ID_INPUT_NAME, this.email);
        return this;
    }

    public ContactPageObject setAge(String age) {
        this.age = age;
        new Select(getElementById(Locators.ID_SELECT_AGE)).selectByValue(this.age);
        return this;
    }

    public ContactPageObject setMessageType(String messageType) {
        this.messageType = messageType;
        try {
            getElementById(this.messageType).click();
        } catch (InvalidSelectorException e) {
            System.out.println(e.getMessage());
        }
        return this;
    }

    public ContactPageObject setMessage(String message) {
        this.message = message;
        typeInputTextById(Locators.ID_TEXT_FIELD_MESSAGE, this.message);
        return this;
    }

    public ContactPageObject submit() {
        clickElementByAttribute("type", "submit");
        return this;
    }

    public String getSubmitMessage() {
        return Optional.ofNullable(getElementByCss(Locators.XPATH_CONTACT_SPAN)).map(WebElement::getText).orElse("");
    }
}
