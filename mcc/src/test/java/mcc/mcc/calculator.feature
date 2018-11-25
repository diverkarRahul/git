
@tag
Feature: Test Calculator
  This feature describes about testing the calculator

  @tag1
  Scenario: Add two numbers and substract one number
    Given I enter 100 in the calculator
    And I press Add
    And I press 50 in the calculator
    When I press Equals
    Then The result is shown as 150 in the calculator 
    And I press Substract
    And I press 20 in the calculator
    When I press Equals
    Then The result is shown as 130 in the calculator 

# Gherkins