@CRMLY10-219
Feature: Send Appreciation

  As a user
  I should be able to send appreciation by clicking on Appreciation tab under Active Stream.

  Scenario: User sends appreciation with mandatory fields
    Given User is on the Active Stream page
    When User clicks on the Appreciation tab
    And User fills in the mandatory fields
    And User clicks on the Send button
    Then The message should be sent to all employees

  Scenario: User changes message delivery to a specific group
    Given User is on the Active Stream page
    When User clicks on the Appreciation tab
    And User fills in the mandatory fields
    And User selects a specific group for message delivery
    And User clicks on the Send button
    Then The message should be sent to the selected group only

  Scenario: User cancels sending appreciation
    Given User is on the Active Stream page
    When User clicks on the Appreciation tab
    And User fills in the mandatory fields
    And User clicks on the Cancel button
    Then The message should not be sent



    #########################################################################
  ## other options
Feature: Send Appreciation

  As a user,
  I should be able to send appreciation by clicking on Appreciation tab under Active Stream.

  Scenario: Send appreciation with mandatory fields filled
    Given I am on the homepage
    When I click on the Appreciation tab under Active Stream
    And I enter "Thank you for your hard work!" in the message field
    And I select an icon for the appreciation
    And I click on the Send button
    Then the appreciation message should be sent to all employees

  Scenario: Change the message delivery group
    Given I am on the homepage
    When I click on the Appreciation tab under Active Stream
    And I select a different group from the dropdown menu
    And I enter "Great job on the project!" in the message field
    And I select an icon for the appreciation
    And I click on the Send button
    Then the appreciation message should be sent to the selected group

  Scenario: Cancel sending an appreciation message
    Given I am on the homepage
    When I click on the Appreciation tab under Active Stream
    And I enter "Thank you for your hard work!" in the message field
    And I select an icon for the appreciation
    And I click on the Cancel button
    Then the appreciation message should not be sent

