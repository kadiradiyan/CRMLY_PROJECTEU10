@CRMLY10-286
Feature: Message functionality

  User Story:
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Mandatory fields:'Message content & 'Recipient'.
  Error messages for mandatory fields:
          "The message title is not specified"
          "Please specify at least one person."
  More than one recipient can be added and are deletable.


  Background: User is already logged in.
    Given User logs into the platform
    When User logs in with "HR"
    Then User clicks MESSAGE module

  @CRMLY10-276 @smoke
  Scenario: User should be able to send a message by filling in the mandatory fields.
    Then User writes a message "message" into Message box
    And User clicks "Send" button


  @CRMLY10-283
  Scenario:The message delivery should be to 'All employees' by default and should be changeable.
    Then User writes a message "message" into Message box
    And All Employees button should be seen as default recipient
    And User removes default recipient
    And User clicks add "Add persons, groups or department" link
    And User clicks "Employees and departments" link
    And User clicks "email" from the list
    And User clicks "Send" button


  @CRMLY10-284
  Scenario: Verify that users SHOULD NOT be able to send a message without writing Message
    Then User does NOT write a Message Text
    And User clicks "Send" button
    Then User should see "The message title is not specified" error message


  Scenario: Verify that users CAN NOT send a message without adding a Recipient
    Then User writes a message "message" into Message box
    And User removes default recipient
    And User clicks "Send" button
    Then User should see "Please specify at least one person." error message



  Scenario: User should be able to CANCEL sending messages at any time before sending.
    Then User writes a message "message" into Message box
    And User removes default recipient
    And User clicks add "Add persons, groups or department" link
    And User clicks "Employees and departments" link
    And User clicks "email" from the list
    And User clicks "Cancel" button














