package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MsgModulePage {

    public MsgModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"microoPostFormLHE_blogPostForm_inner\"]/span[1]")
    public WebElement sendMsgBox;

    @FindBy(xpath = "/html/body")
    public WebElement typeMessage;


    @FindBy(xpath = "//iframe[@class=\"bx-editor-iframe\"]")
    public WebElement messageIframe;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendBtn;

//    @FindBy(linkText = "Send")
//    public WebElement sendBtn;


        @FindBy(xpath ="//button[@id='blog-submit-button-cancel']")
    public WebElement cancelBtn;

//    @FindBy(linkText = "Cancel")
//    public WebElement cancelBtn;


    @FindBy(className= ("feed-wrap"))
    public WebElement msgInActvStream;



    @FindBy(xpath = "//span[@class=\"feed-add-post-destination-text\"]")
    public WebElement allEmployeesBtn;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement removeAllEmp;


    @FindBy(xpath = "//*[@id='bx-destination-tag']")
    public WebElement addRecipients;

//    @FindBy(linkText = "Add persons, groups or department")
//    public WebElement addRecipients;


//    @FindBy(xpath = "//*[@id='destDepartmentTab_destination0480399']")
//    public WebElement employeesAndDepartmentsTab;

    @FindBy(linkText = "Employees and departments")
    public WebElement employeesAndDepartmentsTab;

    public String email2 = "hr75@cybertekschool.com";

    @FindBy(xpath = "//*[@class=\"popup-window-close-icon\"]")
    public WebElement closeIcon;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> employeesAndDepartments;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement messageTitleError;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement noRecipientError;













}
