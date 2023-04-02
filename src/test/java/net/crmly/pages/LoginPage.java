package net.crmly.pages;

import net.crmly.utilities.ConfigurationReader;
import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement loginPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;



    // below methods will log in using credentials from  configuration.properties


    public void goLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void loginAsUserType(String userType){

        String password = "";
        String username = "";

        if (userType.equals("HR")) {
            username = ConfigurationReader.getProperty("hrUsername");
            password = ConfigurationReader.getProperty("password");
        }
        else if (userType.equals("Marketing")) {
            username = ConfigurationReader.getProperty("marketingUsername");
            password = ConfigurationReader.getProperty("password");
        }
        else if (userType.equals("Helpdesk")) {
            username = ConfigurationReader.getProperty("helpdeskUsername");
            password = ConfigurationReader.getProperty("password");
        }

        loginUserName.sendKeys(username);
        loginPassword.sendKeys(password);
        loginButton.click();
    }

    public String getPageTitle() {
        return Driver.getDriver().getTitle();
    }   }

/*
    public void navigateLogInPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void loginAsHr(){
        userLogin.sendKeys(ConfigurationReader.getProperty("hrUsername"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }
    public void loginAsMarketing(){
        userLogin.sendKeys(ConfigurationReader.getProperty("marketingUsername"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void loginAsHelpdesk(){
        userLogin.sendKeys(ConfigurationReader.getProperty("helpdeskUsername"));
        userPassword.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void logInWithCredentials (String username, String password){
        userLogin.sendKeys(username);
        userPassword.sendKeys(password);
        loginButton.click();
    }
}
*/ //this is the other method for login page
