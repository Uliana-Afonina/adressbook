package supertest.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HelperBase {


    protected void click(String locator) {
        $(By.name(locator)).click();
    }

    protected void type(String locator, String text) {
        click(locator);
        $(By.name(locator)).clear();
        $(By.name(locator)).setValue(text);
    }
}
