
# CRMLY10-253 US02
@smoke
Feature: As a user, I should be able to upload files and pictures as messages
  Supported file formats .pdf, .txt, .jpeg, .gif, .png, .docx

 Background:
   Given User logs into the platform
    When User logs in with "HR"
   Then user click on message button

  @CRMLY10-262
  Scenario: User should be able to upload multiple files at the same time (Test with max 3 files.).
    When user clicks  Upload files icon
    Then user Upload multiple files and images

   @CRMLY10-263
  Scenario: User should be able to upload files in different formats
    When user clicks  Upload files icon
    Then user upload files in different formats
      | pdf|
      | txt|
      | pgn|
      | jpg|
      | gif|

  @CRMLY10-264 @smoke
 Scenario: User should be able to upload pictures.
  When user clicks  Upload files icon
  Then user  upload pictures

  @CRMLY10-265
  Scenario: User should be able to insert the files and images into the text
    When user clicks  Upload files icon
    And user Upload files and images
    Then user insert the files and images into the text

  @CRMLY10-266
  Scenario: User should be able to remove files and images at any time before sending
    When user clicks  Upload files icon
    And user Upload files and images
    Then user remove files and images before sending

  @CRMLY10-267
  Scenario: User should be able to rename the file before sending it.
    When user clicks  Upload files icon
    And user Upload files and images
    Then user rename the file before sending it

