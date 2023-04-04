package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {

    public UploadFilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "USER_LOGIN")
    public WebElement usernameBox;


    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordBox;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-message\"]/span")
    public WebElement messageButton;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadIcon;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadButton;

    @FindBy(xpath = "//span[@class='insert-btn']")
    public static WebElement insertTextButton;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeButton;

    @FindBy(xpath = "//span[@class='files-name-edit-btn']")
    public WebElement editButton;


    @FindBy(xpath = "//img[@class='files-preview']")
    public WebElement image;

    @FindBy(xpath = "//input[@class='files-name-edit-inp']")
    public WebElement textBox;


    public void uploadFile(String string) {

        String filePath = "";

        if (string.equals("pgn")) {
            filePath = "C:\\Users\\44777\\OneDrive\\Desktop\\LOGIN CREDENTIALS\\Screenshot 2023-02-27 141318.png";

        } else if (string.equals("pdf")) {
            filePath = "C:\\Users\\44777\\OneDrive\\Desktop\\LOGIN CREDENTIALS\\My_Cucumber_Framework_StepByStep.pdf";

        } else if (string.equals("txt")) {
            filePath = "C:\\Users\\44777\\OneDrive\\Desktop\\java programing B25\\Day48\\day48 class notes-1.txt";

        } else if (string.equals("gif")) {
            filePath = "C:\\Users\\44777\\OneDrive\\Desktop\\LOGIN CREDENTIALS\\gif.gif";

        } else if (string.equals("jpg")) {
            filePath = "C:\\Users\\44777\\OneDrive\\Desktop\\LOGIN CREDENTIALS\\Screenshot 2023-04-01 134706.jpg";

        }
        uploadButton.sendKeys(filePath);


    }

}
