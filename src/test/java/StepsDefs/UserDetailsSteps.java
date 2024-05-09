package StepsDefs;

import Codefiles.UserCredentials;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static Codefiles.Logincode.driver;

public class UserDetailsSteps {

    UserCredentials userCredentials = new UserCredentials(driver);

    @And("Enter Username and Password")
    public void enterUsernameAndPassword() {
        userCredentials.logintoApplication();
    }
}
