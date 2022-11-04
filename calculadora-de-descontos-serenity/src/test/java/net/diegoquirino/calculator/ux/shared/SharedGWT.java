package net.diegoquirino.calculator.ux.shared;

import io.cucumber.java.pt.Dado;
import net.thucydides.core.annotations.Steps;

public class SharedGWT {

    @Steps
    SharedSteps steps;

    @Dado("que o usuário está na página incial do sistema")
    public void que_o_usuario_esta_na_pagina_incial_do_sistema() {
        steps.openBrowserAndAccessURL();
    }

    @Dado("deseja selecionar um produto para calcular o desconto")
    public void deseja_selecionar_um_produto_para_calcular_o_desconto() {
        steps.selectMenuCalcularDesconto();
        steps.selectProductFromTableListWithId(2);
    }

    @Dado("deseja selecionar a página de contato")
    public void deseja_selecionar_a_página_de_contato() {
        steps.selectMenuContato();
    }
}
