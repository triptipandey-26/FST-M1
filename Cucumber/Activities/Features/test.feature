@FirstTest
Feature: Basic syntax

  @FirstScenario
  Scenario: This is scenario 1
    Given User is on the TS homepage
    When User clicks on the About Us page
    Then User is taken to About us page
    And Close the browser
