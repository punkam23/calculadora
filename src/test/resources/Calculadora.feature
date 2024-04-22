Feature: Calculadora

  Scenario: Sumar dos números
    Given que tengo una calculadora
    When sumo el numero 1000 y 800
    Then proceso el resultado 1800

  Scenario: Multiplicar dos números
    Given que tengo una calculadora
    When multiplico el numero 10 y 800
    Then proceso el resultado 8000
  
  Scenario: Restar dos números
    Given que tengo una calculadora
    When resto el numero 50 y 40
    Then proceso el resultado 10

  Scenario: Dividir dos números
    Given que tengo una calculadora
    When divido el numero 50 y 10
    Then proceso el resultado 5