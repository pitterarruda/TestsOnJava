Feature: teste HomePage

  # cenario sem parametro
  Scenario: Abrir a home screen e verificar o titulo
    Given I access the home page
    When I click Home menu Item
    Then Title is correct

# cenario com parametros
  Scenario: Open form and submited then
    Given I access the form complet page
    When I fill out "Pitter" and "3"
    And I click on radio button
    And I click checkBox
    And I click button
    Then Verify the mensage "A mensagem foi enviada (voltar)"

 # cenario com DataDriven
  Scenario Outline: Open form and submited then
    Given I access the form complet page
    When I fill out "<name>" and "<state>"
    And I click on radio button
    And I click checkBox
    And I click button
    Then Verify the mensage "A mensagem foi enviada (voltar)"
    
    Examples:
    | name  |state |
    | name1 |  5   |
    | name2 |  7   |