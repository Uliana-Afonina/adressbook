package addressbookwebtests.appmanager;

import addressbookwebtests.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;

public class ContactHelper extends HelperBase {
    public void submitContactCreation() {
        $(By.xpath(".//*[@name='submit'][2]")).click();
    }

    public void returnToHomePage() {
        $(By.linkText("home page")).click();
    }

    public void fillContactForm(ContactData contactData) {
        type("firstname", contactData.getFirsname());
        type("lastname", contactData.getLastname());

        if (isElementPresent(By.name("new_group"))) {
            new Select($(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }

    }

}
