Feature: Zadanie 2

  Scenario: Kupowanie
    Given 2otwarcie strony prod kurs coderslab pl 2
    And 2logowanie na stronie 2
    And znalezienie Hummingbird Printed Sweater
    When wybranie do zakupu Hummingbird Printed Sweater
    And wybranie rozmiaru M
    And wybranie 5 sztuk według parametru podanego w teście
    And dodanie produkt do koszyka
    And przejście do opcji - checkout
    And potwierdzenie address
    And wybieranie metody odbioru - PrestaShop pick up in store
    And wybieranie opcję płatności - Pay by Check
    And kliknięcie na order with an obligation to pay
    Then zrobienie screenshot z potwierdzeniem zamówienia i kwotą
    And pobranie kwoty zamówienia
    And przejście do historii zamówień i detale
    And sprawdzenie statusu Awaiting check payment i kwoty zamówienia
    And zamknięcie przeglądarki