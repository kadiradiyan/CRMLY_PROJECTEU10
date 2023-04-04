package net.crmly.step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.UploadFilePage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class UploadFileStepDefs {

    UploadFilePage uploadFilePages = new UploadFilePage();



    @Then("user click on message button")
    public void user_click_on_message_button() {
        uploadFilePages.messageButton.click();

    }


    @When("user clicks  Upload files icon")
    public void userClicksUploadFilesIcon() {
        uploadFilePages.uploadIcon.click();

    }

    @Then("user Upload multiple files and images")
    public void userUploadMultipleFilesAndImages() {
        // uploadFilePages.UploadMultipleFile();
        uploadFilePages.uploadFile("gif");
        uploadFilePages.uploadFile("txt");
        BrowserUtils.sleep(2);
        uploadFilePages.uploadFile("jpg");
        BrowserUtils.sleep(5);


    }


    @Then("user insert the files and images into the text")
    public void userInsertTheFilesAndImagesIntoTheText() {
        uploadFilePages. insertTextButton.click();


    }

    @Then("user remove files and images before sending")
    public void userRemoveFilesAndImagesBeforeSending() {

        uploadFilePages.removeButton.click();
    }


    @Then("user rename the file before sending it")
    public void userRenameTheFileBeforeSendingIt() {

        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        actions.moveToElement(uploadFilePages.image);
        actions.moveToElement(uploadFilePages.editButton).click().perform();
        uploadFilePages.textBox.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        uploadFilePages.textBox.sendKeys("newName");
        uploadFilePages.textBox.sendKeys(Keys.CONTROL,Keys.ENTER);


    }

    @And("user Upload files and images")
    public void userUploadFilesAndImages() {
        uploadFilePages.uploadFile("gif");


    }


    @Then("user upload files in different formats")
    public void userUploadFilesInDifferentFormats(List<String> string) {
        uploadFilePages.uploadFile("pdf");
        BrowserUtils.sleep(2);
        uploadFilePages.uploadFile("txt");
    }






}




