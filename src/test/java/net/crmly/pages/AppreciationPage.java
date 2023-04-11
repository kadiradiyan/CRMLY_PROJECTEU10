package net.crmly.pages;

import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.ConfigurationReader;
import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage extends BasePage {

    // Constructor
    public AppreciationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // Locators using @FindBy annotation


    @FindBy(xpath = "//*[@id=\"feed-add-post-form-link-text\"]")
    public WebElement activeStreamTab; //moreButton --> for appreciation tab

    @FindBy(xpath = "//span[contains(text(),'Appreciation')]")
    public WebElement appreciationTab;

    @FindBy(xpath = "/html/body")
    public WebElement messageField;

    @FindBy(xpath = "//select[@id='groupField']")
    public WebElement groupField;

    @FindBy(xpath = "//*[@id=\"bx-destination-tag\"]")
    public WebElement addMoreButton;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement addMoreBox;
    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMoreGroupButton;

    @FindBy(linkText = "Employees and departments")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement deleteAllEmployee;
    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[1]")
    public WebElement addrecipient;
    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")
    public WebElement errorMessageTitle;
    @FindBy(xpath = "//body/div[@id='BXSocNetLogDestination']/div[@id='popup-window-content-BXSocNetLogDestination']/div[1]/div[2]/table[1]/tr[1]/td[1]/div[2]/div[2]/div[15]/a[1]/div[1]")
  //  @FindBy(xpath = "(//div[@class='bx-finder-company-department-text'])[6]")
    public WebElement technicalTeamButton;
    @FindBy(xpath= "//body/div[@id='BXSocNetLogDestination']/div[@id='popup-window-content-BXSocNetLogDestination']/div[1]/div[2]/table[1]/tr[1]/td[1]/div[2]/div[2]/div[14]/a[1]/span[1]/div[1]")
    public WebElement allDepartmentAndEmployeesOfTechnicalTeamButton;

    @FindBy(xpath = "//span[contains(text(),'All employees')]")
    public WebElement allEmployeesGroupOption;

    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[2]/div[2]/div[9]/a/div[1]")
    public WebElement technicalTeamDisplayed;

    @FindBy(xpath = "//div[contains(text(),'hr75@cybertekschool.com')]")
    public WebElement selectHr75User;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "(//span[contains(@id,'feed-post-more-')])[1]")
    public WebElement moreButton;

    @FindBy(xpath = "//span[.='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id=\"feed-add-post-grat-type-selected\"]/span")
    public WebElement iconMenuButton;

    @FindBy(xpath = "//*[@id=\"popup-window-content-BXSocNetGratSelector\"]/div/div[2]/div[2]/span[2]")
    public WebElement selectAnIconButton;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span[2]/span[2]")
    public WebElement deleteNewRecipient;


    // Methods to interact with page elements


    public void clickActiveStreamTab() {
        activeStreamTab.click();
    }

    public void clickAppreciationTab() {
        appreciationTab.click();
    }

    public void enterMessage(String message) {
        messageField.sendKeys(message);
    }

    public void selectAllEmployeesGroup() {
        groupField.click();
        allEmployeesGroupOption.click();
    }
    public void selectAnIcon() {
        iconMenuButton.click();
        selectAnIconButton.click();
    }

    public void selectTechnicalTeamGroup() {

        addMoreGroupButton.click();
        employeesAndDepartmentsButton.click();
        technicalTeamButton.click();
        allDepartmentAndEmployeesOfTechnicalTeamButton.click();


    }

    public void clickSendButton() {
        BrowserUtils.waitForClickablility(sendButton, 5);
        sendButton.click();
    }

    public void clickCancelButton() {
        BrowserUtils.waitForClickablility(cancelButton, 5);
        cancelButton.click();
    }

    public void selectHr75User() {
        addMoreGroupButton.click();
        selectHr75User.click();
    }
}


