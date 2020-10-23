package addressbookwebtests.appmanager;

import addressbookwebtests.model.ContactData;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$;

public class ContactHelper extends HelperBase {
    public void submitContactCreation() {
        $(By.xpath(".//*[@name='submit'][2]")).click();
    }

    public void returnToHomePage() {
        if (isElementPresent(By.id("maintable"))) {
            return;}
        $(By.linkText("home page")).click();
    }

    public void fillContactForm(ContactData contactData, boolean creation) {

        type("firstname", contactData.getFirsname());
        type("lastname", contactData.getLastname());

        if (creation) {
            new Select($(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

}
