package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ShoppingCart;

public class CartStepDefs {
    ShoppingCart shoppingCart = new ShoppingCart();

    @And("user open the shopping cart")
    public void goToCart() {
        shoppingCart.goToCart();
    }

    @And("phone is present in shopping cart")
    public void isPhonePresent() {
        shoppingCart.isPhonePresent();
    }

    @And("user places the order")
    public void placeTheOrder() {
        shoppingCart.placeTheOrder();
    }

    @And ("inputs the name {string}")
    public void inputName(String name){
        shoppingCart.inputName(name);
    }

    @And ("inputs the {string} country")
    public void inputCountry (String country){
        shoppingCart.inputCountry(country);
    }

    @And ("inputs the {string} city")
    public void inputCity (String city){
        shoppingCart.inputCity(city);
    }
    @And ("inputs the {string} credit card")
    public void inputCreditCard (String creditCard){
        shoppingCart.inputCreditCard(creditCard);
    }
    @And ("inputs the {int} month")
    public void inputMonth(int month){
        shoppingCart.inputMonth(month);
    }
    @And ("inputs the {int} year")
    public void inputYear(int year){
        shoppingCart.inputYear(year);
    }

    @And ("clicks on purchase")
    public void clickOnPurchaseBtn(){
        shoppingCart.clickOnPurchaseBtn();
    }
    @Then ("confirmation pup-up appears")
    public void isConfirmationPresent(){
        shoppingCart.isConfirmationPresent();
    }
    @And ("user click OK")
    public void clickOnOrderConfirmation(){
        shoppingCart.clickOnOrderConfirmation();
    }

}

