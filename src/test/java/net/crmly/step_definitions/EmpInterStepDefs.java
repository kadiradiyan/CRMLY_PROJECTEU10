package net.crmly.step_definitions;

import io.cucumber.java.en.Then;
import net.crmly.pages.EmpInterPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.Driver;
import org.openqa.selenium.Alert;

public class EmpInterStepDefs {
    EmpInterPage empInterPage = new EmpInterPage();
    @Then("User clicks {string} link under employees post")
    public void user_clicks_link_under_employees_post(String string) {
        empInterPage.commentLinkOther.click();

    }
    @Then("User writes a {string} in the comment under any other employees post")
    public void user_writes_a_in_the_comment_under_any_other_employees_post(String string) {
        BrowserUtils.sleep(3);
        Driver.getDriver().switchTo().frame(0);
        empInterPage.commentBoxOther.sendKeys(string);

    }
    @Then("User clicks {string} button after commenting")
    public void user_clicks_button_after_commenting(String string) {
        Driver.getDriver().switchTo().parentFrame();
        empInterPage.sendBtnOther.click();
    }
    @Then("User likes other employees post by clicking {string} link")
    public void user_likes_other_employees_post_by_clicking_link(String string) {
        empInterPage.likeLinkOther.click();
    }
    @Then("User unfollows other employees post by clicking {string} link")
    public void user_unfollows_other_employees_post_by_clicking_link(String string) {
        empInterPage.unfollowLinkOther.click();
        BrowserUtils.sleep(5);
    }

///////////////////////////
    @Then("User likes his own comment by clicking {string} link under his comment")
    public void userLikesHisOwnCommentByClickingLinkUnderHisComment(String arg0) {
        empInterPage.likeOwnComment.click();
    }

    @Then("User click {string} link under his comment")
    public void user_click_link_under_his_comment(String string) {
        empInterPage.replyButtonOwnComment.click();

    }
    @Then("User writes {string} in the comment box")
    public void user_writes_in_the_comment_box(String string) {
        Driver.getDriver().switchTo().frame(0);
        empInterPage.replyBoxOwn.sendKeys(string);
        Driver.getDriver().switchTo().parentFrame();

    }
    @Then("User clicks {string} button under his new comment")
    public void user_clicks_button_under_his_new_comment(String string) {
        empInterPage.sendReplyOwn.click();

    }

    ///////////////////////////

    @Then("User clicks {string} link under his comment")
    public void user_clicks_link_under_his_comment(String string) {

        empInterPage.moreLink.click();

    }
    @Then("User clicks {string} from the list of options and edits comment")
    public void user_clicks_from_the_list_of_options_and_edits_comment(String string) {
        empInterPage.editButton.click();
        Driver.getDriver().switchTo().frame(0);
        empInterPage.editBox.sendKeys(string);
        Driver.getDriver().switchTo().parentFrame();

    }
    @Then("User clicks {string} button after editing")
    public void user_clicks_button_after_editing(String string) {
        empInterPage.sendAfterEdit.click();
    }

    @Then("User clicks {string} from the list of options")
    public void user_clicks_from_the_list_of_options(String string) {
        empInterPage.moreLink.click();
        empInterPage.deleteComment.click();
    }
    @Then("User click {string} button of the alert")
    public void user_click_button_of_the_alert(String string) {
        Driver.getDriver().switchTo().alert().accept();
    }

    /////////////////////////////////

    @Then("User click to the star {string} and comment added to favourites")
    public void user_click_to_the_star_and_comment_added_to_favourites(String string) {
        empInterPage.addToFavourites.click();
    }
    @Then("User clicks to the star {string} and comment removed from favourites")
    public void user_clicks_to_the_star_and_comment_removed_from_favourites(String string) {
        empInterPage.addToFavourites.click();
    }



}
