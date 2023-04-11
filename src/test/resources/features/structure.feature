
@wip
Feature: Company Structure Management
  As a user, I should be able to use functions on Company Structure under Employee menu.

  User types are: Helpdesk user, HR user, Marketing user
  For the scenarios in this feature file,user is expected to be on the login page

  Background:
    Given User logs into the platform

    Scenario: Login as a HR
    When User logs in with "HR"

    Scenario: Login as a Marketing
    When User logs in with "Marketing"

     Scenario: Login as a Helpdesk
      When User logs in with "Helpdesk"


  Scenario Outline: "<user_type>" user should be able to display company structure
      When User logs in with "<user_type>"
      When User clicks on "Employees" button
      Then User sees "Company Structure" header

      Examples:
        | user_type |
        | HR        |
        | Helpdesk  |
        | Marketing |


  Scenario Outline: "<user_type>"  user should be able to add a department from the company structure
    When User logs in with "<user_type>"
    When User clicks on "Employees" button
    Then User sees "Company Structure" header
    When User clicks on the "Add Department" button
    When User types department name "Marketing" for the department text field
    When User clicks on the "Add" button on next window
    Then User sees the department column "Marketing" on the Company Structure page

      Examples:
        | user_type |
        | HR        |



 # Scenario Outline : "<user_type>"  user should be able to select a parent department from the department dropdown
   # When User logs in with "<user_type>"
    #When User clicks on "Employees" button
    #Then User sees "Company Structure" header
    #When User clicks on the "Add Department" button
  #  When User selects a parent department " .  . Marketing" from parent dropdown
   # Then User sees parent department " .  . Marketing" in the parent department dropdown

   # Examples:
     # | user_type |
      #| HR        |


  Scenario Outline: "<user_type>" user should be able to close add department modal at any time
    When User logs in with "<user_type>"
    When User clicks on "Employees" button
    Then User sees "Company Structure" header
    When User clicks on the "Add Department" button
    When User sees "Add department" model
    Then User clicks on close button
    Then User can not see  add Department model button

    Examples:
      | user_type |
      | HR        |


  Scenario Outline: "<user_type>" user can not change company structure
    When User logs in with "<user_type>"
    When User clicks on "Employees" button
    Then User does not see Add department button

    Examples:
      | user_type |
      | Helpdesk  |
      | Marketing |

  Scenario Outline: "<user_type>" user should be able to see error message
  "Section name is not specified" from Company Structure (Negative test case)
    When User logs in with "<user_type>"
    When User clicks on "Employees" button
    Then User sees "Company Structure" header
    When User clicks on the "Add Department" button
    When User clicks on the "Add" button on next window
    Then User sees error message "Section name is not specified." on the add Department page

    Examples:
      | user_type |
      | HR        |
