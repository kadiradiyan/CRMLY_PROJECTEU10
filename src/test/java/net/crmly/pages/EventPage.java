package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
    public class EventPage {

      //  public class Eventpage{

            public EventPage() {
                PageFactory.initElements(Driver.getDriver(), this);
            }
       // }
        @FindBy(xpath = "//span[.='Event']")
        public WebElement Event;


        @FindBy(id = "blog-submit-button-save")
        public WebElement Sendbutton;
        @FindBy(name = "EVENT_NAME")
        public WebElement eventName;

        @FindBy(xpath = "//a[.='my event']")
        public WebElement myEvent;

        @FindBy(xpath = "//*[.='feed-add-post-form-tab-message']")
        public WebElement errorMessage;

        @FindBy(xpath = "//*[.='login-inp']")
        public WebElement userLogsinAsUserType;

        @FindBy(xpath = "//*[.='feed-event-rem-lbl-for']")
        public WebElement setReminderAndsendEvent;

        @FindBy(xpath = "//*[.='event-remindercal_3Jcl']")
        public WebElement seeRemainderlabel;
        @FindBy(xpath = "//span[.='Event']")
        public WebElement Eventbutton;

    }

