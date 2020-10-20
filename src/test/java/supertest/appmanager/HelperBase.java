package supertest.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HelperBase {


    protected void click(By locator) {
        $(locator).click();
    }

//    protected void click1 (By locator) {
//        locator.click();
//    }
    protected void type(String locator, String text) {
        click(By.name(locator));
        $(By.name(locator)).clear();
        $(By.name(locator)).setValue(text);
    }
}
