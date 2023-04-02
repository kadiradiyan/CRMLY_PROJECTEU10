
Feature: Login Functionality

  Background:
    Given User logs into the platform

  Scenario: Login as a HR
    When User logs in with "HR"

  Scenario: Login as a Marketing
    When User logs in with "Marketing"

  Scenario: Login as a Helpdesk
    When User logs in with "Helpdesk"















































    ## this is other aprroach for login feature
    ## Scenario: Verify that user can login with valid credentials
#Background:
#Given User navigates to website
#When User logs in with following credentials (list)
#| hr99@cybertekschool.com |
#| UserUser                |