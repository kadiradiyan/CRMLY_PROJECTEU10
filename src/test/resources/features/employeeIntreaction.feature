@employeeInter  @Now
Feature: Employee interaction on the posts functionality
  User story:
  As a user, I should be able to interact with employees on the posts.

  Background: User is already logged in.
    Given User logs into the platform
    When User logs in with "HR"


  Scenario: User should be able to make a comment, like, or unfollow other employees' posts
    Then User clicks "comment" link under employees post
    Then User writes a "HEEEEY" in the comment under any other employees post
    And User clicks "Send" button after commenting
    Then User likes other employees post by clicking "like" link
    Then User unfollows other employees post by clicking "unfollow" link

  Scenario: User should be able to like and reply his/her own comment
    Then User likes his own comment by clicking "like" link under his comment
    Then User click "reply" link under his comment
    And User writes "managed to comment my own comment" in the comment box
    Then User clicks "send" button under his new comment

  Scenario: After making a comment user should be able to, "edit", "delete" by clicking more
    Then User clicks "more" link under his comment
    Then User clicks "edit" from the list of options and edits comment
    Then User clicks "send" button after editing
    Then User clicks "more" link under his comment
    Then User clicks "delete" from the list of options
    And User click "ok" button of the alert

  Scenario: User should be able to add and remove others' posts to favorites by clicking on the Star icon
    Then User click to the star "icon" and comment added to favourites
    Then User clicks to the star "icon" and comment removed from favourites

