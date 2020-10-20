package addressbookwebtests.appmanager;

import addressbookwebtests.model.ContactData;
import org.openqa.selenium.By;

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
        type("middlename", contactData.getMiddlename());
        type("lastname", contactData.getLastname());
        type("nickname", contactData.getNickname());
        type("title", contactData.getTitle());
        type("company", contactData.getCompany());
        type("address", contactData.getAddress());
        type("home", contactData.getHome());
        type("notes", contactData.getNotes());
    }
}
