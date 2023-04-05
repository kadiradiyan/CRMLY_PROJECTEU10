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
        String projectPath=System.getProperty("user.dir");

        String filePath = "";

        if (string.equals("pgn")) {
            filePath = projectPath+"\\"+"\\src\\test\\resources\\png (2).png";

        } else if (string.equals("pdf")) {
            filePath = projectPath+"\\"+"\\src\\test\\resources\\pdf.pdf";

        } else if (string.equals("txt")) {
            filePath=projectPath+"\\"+"\\src\\test\\resources\\txt.txt";

        } else if (string.equals("gif")) {
            filePath=projectPath+"\\"+"\\src\\test\\resources\\gif.gif";

        } else if (string.equals("jpg")) {
            filePath=projectPath+"\\"+"\\src\\test\\resources\\jpg.jpg";

        }
        uploadButton.sendKeys(filePath); }

    }

