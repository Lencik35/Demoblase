Feature: Buy Item

  @regressionPack
  Scenario: Buy Galaxy Phone in the store
    Given open application
    When user selects the phone
    And user open the shopping cart
    And phone is present in shopping cart
    And user places the order
    And inputs the name "Test Test"
    And inputs the "France" country
    And inputs the "Paris" city
    And inputs the "22334455667788" credit card
    And inputs the 24 month
    And inputs the 2024 year
    And clicks on purchase
    Then confirmation pup-up appears
    And user click OK