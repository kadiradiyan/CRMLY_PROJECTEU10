package net.crmly.step_definitions;

public class AppreciatonStepDefs {
}
/*
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AppreciationStepDefs {

  @Given("User is on the Active Stream page")
  public void user_is_on_the_active_stream_page() {
    // Navigate to Active Stream page
  }

  @When("User clicks on the Appreciation tab")
  public void user_clicks_on_the_appreciation_tab() {
    // Click on Appreciation tab
  }

  @When("User fills in the mandatory fields")
  public void user_fills_in_the_mandatory_fields() {
    // Fill in mandatory fields
  }

  @When("User selects a specific group for message delivery")
  public void user_selects_a_specific_group_for_message_delivery() {
    // Select a specific group for message delivery
  }

  @When("User clicks on the Send button")
  public void user_clicks_on_the_send_button() {
    // Click on Send button
  }

  @When("User clicks on the Cancel button")
  public void user_clicks_on_the_cancel_button() {
    // Click on Cancel button
  }

  @Then("The message should be sent to all employees")
  public void the_message_should_be_sent_to_all_employees() {
    // Verify that the message is sent to all employees
  }

  @Then("The message should be sent to the selected group only")
  public void the_message_should_be_sent_to_the_selected_group_only() {
    // Verify that the message is sent to the selected group only
  }

  @Then("The message should not be sent")
  public void the_message_should_not_be_sent() {
    // Verify that the message is not sent
  }
}

 */




/*
public class SendAppreciationSteps {
  WebDriver driver;
  HomePage homePage;
  AppreciationPage appreciationPage;

  @Given("I am on the homepage")
  public void iAmOnTheHomepage() {
    // Initialize the driver and navigate to the homepage
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
    homePage.navigateTo();
  }

  @When("I click on the Appreciation tab under Active Stream")
  public void iClickOnTheAppreciationTabUnderActiveStream() {
    // Click on the Appreciation tab on the Active Stream
    homePage.clickActiveStream();
    homePage.clickAppreciationTab();
    appreciationPage = new AppreciationPage(driver);
  }

  @And("I enter {string} in the message field")
  public void iEnterInTheMessageField(String message) {
    // Enter the message in the message field
    appreciationPage.enterMessage(message);
  }

  @And("I select an icon for the appreciation")
  public void iSelectAnIconForTheAppreciation() {
    // Select an icon for the appreciation
    appreciationPage.selectIcon();
  }

  @And("I select a different group from the dropdown menu")
  public void iSelectADifferentGroupFromTheDropdownMenu() {
    // Select a different group from the dropdown menu
    appreciationPage.selectGroup("Marketing");
  }

  @And("I click on the Send button")
  public void iClickOnTheSendButton() {
    // Click on the Send button to send the appreciation message
    appreciationPage.clickSendButton();
  }

  @And("I click on the Cancel button")
  public void iClickOnTheCancelButton() {
    // Click on the Cancel button to cancel the appreciation message
    appreciationPage.clickCancelButton();
  }

  @Then("the appreciation message should be sent to all employees")
  public void theAppreciationMessageShouldBeSentToAllEmployees() {
    // Verify that the appreciation message is sent to all employees
    assertTrue(appreciationPage.isMessageSentToAllEmployees());
  }

  @Then("the appreciation message should be sent to the selected group")
  public void theAppreciationMessage ShouldBeSentToTheSelectedGroup() {
// Verify that the appreciation message is sent to the selected group
assertTrue(appreciationPage.isMessageSentToSelectedGroup("Marketing"));
}

@Then("the appreciation message should not be sent")
public void theAppreciationMessageShouldNotBeSent() {
// Verify that the appreciation message is not sent
assertFalse(appreciationPage.isMessageSent());
}

@After
public void tearDown() {
// Quit the driver after each test
driver.quit();
}
}

 */