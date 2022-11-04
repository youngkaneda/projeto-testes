# language: pt

@all @req001
Funcionalidade: REQ001 - Calcular Desconto de Produto

  @fb @smoke @regression
  Esquema do Cenario: Cálculo do Desconto do Produto Válido

    Dado que o usuário está na página incial do sistema
    E deseja selecionar um produto para calcular o desconto

    Quando informa os dados no formulário do cálculo do desconto
      | clientType | <TipoDeCliente> |
      | quantity   | <Quantidade>    |

    Então o sistema apresenta o fator de desconto do produto corretamente
      | discountFactor | <FatorDeDesconto> |

    Exemplos:
      | TipoDeCliente | Quantidade | FatorDeDesconto                 |
      | A             | 1          | 0,90 (ou seja, 10% de desconto) |
      | A             | 100        | 0,95 (ou seja, 5% de desconto)  |
      | A             | 1000       | 1,00 (ou seja, 0% de desconto)  |
      | B             | 99         | 0,85 (ou seja, 15% de desconto) |
      | B             | 999        | 0,90 (ou seja, 10% de desconto) |
      | B             | 1000       | 0,95 (ou seja, 5% de desconto)  |
      | C             | 1          | 0,80 (ou seja, 20% de desconto) |
      | C             | 999        | 0,85 (ou seja, 15% de desconto) |
      | C             | 1000       | 0,90 (ou seja, 10% de desconto) |


  @fe
  Esquema do Cenario: Cálculo do Desconto do Produto Inválido

    Dado que o usuário está na página incial do sistema
    E deseja selecionar um produto para calcular o desconto

    Quando informa os dados no formulário do cálculo do desconto
      | clientType | <TipoDeCliente> |
      | quantity   | <Quantidade>    |

    Então o sistema apresenta uma mensagem de erro para o cálculo do desconto
      | errorMessage | <MensagemDeErro> |

    Exemplos:
      | TipoDeCliente | Quantidade | MensagemDeErro                                            |
      | B             | 1.5        | Não é possível calcular o desconto.                       |
      | C             | 10,5       | Não é possível calcular o desconto.                       |
      | A             | dez        | Não é possível calcular o desconto.                       |
      | C             | "BLANKS"   | Não é possível calcular o desconto.                       |
      | C             | -12        | A quantidade informada deve ser maior ou igual a 01 (um)! |
      | C             |            | A quantidade informada deve ser maior ou igual a 01 (um)! |
      | A             | 0          | A quantidade informada deve ser maior ou igual a 01 (um)! |
