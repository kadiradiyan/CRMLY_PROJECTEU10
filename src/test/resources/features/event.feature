Feature: Event

  Background:
    Given User logs into the platform
    When   User logs in with "HR"
    Then user clicks on Event button



  @smoke
  Scenario:

    And   user enters "my event" as a event name
    And   user clicks on Send button
    Then  user creates Event

  Scenario:
    And   user leaves event name fields empty
    Then  user sees "" error message


  Scenario:
    And user set reminder and send Event
    And user clicks on Upcoming Events
    Then user is able to see Remainder label