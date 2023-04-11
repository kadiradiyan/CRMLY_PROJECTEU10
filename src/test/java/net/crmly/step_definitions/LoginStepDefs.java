package net.crmly.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.crmly.pages.LoginPage;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("User logs into the platform")
    public void user_logs_into_the_platform() {
        loginPage.goLoginPage();
    }
    @When("User logs in with {string}")
    public void user_logs_in_with_and(String userType) {
        loginPage.loginAsUserType(userType);
    }

     /*   LoginPage logInPage = new LoginPage();


    @Given("User navigates to website")
    public void user_navigates_to_website() {
        logInPage.navigateLogInPage();
    }


    @When("User logs in with following credentials \\(list)")
    public void userLogsInWithFollowingCredentialsList(List<String> credentialsList) {
        String username = credentialsList.get(0);
        String password = credentialsList.get(1);
        logInPage.logInWithCredentials(username, password);
    }
*/  // this is the other option for login , for activate this fist activate LoginPage uncomment lines, anyway we dont need this this only for to see other approaches


}
