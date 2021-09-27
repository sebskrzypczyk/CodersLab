$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Zadanie1.feature");
formatter.feature({
  "line": 1,
  "name": "Zadanie 1",
  "description": "",
  "id": "zadanie-1",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Dodanie adresu",
  "description": "",
  "id": "zadanie-1;dodanie-adresu",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "otwarcie strony prod kurs coderslab pl",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "logowanie na stronie",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "wejście klikając w kafelek Addresses po zalogowaniu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "kliknicie w Create new address",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "wypełnienie formularzu New address \u003calias\u003e \u003caddress\u003e \u003ccity\u003e \u003cpostcode\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "adres \u003calias\u003e dodany",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "zadanie-1;dodanie-adresu;",
  "rows": [
    {
      "cells": [
        "alias",
        "address",
        "city",
        "postcode"
      ],
      "line": 12,
      "id": "zadanie-1;dodanie-adresu;;1"
    },
    {
      "cells": [
        "Adres 1",
        "1A Bedford St",
        "London",
        "WC2E 9HH"
      ],
      "line": 13,
      "id": "zadanie-1;dodanie-adresu;;2"
    },
    {
      "cells": [
        "Adres 2",
        "82 Tooley St",
        "London",
        "SE1 2TF"
      ],
      "line": 14,
      "id": "zadanie-1;dodanie-adresu;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Dodanie adresu",
  "description": "",
  "id": "zadanie-1;dodanie-adresu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "otwarcie strony prod kurs coderslab pl",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "logowanie na stronie",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "wejście klikając w kafelek Addresses po zalogowaniu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "kliknicie w Create new address",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "wypełnienie formularzu New address Adres 1 1A Bedford St London WC2E 9HH",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "adres Adres 1 dodany",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Dodanie adresu",
  "description": "",
  "id": "zadanie-1;dodanie-adresu;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "otwarcie strony prod kurs coderslab pl",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "logowanie na stronie",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "wejście klikając w kafelek Addresses po zalogowaniu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "kliknicie w Create new address",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "wypełnienie formularzu New address Adres 2 82 Tooley St London SE1 2TF",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "adres Adres 2 dodany",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});