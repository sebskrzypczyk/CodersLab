Feature: Zadanie 1

  Scenario Outline: Dodanie adresu
    Given otwarcie strony prod kurs coderslab pl
    And logowanie na stronie
    When wejście klikając w kafelek Addresses po zalogowaniu
    And kliknicie w Create new address
    And wypełnienie formularzu New address <alias> <address> <city> <postcode>
    Then adres <alias> dodany

    Examples:
      | alias   | address       | city   | postcode |
      | Adres 1 | 1A Bedford St | London | WC2E 9HH |
      | Adres 2 | 82 Tooley St  | London | SE1 2TF  |
