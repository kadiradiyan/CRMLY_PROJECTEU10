package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    public WebElement sendMessageField;


    public void navigateToModule(String module){

        WebElement element = Driver.getDriver().findElement(By.xpath("//span[contains(@id,'feed-add-post-form-tab')][.='"+module+"']"));

        element.click();

    }

//    public void sendAndCancelBtn(String button){
//
//        sendMessageField.click();
//        WebElement btn = Driver.getDriver().findElement(By.xpath("//button[contains(@id,'blog-submit-button')][.='" + button + "']"));
//        btn.click();
//
//    }


}
