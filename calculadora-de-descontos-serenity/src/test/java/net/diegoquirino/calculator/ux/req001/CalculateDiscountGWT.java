package net.diegoquirino.calculator.ux.req001;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class CalculateDiscountGWT {

    @Steps
    private CalculateDiscountSteps steps;

    @Quando("informa os dados no formulário do cálculo do desconto")
    public void informa_o_tipo_de_cliente(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        steps.sendForm(data.get("clientType"), data.get("quantity"));
    }

    @Então("o sistema apresenta o fator de desconto do produto corretamente")
    public void o_sistema_apresenta_o_fator_de_desconto_do_produto_corretamente(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        steps.verifyDiscountFactor(data.get("discountFactor"));
    }

    @Então("o sistema apresenta uma mensagem de erro para o cálculo do desconto")
    public void o_sistema_apresenta_uma_mensagem_de_erro_para_o_cálculo_do_desconto(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);
        steps.verifyDiscountFactorErrorMessage(data.get("errorMessage"));
    }
}
