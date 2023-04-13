package net.crmly.step_definitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import net.crmly.pages.EventPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.crmly.utilities.ConfigurationReader;
import net.crmly.utilities.Driver;
import org.junit.Assert;

public class EventStepDefs {
    EventPage EventPage = new EventPage();

  //  @Given("user logs in as a {string}")
   // public void user_logs_in_as_a(String string) {
   //  String url= ConfigurationReader.getProperty("web.url");
    // Driver.getDriver().get(url);
    // EventPage.loginusername.sendKeys("hr1@cybertekschool.com");
    //EventPage.loginPassword.sendKeys("UserUser");
   // EventPage.loginButton.click();

    @When("user clicks on Event button")
    public void user_clicks_on_event_button() {
        EventPage.Eventbutton.click();
    }

    @When("user clicks on Send button")
    public void user_clicks_on_send_button() {
        EventPage.Sendbutton.click();

    }

    @Then("user creates Event")
    public void user_creates_event() {
        EventPage.Event.isDisplayed();
    }

    // @And("user leaves event name fields empty")
    // public void userLeavesEventNameFieldsEmpty() {
    //   Assert.assertTrue(EventPage.FieldsEmpty.isDisplayed);


    @Then("user sees {string} error message")
    public void userSeesErrorMessage(String arg0) {
        Assert.assertTrue(EventPage.errorMessage.isDisplayed());

    }


    @And("user enters {string} as a event name")
    public void userEntersAsAEventName(String EventName) {
        EventPage.eventName.sendKeys(EventName);


    }


    @And("user clicks on Upcoming Events")
    public void userClicksOnUpcomingEvents() {
      //  EventPage.UpcomingEvents.click;
    }

    @And("user set reminder and send Event")
    public void userSetReminderAndSendEvent() {
        EventPage.setReminderAndsendEvent.sendKeys();
        }
    }
