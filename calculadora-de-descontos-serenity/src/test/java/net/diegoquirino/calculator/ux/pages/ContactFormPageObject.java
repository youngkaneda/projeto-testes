package net.diegoquirino.calculator.ux.pages;

import java.util.List;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactFormPageObject extends PageObject {

    @FindBy(id = "nome")
    private WebElement name;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "idade")
    private WebElement age;
    @FindBy(id = "mensagem")
    private WebElement message;
    @FindBy(css = "[type=\"submit\"]")
    private WebElement submit;
    @FindBy(css = "[type=\"radio\"]")
    private List<WebElement> types;
    @FindBy(css = "div > span")
    private WebElement responseMessage;

    public void setEmail(String value) {
        new SharedPageObject().sendKeys(this.email, value);
    }

    public void setName(String value) {
        new SharedPageObject().sendKeys(this.name, value);
    }

    public void setMessage(String value) {
        new SharedPageObject().sendKeys(this.message, value);
    }

    public void setAge(String age) {
        new Select(this.age).selectByValue(age);
    }

    public void setType(String typeId) {
        types.stream().filter(e -> e.getAttribute("id").equals(typeId)).forEach(WebElement::click);
    }

    public void submit() {
        submit.click();
    }

    public String getResponseMessage() {
        try {
            return responseMessage.getText();
        } catch (Exception e) {
            return null;
        }
    }
}
