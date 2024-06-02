package stepdefs;

import io.cucumber.java.en.And;
import pages.AlertPopUp;

public class AlertStepDefs {

    AlertPopUp alertPopUp = new AlertPopUp();

    @And("pop-up appears and user clicks OK")
    public void acceptTheAlert() {
        alertPopUp.acceptTheAlert();
    }


}