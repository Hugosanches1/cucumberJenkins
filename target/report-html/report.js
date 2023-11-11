$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/realizarLoginSeuBarriga.feature");
formatter.feature({
  "name": "Testar cucumber jenkins",
  "description": "\tComo tester \n\tEu quero quero aprender mais\n\tPara me desenvolver",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Logar no seu barriga",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que acessei o endereco da aplicacao",
  "keyword": "Dado "
});
formatter.match({
  "location": "RealizarLoginSeuBarrigaSteps.queAcesseiOEnderecoDaAplicacao()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar os dados de acesso e confirmar",
  "keyword": "Quando "
});
formatter.match({
  "location": "RealizarLoginSeuBarrigaSteps.informarOsDadosDeAcessoEConfirmar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o login eh realizado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "RealizarLoginSeuBarrigaSteps.oLoginEhRealizadoComSucesso()"
});
formatter.result({
  "status": "passed"
});
});