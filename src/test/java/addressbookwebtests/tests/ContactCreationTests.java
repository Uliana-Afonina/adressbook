package addressbookwebtests.tests;

import addressbookwebtests.model.ContactData;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation () {
        app.getNavigationHelper().gotoContactPage();
        fillContactForm(new ContactData("qwe1", "qwe2", "qwe3", "qwe4", "qwe5", "qwe6", "qwe7", "home", "qwe9"));
        submitContactCreation();
        returnToHomePage();


    }

    private void returnToHomePage() {
        $(By.linkText("home page")).click();
    }

    private void submitContactCreation() {
        $(By.xpath(".//*[@name='submit'][2]")).click();
    }

    private void fillContactForm(ContactData contactData) {
        $(By.name("firstname")).click();
        $(By.name("firstname")).clear();
        $(By.name("firstname")).setValue(contactData.getFirsname());
        $(By.name("middlename")).click();
        $(By.name("middlename")).clear();
        $(By.name("middlename")).setValue(contactData.getMiddlename());
        $(By.name("lastname")).click();
        $(By.name("lastname")).clear();
        $(By.name("lastname")).setValue(contactData.getLastname());
        $(By.name("nickname")).click();
        $(By.name("nickname")).clear();
        $(By.name("nickname")).setValue(contactData.getNickname());
        $(By.name("title")).click();
        $(By.name("title")).clear();
        $(By.name("title")).setValue(contactData.getTitle());
        $(By.name("company")).click();
        $(By.name("company")).clear();
        $(By.name("company")).setValue(contactData.getCompany());
        $(By.name("address")).click();
        $(By.name("address")).clear();
        $(By.name("address")).setValue(contactData.getAddress());
        $(By.name("home")).click();
        $(By.name("home")).clear();
        $(By.name("home")).setValue(contactData.getHome());
        $(By.name("notes")).click();
        $(By.name("notes")).clear();
        $(By.name("notes")).setValue(contactData.getNotes());
    }
}
