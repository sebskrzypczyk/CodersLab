Feature: Zadanie 1

  Scenario Outline: Dodanie adresu

    Given otwarcie strony prod kurs coderslab pl
    And logowanie na stronie
    When wejście klikając w kafelek Addresses po zalogowaniu
    And kliknicie w Create new address
    And wypełnienie formularzu New address <alias>, <address>, <city>, <postcode>, <country>, <phone>
    Then adres <alias> dodany
    And kliknicie w Delete adresu <alias>
    And adres <alias> usunięty
    And zamknięcie okna przeglądarki

    Examples:
      | alias   | address       | city   | postcode | country        | phone      |
      | Adres 1 | 1A Bedford St | London | WC2E 9HH | United Kingdom | 1234567890 |
      | Adres 2 | 82 Tooley St  | London | SE1 2TF  | United Kingdom | 0987654321 |
