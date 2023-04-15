package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpInterPage {

    public EmpInterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[starts-with(@id,'blog-post-addc-add')])[1]") //(//a[starts-with(@id,'blog-post-addc-add')])[1]
    public WebElement commentLinkOther;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement commentBoxOther;

    @FindBy(xpath = "//button[starts-with(@id,'lhe_button_submit_blogCommentForm')]")
    public WebElement sendBtnOther;

    @FindBy(xpath = "(//a[contains(text(),'Like')])[1]")
    public WebElement likeLinkOther;

    @FindBy(xpath = "(//span[starts-with(@id,'log_entry_follow')])[1]")  //(//span[starts-with(@id,'log_entry_follow')])[1]
    public WebElement unfollowLinkOther;

    //////////////

    @FindBy(xpath = "(//div[@class = 'feed-com-informers-bottom']/span/span/a)[1]")  //(//div[@class = 'feed-com-informers-bottom']/span/span/a)[1]
    public WebElement likeOwnComment;

    @FindBy(xpath = "(//a[starts-with(@id,'record-BLOG_')])[1]") //(//a[starts-with(@id,'record-BLOG_')])[1]
    public WebElement replyButtonOwnComment;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement replyBoxOwn;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement sendReplyOwn;

    /////////////

    @FindBy(xpath = "(//div[@class = 'feed-com-informers-bottom']/a/span)[1]") //(//div[@class = 'feed-com-informers-bottom']/a/span)[1]
    public WebElement moreLink;


    @FindBy(xpath = "//span[contains(text(), 'Edit')]")
    public  WebElement editButton;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement editBox;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]") //
    public WebElement sendAfterEdit;

    @FindBy(xpath = "//span[contains(text(),'Delete')]") //((//div[starts-with(@id, 'popup-window-content-menu-popup-action-')]/div/div/span)[4]/span)[2]
    public WebElement deleteComment;

////////
    @FindBy(xpath = "(//div[starts-with(@id,'log_entry_favorites')])[1]") //(//div[starts-with(@id,'log_entry_favorites')])[1]
    public WebElement addToFavourites;






}
