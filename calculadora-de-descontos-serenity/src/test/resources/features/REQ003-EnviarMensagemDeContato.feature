# language: pt

@all @req003
Funcionalidade: REQ003 - Enviar mensagem de contato

  @fb @smoke @regression
  Esquema do Cenario: Envio de mensagem válida

    Dado que o usuário está na página incial do sistema
    E deseja selecionar a página de contato

    Quando informa os dados no formulário do contato
      | name    | <nome>     |
      | email   | <email>    |
      | age     | <idade>    |
      | typeId  | <tipoMsg>  |
      | message | <mensagem> |

    Então o sistema apresenta uma mensagem de envio válido
      | responseMessage | <responseMessage> |

    Exemplos:
      | nome | email          | idade             | tipoMsg       | mensagem | responseMessage                                                                    |
      | Juan | juan@gmail.com | Menor que 18 anos | tipo_duvida   | teste    | Mensagem de DÚVIDA por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso! |
      | Juan | juan@gmail.com | Menor que 18 anos | tipo_duvida   |          | Mensagem de DÚVIDA por usuário de idade MENOR QUE 18 ANOS foi enviada com sucesso! |


  @fe
  Esquema do Cenario: Cálculo do Desconto do Produto Inválido

    Dado que o usuário está na página incial do sistema
    E deseja selecionar a página de contato

    Quando informa os dados no formulário do contato
      | name    | <nome>     |
      | email   | <email>    |
      | age     | <idade>    |
      | typeId  | <tipoMsg>  |
      | message | <mensagem> |

    Então o sistema apresenta uma mensagem de envio inválido
      | responseMessage | <responseMessage> |

    Exemplos:
      | nome | email          | idade             | tipoMsg       | mensagem | responseMessage                                                |
      |      | juan@gmail.com | Menor que 18 anos | tipo_sugestao | teste    | Sua mensagem não pôde ser enviada no momento! Tente mais tarde.|
      | Juan | juan@gmail.com | Menor que 18 anos |               | teste    | Sua mensagem não pôde ser enviada no momento! Tente mais tarde.|