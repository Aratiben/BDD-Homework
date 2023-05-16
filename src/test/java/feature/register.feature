Feature: register
  @register
  Scenario: as a user, I should able to Register successfully
  So that, I can use all user features
    Given I am on registration page
    When I enter required registration details
    Then I should able to registered successfully
