package net.crmly.pages;

public class StreamPage {
}
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppreciationPage {

  private final WebDriver driver;

  private final By appreciationTab = By.id("appreciation-tab");
  private final By messageInput = By.id("message-input");
  private final By sendButton = By.id("send-button");
  private final By cancelButton = By.id("cancel-button");
  private final By groupDropdown = By.id("group-dropdown");

  public AppreciationPage(WebDriver driver) {
    this.driver = driver;
  }

  public void clickAppreciationTab() {
driver.findElement(appreciationTab).click();
}

public void enterMessage(String message) {
driver.findElement(messageInput).sendKeys(message);
}

public void selectGroup(String group) {
driver.findElement(groupDropdown).click();
driver.findElement(By.xpath("//option[text()='" + group + "']")).click();
}

public void clickSendButton() {
driver.findElement(sendButton).click();
}

public void clickCancelButton() {
driver.findElement(cancelButton).click();
}
}

 */


/*

And here's the corresponding page file for the Appreciation page:

```java
public class AppreciationPage {
  WebDriver driver;
  By messageField = By.id("message");
  By iconSelector = By.id("icon-selector");
  By sendButton = By.id("send-button");
  By cancelButton = By.id("cancel-button");
  By groupSelector = By.id("group-selector");

  public AppreciationPage(WebDriver driver) {
    this.driver = driver;
  }

  public void enterMessage(String message) {
    // Enter the message in the message field
    driver.findElement(messageField).sendKeys(message);
  }

  public void selectIcon() {
    // Select an icon for the appreciation
    driver.findElement(iconSelector).click();
  }

  public void selectGroup(String group) {
    // Select a group from the dropdown menu
    Select groupDropdown = new Select(driver.findElement(groupSelector));
    groupDropdown.selectByVisibleText(group);
  }

  public void clickSendButton() {
    // Click on the Send button to send the appreciation message
    driver.findElement(sendButton).click();
  }

  public void clickCancelButton() {
    // Click on the Cancel button to cancel the appreciation message
    driver.findElement(cancelButton).click();
  }

  public boolean isMessageSentToAllEmployees() {
    // Check if the message is sent to all employees
    return true; // replace with actual implementation
  }

  public boolean isMessageSentToSelectedGroup(String group) {
    // Check if the message is sent to the selected group
    return true; // replace with actual implementation
  }

  public boolean isMessageSent() {
    // Check if the message is sent
    return false; // replace with actual implementation
  }
}

And here's the corresponding page file for the Appreciation page:

```java
public class AppreciationPage {
  WebDriver driver;
  By messageField = By.id("message");
  By iconSelector = By.id("icon-selector");
  By sendButton = By.id("send-button");
  By cancelButton = By.id("cancel-button");
  By groupSelector = By.id("group-selector");

  public AppreciationPage(WebDriver driver) {
    this.driver = driver;
  }

  public void enterMessage(String message) {
    // Enter the message in the message field
    driver.findElement(messageField).sendKeys(message);
  }

  public void selectIcon() {
    // Select an icon for the appreciation
    driver.findElement(iconSelector).click();
  }

  public void selectGroup(String group) {
    // Select a group from the dropdown menu
    Select groupDropdown = new Select(driver.findElement(groupSelector));
    groupDropdown.selectByVisibleText(group);
  }

  public void clickSendButton() {
    // Click on the Send button to send the appreciation message
    driver.findElement(sendButton).click();
  }

  public void clickCancelButton() {
    // Click on the Cancel button to cancel the appreciation message
    driver.findElement(cancelButton).click();
  }

  public boolean isMessageSentToAllEmployees() {
    // Check if the message is sent to all employees
    return true; // replace with actual implementation
  }

  public boolean isMessageSentToSelectedGroup(String group) {
    // Check if the message is sent to the selected group
    return true; // replace with actual implementation
  }

  public boolean isMessageSent() {
    // Check if the message is sent
    return false; // replace with actual implementation
  }
}
Note that the isMessageSentToAllEmployees(), isMessageSentToSelectedGroup(String group), and isMessageSent() methods are currently placeholders and will need to be implemented to check if the message is sent to the correct group and if it is sent at all.
 */

