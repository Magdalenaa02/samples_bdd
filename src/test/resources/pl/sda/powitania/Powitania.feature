Feature: Powitania w roznych jezykach
  Scenario: Powitanie w jezyku polskim
    Given instancja klasy powitanie zostala utworzona
    When uzyto jezyka polskiego
    Then zostalo wyswietlone pozdrowienie w jezyku polskim

  Scenario: Powitanie w jezyku angielskim
      Given instancja klasy powitanie zostala utworzona
      When uzyto jezyka angielskiego
      Then zostalo wyswietlone pozdrowienie w jezyku angielskim