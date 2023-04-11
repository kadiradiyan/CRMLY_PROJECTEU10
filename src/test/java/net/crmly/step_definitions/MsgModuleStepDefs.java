package net.crmly.step_definitions;

import io.cucumber.core.options.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.crmly.pages.MsgModulePage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.ConfigurationReader;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MsgModuleStepDefs {

   MsgModulePage msgModulePage = new MsgModulePage();

//----User should be able to send a message by filling in the mandatory fields----//
    @Then("User clicks MESSAGE module")
    public void user_clicks_message_module() {
       // msgModulePage.messageBtn.click();
        msgModulePage.sendMsgBox.click();
    }

    @Then("User writes a message {string} into Message box")
    public void user_writes_a_message_into_message_box(String message) {

        message = ConfigurationReader.getProperty("message");

        Driver.getDriver().switchTo().frame(msgModulePage.messageIframe);
        msgModulePage.typeMessage.sendKeys(message);
        BrowserUtils.waitFor(1);
        Driver.getDriver().switchTo().parentFrame();

    }

    //dynamic button click
    @Then("User clicks {string} button")
    public void user_clicks_button(String button) {

        Driver.getDriver().findElement(By.xpath("//button[contains(@id,'blog-submit-button')][.='"+button+"']")).click();
    }

//SINGLE BUTTON CLICK
//    @Then("User clicks SEND button")
//    public void user_clicks_send_button() {
//        msgModulePage.sendBtn.click();
//    }



//----The message delivery should be to 'All employees' by default and should be changeable----//

    @Then("All Employees button should be seen as default recipient")
    public void all_employees_button_should_be_seen_as_default_recipient() {

        BrowserUtils.waitForVisibility(msgModulePage.allEmployeesBtn, 2);
        Assert.assertTrue(msgModulePage.allEmployeesBtn.isDisplayed());

    }
    @Then("User removes default recipient")
    public void user_removes_default_recipient() {
       BrowserUtils.sleep(1);
       msgModulePage.removeAllEmp.click();
    }


//    @Then("User clicks {string} link")
//    public void user_clicks_link(String link) {
//       Driver.getDriver().findElement(By.xpath("//*[@id='"+link+"']")).click();
//    }

    @Then("User clicks add {string} link")
    public void user_clicks_add_link(String string) {
        msgModulePage.addRecipients.click();
        //BrowserUtils.sleep(1);
    }


    @Then("User clicks {string} link")
    public void user_clicks_link(String string) {
        msgModulePage.employeesAndDepartmentsTab.click();
    }


    @Then("User clicks {string} from the list")
    public void user_clicks_from_the_list(String person) {
        person = msgModulePage.email2;

        for (WebElement eachPerson : msgModulePage.employeesAndDepartments) {
            System.out.println("eachPerson.getText() = " + eachPerson.getText());
            if (eachPerson.getText().equals(person)) {
                eachPerson.click();
            }
        }
        BrowserUtils.sleep(1);

        msgModulePage.closeIcon.click();
    }




    @Then("User does NOT write a Message Text")
    public void user_does_not_write_a_message_text() {
        // User leaves message Text fields BLANK
        BrowserUtils.waitFor(1);
    }

    @Then("User should see {string} error message")
    public void user_should_see_error_message(String messageError) {
//                                                                                            //this will get dynamic error message
       String  actualMessageTitleError = Driver.getDriver().findElement(By.xpath("//span[.='" + messageError + "']")).getText();
       Assert.assertEquals(actualMessageTitleError, messageError);
    }



//----User should be able to CANCEL sending messages at any time before sending----//



}
