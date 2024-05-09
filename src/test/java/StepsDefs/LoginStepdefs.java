package StepsDefs;

import Codefiles.Logincode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


import java.io.IOException;

import static Codefiles.Logincode.driver;


public class LoginStepdefs {

    Logincode logincode = new Logincode();


    @Given("User opens the website")
    public void user_opens_the_website() throws IOException {

        logincode.OpenBrowser();

    }



}
