package net.diegoquirino.calculator.ux.req003;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class ContactGWT {

    @Steps
    private ContactSteps steps;

    @Quando("informa os dados no formulário do contato")
    public void informa_o_tipo_de_cliente(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        steps.sendForm(
            data.get("name"),
            data.get("email"),
            data.get("typeId"),
            data.get("age"),
            data.get("message")
        );
    }

    @Então("o sistema apresenta uma mensagem de envio válido")
    public void o_sistema_apresenta_uma_mensagem_de_envio_valido(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        steps.verifyResponseMessage(data.get("responseMessage"));
    }

    @Então("o sistema apresenta uma mensagem de envio inválido")
    public void o_sistema_apresenta_uma_mensagem_de_envio_invalido(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        steps.verifyResponseMessage(data.get("responseMessage"));
    }
}
