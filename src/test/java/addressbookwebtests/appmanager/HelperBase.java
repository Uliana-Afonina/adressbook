package addressbookwebtests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class HelperBase {


    protected void click(By locator) {
        $(locator).click();
    }

    protected void type(String locator, String text) {
        click(By.name(locator));
        if (text != null) {
            String existingText = $(By.name(locator)).getAttribute("value ");
            if (!text.equals(existingText)) {
            $(By.name(locator)).clear();
            $(By.name(locator)).setValue(text);}
        }
    }

    public boolean isAlertPresent () {
        try {
            switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected boolean isElementPresent(By locator) {
        try {
        $(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
