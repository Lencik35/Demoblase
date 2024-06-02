package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Alert;


public class AlertPopUp  {

    Alert alert = Selenide.switchTo().alert();

    public void acceptTheAlert(){
        Selenide.sleep(1000);
        alert.accept();
    }

}