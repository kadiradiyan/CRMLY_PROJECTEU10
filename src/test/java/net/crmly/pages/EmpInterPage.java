package net.crmly.pages;

import net.crmly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpInterPage {

    public EmpInterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='blog-post-addc-add-455']")
    public WebElement commentLinkOther;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement commentBoxOther;

    @FindBy(xpath = "//button[starts-with(@id,'lhe_button_submit_blogCommentForm')]")
    public WebElement sendBtnOther;

    @FindBy(xpath = "//a[contains(text(),'Like')][1]")
    public WebElement likeLinkOther;

    @FindBy(xpath = "//*[@id=\"log_entry_follow_1198\"]/a")
    public WebElement unfollowLinkOther;

    //////////////

    @FindBy(xpath = "(//a[contains(text(),'Like')])[3]")
    public WebElement likeOwnComment;

    @FindBy(xpath = "//a[@id='record-BLOG_455-27-actions-reply']")
    public WebElement replyButtonOwnComment;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement replyBoxOwn;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement sendReplyOwn;

    /////////////

    @FindBy(xpath = "(//span[@class='feed-post-more-text'])[4]")
    public WebElement moreLink;

    @FindBy(xpath = "//span[contains(text(), 'Edit')]")
    public  WebElement editButton;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement editBox;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-sm ui-btn-primary'])[1]")
    public WebElement sendAfterEdit;

    @FindBy(xpath = "//span[contains(text(), 'Delete')]")
    public WebElement deleteComment;

////////
    @FindBy(xpath = "//div[@id='log_entry_favorites_1198']")
    public WebElement addToFavourites;






}
