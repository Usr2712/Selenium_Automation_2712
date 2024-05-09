package StepsDefs;

import Codefiles.Appointmentcode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static Codefiles.Logincode.driver;

public class AppointmentSteps {

    Appointmentcode appointmentcode = new Appointmentcode(driver);

    @And("make appointment")
    public void makeAppointment() {
        appointmentcode.enterdetails();


    }

}
