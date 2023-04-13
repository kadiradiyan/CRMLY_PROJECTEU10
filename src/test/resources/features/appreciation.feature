@CRMLY10-289
Feature: Send Appreciation

  As a user
  I should be able to send appreciation by clicking on Appreciation tab under Active Stream.

  Background:
    Given User logs into the platform
    When User logs in with "HR"
    And User clicks on the "Active Stream" tab
    And User clicks on the "Appreciation" tab
    And User fills in the mandatory fields with "Thank you for your hard work!" in the message field


  @CRMLY10-287  #@sendAppreciation
  # in this scenario we test first AC with US's descriptions -->Recipients should be selectable from "Recent", "Employees and departments"
  Scenario: User sends appreciation with mandatory fields
    And User click on the "Send" button
    Then User clicks on "more" button and clicks on "delete" button


  @CRMLY10-290  #@changeGroup
    # in this scenario we test second AC with US's descriptions -->"Recipients can be added more than one and are deletable."
  Scenario: User changes message delivery to a "specific" group
    When User verifies the "All employees" group is selected by default
    And User deleted "All employees" recipient
    And user add new recipient "helpdesk2@cybertekschool.com"
    And user add new recipient "hr75@cybertekschool.com"
    Then user delete added recipients
    And User click on the "Send" button
     Then User clicks on "more" button and clicks on "delete" button





  @CRMLY10-291  #@cancelAppreciation
  Scenario: User cancels sending appreciation
    And User click on the "Cancel" button



  @CRMLY10-292 #@selectIcon
  Scenario: User selects an icon for the appreciation
    When User selects an icon for the appreciation
    And User click on the "Send" button
    Then User clicks on "more" button and clicks on "delete" button



  @CRMLY10-293  #@errorMessages
    #for this scenario  this is US's description -->"Error messages for mandatory fields: #"Please specify at least one person.""
    #if you want to test this scenario for other mandatory fields; inactivate  line12 and inactivate line 66
  Scenario: User sees error messages when mandatory fields are not filled
    When User deleted default "All employees" recipient
    And User click on the "Send" button
    Then User verifies the error message "Please specify at least one person." is displayed
    And User click on the "Cancel" button





