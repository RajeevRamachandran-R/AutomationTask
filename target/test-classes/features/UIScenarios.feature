@AutomationTask
Feature: UI automation Scenarios

  @Task1
  Scenario: verify that the calculator working with User Input
    Given user navigate to site
    And user fill the below fields
      | Application type | Number of dependants | Property you would like to buy | Your income (before tax) | Your other income | Living expenses | Current home loan repayments | Other loan repayments | Other commitments | Total credit card limits |
      | Single           |                    0 | Home to live in                |                    80000 |             10000 |             500 |                            0 |                   100 |                 0 |                    10000 |
    Then user will verify the eatimated loan Amount with "$479,000"

  @Task2
  Scenario: verify that the calculator working with User Input
    Given user navigate to site
    And user fill the below fields
      | Application type | Number of dependants | Property you would like to buy | Your income (before tax) | Your other income | Living expenses | Current home loan repayments | Other loan repayments | Other commitments | Total credit card limits |
      | Single           |                    0 | Home to live in                |                    80000 |             10000 |             500 |                            0 |                   100 |                 0 |                    10000 |
    Then user will verify clicking start over button clear the form

  @Task3
  Scenario: verify that the calculator working with User Input
    Given user navigate to site
    And user fill the below fields
      | Living expenses |
      | 1         |  
   	Then user will verify the message after clicking Work out how much I could borrow button
