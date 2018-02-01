$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyApplication.feature");
formatter.feature({
  "line": 1,
  "name": "teste HomePage",
  "description": "",
  "id": "teste-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# cenario sem parametro"
    }
  ],
  "line": 4,
  "name": "Abrir a home screen e verificar o titulo",
  "description": "",
  "id": "teste-homepage;abrir-a-home-screen-e-verificar-o-titulo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I access the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click Home menu Item",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Title is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_CucumberHomePage.i_access_the_home_page()"
});
formatter.result({
  "duration": 21418872692,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_Home_menu_Item()"
});
formatter.result({
  "duration": 4987555187,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.title_is_correct()"
});
formatter.result({
  "duration": 32963210,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "# cenario com parametros"
    }
  ],
  "line": 10,
  "name": "Open form and submited then",
  "description": "",
  "id": "teste-homepage;open-form-and-submited-then",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I access the form complet page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I fill out \"Pitter\" and \"3\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on radio button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click checkBox",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify the mensage \"A mensagem foi enviada (voltar)\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_CucumberHomePage.i_access_the_form_complet_page()"
});
formatter.result({
  "duration": 1608793461,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pitter",
      "offset": 12
    },
    {
      "val": "3",
      "offset": 25
    }
  ],
  "location": "TC_CucumberHomePage.i_fill_out_and(String,String)"
});
formatter.result({
  "duration": 1436322953,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_on_radio_button()"
});
formatter.result({
  "duration": 212179190,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_checkBox()"
});
formatter.result({
  "duration": 165445941,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_button()"
});
formatter.result({
  "duration": 4906620600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A mensagem foi enviada (voltar)",
      "offset": 20
    }
  ],
  "location": "TC_CucumberHomePage.verify_the_mensage(String)"
});
formatter.result({
  "duration": 159067626,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 18,
      "value": "# cenario com DataDriven"
    }
  ],
  "line": 19,
  "name": "Open form and submited then",
  "description": "",
  "id": "teste-homepage;open-form-and-submited-then",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "I access the form complet page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I fill out \"\u003cname\u003e\" and \"\u003cstate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click on radio button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click checkBox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the mensage \"A mensagem foi enviada (voltar)\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "teste-homepage;open-form-and-submited-then;",
  "rows": [
    {
      "cells": [
        "name",
        "state"
      ],
      "line": 28,
      "id": "teste-homepage;open-form-and-submited-then;;1"
    },
    {
      "cells": [
        "name1",
        "5"
      ],
      "line": 29,
      "id": "teste-homepage;open-form-and-submited-then;;2"
    },
    {
      "cells": [
        "name2",
        "7"
      ],
      "line": 30,
      "id": "teste-homepage;open-form-and-submited-then;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "Open form and submited then",
  "description": "",
  "id": "teste-homepage;open-form-and-submited-then;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "I access the form complet page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I fill out \"name1\" and \"5\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click on radio button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click checkBox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the mensage \"A mensagem foi enviada (voltar)\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_CucumberHomePage.i_access_the_form_complet_page()"
});
formatter.result({
  "duration": 2593736692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name1",
      "offset": 12
    },
    {
      "val": "5",
      "offset": 24
    }
  ],
  "location": "TC_CucumberHomePage.i_fill_out_and(String,String)"
});
formatter.result({
  "duration": 689672230,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_on_radio_button()"
});
formatter.result({
  "duration": 178668854,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_checkBox()"
});
formatter.result({
  "duration": 146573250,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_button()"
});
formatter.result({
  "duration": 3366255320,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A mensagem foi enviada (voltar)",
      "offset": 20
    }
  ],
  "location": "TC_CucumberHomePage.verify_the_mensage(String)"
});
formatter.result({
  "duration": 261359344,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Open form and submited then",
  "description": "",
  "id": "teste-homepage;open-form-and-submited-then;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "I access the form complet page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I fill out \"name2\" and \"7\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click on radio button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click checkBox",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Verify the mensage \"A mensagem foi enviada (voltar)\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_CucumberHomePage.i_access_the_form_complet_page()"
});
formatter.result({
  "duration": 3297107743,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name2",
      "offset": 12
    },
    {
      "val": "7",
      "offset": 24
    }
  ],
  "location": "TC_CucumberHomePage.i_fill_out_and(String,String)"
});
formatter.result({
  "duration": 728822718,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_on_radio_button()"
});
formatter.result({
  "duration": 138424597,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_checkBox()"
});
formatter.result({
  "duration": 129197574,
  "status": "passed"
});
formatter.match({
  "location": "TC_CucumberHomePage.i_click_button()"
});
formatter.result({
  "duration": 2808764108,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A mensagem foi enviada (voltar)",
      "offset": 20
    }
  ],
  "location": "TC_CucumberHomePage.verify_the_mensage(String)"
});
formatter.result({
  "duration": 259728074,
  "status": "passed"
});
});