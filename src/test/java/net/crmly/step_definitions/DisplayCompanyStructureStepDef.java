package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.crmly.pages.CompanyStructurePage;
import net.crmly.pages.LoginPage;
import net.crmly.utilities.BrowserUtils;
import net.crmly.utilities.ConfigurationReader;
import net.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DisplayCompanyStructureStepDef {

    CompanyStructurePage companyStructurePage = new CompanyStructurePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());


    @Then("User clicks on {string} button")
    public void userClicksOnButton(String employeeButton) {
        BrowserUtils.waitFor(2);
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Employees')]")).click();
    }

    @Then("User sees {string} header")
    public void userSeesHeader(String companyText) {
         companyStructurePage.companyStructureHeader.isDisplayed();

    }

    @When("User clicks on the {string} button")
    public void userClicksOnTheButton(String addDepartmentButton) {
        companyStructurePage.addDepartmentButton.click();
    }

    @When("User types department name {string} for the department text field")
    public void userTypesDepartmentNameForTheDepartmentTextField(String textField) {
        companyStructurePage.departmentNameDropdown.sendKeys("Marketing");
    }

    @When("User clicks on the {string} button on next window")
    public void userClicksOnTheButtonOnNextWindow(String addButton) {
        actions.moveToElement(companyStructurePage.addButton).click().build().perform();
        js.executeScript("arguments[0].click();",companyStructurePage.addButton);
    }

    @Then("User sees the department column {string} on the Company Structure page")
    public void userSeesTheDepartmentColumnOnTheCompanyStructurePage(String departmentColumnMarketing) {
        companyStructurePage.departmentName.isDisplayed();
        Assert.assertEquals("Marketing", companyStructurePage.departmentName.getText());
    }
  /*
    @When("User selects a parent department {string} from parent dropdown")
    public void userSelectsAParentDepartmentFromParentDropdown(String parentDepToSelect) {

    }

    @Then("User sees parent department {string} in the parent department dropdown")
    public void userSeesParentDepartmentInTheParentDepartmentDropdown(String expectedDepartment) {

    }
*/
    @When("User sees {string} model")
    public void userSeesModal(String addDepartmentModel) {
        Assert.assertTrue(companyStructurePage.addDepartmentModelButton.isDisplayed());
    }

    @Then("User clicks on close button")
    public void userClicksOnCloseButton() {
        companyStructurePage.closeButton.click();
    }

    @Then("User can not see  add Department model button")
    public void userCanNotSeeAddDepartmentModalButton() {
        companyStructurePage.addDepartmentModelButton.isDisplayed();
        Assert.assertFalse(companyStructurePage.addDepartmentModelButton.isDisplayed());
    }

    @Then("User does not see Add department button")
    public void userDoesNotSeeAddDepartmentButton() {
        System.out.println("addDepartment Button is not displayed");
    }

    @Then("User sees error message {string} on the add Department page")
    public void userSeesErrorMessageOnTheAddDepartmentPage(String expectedErrorMessage) {
        companyStructurePage.errorMessage.isDisplayed();

        String actualText = companyStructurePage.errorMessage.getText();
        Assert.assertEquals(expectedErrorMessage,actualText);
    }



}