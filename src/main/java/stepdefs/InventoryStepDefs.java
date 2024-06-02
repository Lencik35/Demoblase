package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.InventoryPage;

public class InventoryStepDefs {

    InventoryPage inventoryPage = new InventoryPage();

    @When("user selects the phone")
    public void selectPhone() {
        inventoryPage.selectPhone();
    }

    @And("adds phone to the cart")
    public void addPhoneToTheCart() {
        inventoryPage.AddPhoneToTheCart();
    }


}
