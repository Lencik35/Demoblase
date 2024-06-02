package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCart {
    private final SelenideElement cartBtn = $(By.xpath("/html/body/nav/div/div/ul/li[4]/a"));
    private final SelenideElement GalaxyPhoneInCart = $(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]"));
    private final SelenideElement placeOrderBtn = $(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
    private final SelenideElement nameFld = $(By.xpath("//*[@id=\"name\"]"));
    private final SelenideElement countryFld = $(By.xpath("//*[@id=\"country\"]"));
    private final SelenideElement cityFld = $(By.xpath("//*[@id=\"city\"]"));
    private final SelenideElement creditCardFld = $(By.xpath("//*[@id=\"card\"]"));
    private final SelenideElement monthFld = $(By.xpath("//*[@id=\"month\"]"));
    private final SelenideElement yearFld = $(By.xpath("//*[@id=\"month\"]"));
    private final SelenideElement purchaseBtn = $(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
    private final SelenideElement confirmationPopup = $(By.xpath("/html/body/div[10]"));
    private final SelenideElement confirmationOkBtn = $(By.xpath("/html/body/div[10]/div[7]/div/button"));
    private final SelenideElement  NokiaPhoneInCart= $(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));


    public void goToCart() {
        cartBtn.should(Condition.clickable).click();
    }
    public void isPhonePresent() {NokiaPhoneInCart.should((Condition.appear));}


    public void placeTheOrder() {
        placeOrderBtn.should(Condition.clickable).click();
    }

    public void inputName(String name){
        nameFld.should(Condition.appear).sendKeys(name);
    }

    public void inputCountry(String country){
        countryFld.should(Condition.appear).sendKeys(country);
    }
    public void inputCity(String city){
        cityFld.should(Condition.appear).sendKeys(city);
    }

    public void inputCreditCard(String cardNumber){
        creditCardFld.should(Condition.appear).sendKeys(cardNumber);
    }
    public void inputMonth(int month){
        monthFld.should(Condition.appear).sendKeys(String.valueOf(month));
    }
    public void inputYear(int year){
        yearFld.should(Condition.appear).sendKeys(String.valueOf(year));
    }

    public void clickOnPurchaseBtn(){
        purchaseBtn.should(Condition.clickable).click();
    }

    public void isConfirmationPresent(){
        confirmationPopup.should(Condition.appear);
    }

    public void clickOnOrderConfirmation(){
        confirmationOkBtn.should(Condition.clickable).click();
    }
}

