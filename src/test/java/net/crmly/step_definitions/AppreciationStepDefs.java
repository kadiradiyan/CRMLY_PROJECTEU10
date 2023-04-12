package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.AppreciationPage;
import net.crmly.pages.LoginPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AppreciationStepDefs {


/*    @When("User clicks on the {string} tab")
    public void userClicksOnTheTab(String module) {
        Driver.getDriver().findElement(By.xpath("//span[.='" + module + "']")).click();


    }


    @And("User clicks on the {string} button")
    public void userClicksOnTheButton(String button) {
        Driver.getDriver().findElement(By.xpath("//button[contains(@id,'blog-submit-button')][.='" + button + "']")).click();
    }*/


    AppreciationPage appreciationPage = new AppreciationPage();


    @When("User clicks on the {string} tab")
    public void user_clicks_on_the_tab(String tabName) {
        BrowserUtils.waitForVisibility(appreciationPage.activeStreamTab, 5);
        if (tabName.equalsIgnoreCase("Active Stream")) {
            appreciationPage.clickActiveStreamTab();
        } else if (tabName.equalsIgnoreCase("Appreciation")) {
            appreciationPage.clickAppreciationTab();
        }
    }

    @And("User fills in the mandatory fields with {string} in the message field")
    public void user_fills_in_the_mandatory_fields_with_in_the_message_field(String message) {
        Driver.getDriver().switchTo().frame(0);
        appreciationPage.enterMessage(message);
        Driver.getDriver().switchTo().parentFrame();
    }

    @And("User clicks on the {string} button")
    public void user_clicks_on_the_button(String buttonName) {
        if (buttonName.equalsIgnoreCase("Send")) {
            appreciationPage.clickSendButton();
        } else if (buttonName.equalsIgnoreCase("Cancel")) {
            appreciationPage.clickCancelButton();
        }
    }




    @When("User verifies the {string} group is selected by default")
    public void user_verifies_the_group_is_selected_by_default(String groupName) {
        // verify that the correct group is selected by default
        // this can be done by checking if the correct option is selected in the group field
        Assert.assertTrue(appreciationPage.allEmployeesGroupOption.isDisplayed());
    }





    @When("User selects an icon for the appreciation")
    public void user_selects_an_icon_for_the_appreciation() {
        // select an icon for the appreciation
        appreciationPage.selectAnIcon();

    }



    @Then("User clicks on {string} button and clicks on {string} button")
    public void userClicksOnButtonAndClicksOnButton(String moreButton, String delete) {
        appreciationPage.moreButton.click();
        appreciationPage.deleteButton.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }

    @And("user add new recipient {string}")
    public void userAddNewRecipient(String string) {
        if (string.equals("helpdesk4@cybertekschool.com")) {
            appreciationPage.addMoreButton.click();
            appreciationPage.addMoreBox.sendKeys("helpdesk4@cybertekschool.com" );
            appreciationPage.addrecipient.click();
        } else if (string.equals("helpdesk2@cybertekschool.com")) appreciationPage.addMoreButton.click();
        appreciationPage.addMoreBox.sendKeys("hr");
        appreciationPage.addrecipient.click();
    }




    @Then("user delete added recipients")
    public void userDeleteAddedRecipients() {
        //appreciationPage.deleteSecondRecipient.click();
        appreciationPage.deleteNewRecipient.click();

    }

    @And("User deleted {string} recipient")
    public void userDeletedRecipient(String recipient) {
        appreciationPage.deleteAllEmployee.click();
    }

    @When("User deleted default {string} recipient")
    public void userDeletedDefaultRecipient(String arg0) {
        appreciationPage.deleteAllEmployee.click();
    }

    @Then("User verifies the error message {string} is displayed")
    public void userVerifiesTheErrorMessageIsDisplayed(String arg0) {
        appreciationPage.errorMessageTitle.isDisplayed();
    }



    }




/////////////////////////////////////////////////////////////////////////////


