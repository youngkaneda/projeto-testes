package net.diegoquirino.calculator.ux;

import net.diegoquirino.calculator.ux.pages.InitialPageObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("REQ003 - Formulario de Contato")
public class Req003_ContactTest extends BaseTest {

    private InitialPageObject page;

    @BeforeEach
    public void setUp() {
        initialize();
        this.page = new InitialPageObject(driver);
    }

    @AfterEach
    public void tearDown() {
        end();
        this.page = null;
    }

    private String testSteps(String name, String email, String age, String messageType, String message) {
        return this.page.goToContactPageFromMenu()
            .setName(name)
            .setEmail(email)
            .setAge(age)
            .setMessageType(messageType)
            .setMessage(message)
            .submit()
            .getSubmitMessage();
    }

    @Test
    @DisplayName("Enviar mensagem preenchendo todos os campos")
    public void testMessageSentWithAllInputsFilled() {
        String result = testSteps("Juan", "juanpablolvl99@gmail.com", "Menor que 18 anos", "tipo_duvida", "mensagem de teste");
        assertThat(result, is("Mensagem de DÚVIDA por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso!"));
    }

    @Test
    @DisplayName("Enviar mensagem sem nome")
    public void testMessageSentWithoutName() {
        String result = testSteps("", "juanpablolvl99@gmail.com", "Menor que 18 anos", "tipo_duvida", "mensagem de teste");
        assertThat(result, is("Sua mensagem não pôde ser enviada no momento! Tente mais tarde."));
    }

    @Test
    @DisplayName("Enviar mensagem sem marcar o tipo da mensagem")
    public void testMessageSentWithoutMessageType() {
        String result = testSteps("Juan", "juanpablolvl99@gmail.com", "Menor que 18 anos", "", "mensagem de teste");
        assertThat(result, is("Sua mensagem não pôde ser enviada no momento! Tente mais tarde."));
    }
}
