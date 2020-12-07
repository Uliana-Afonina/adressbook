package addressbookwebtests.appmanager;

import addressbookwebtests.model.ContactData;
import addressbookwebtests.model.GroupData;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ContactHelper extends HelperBase {
    public void submitContactCreation() {
        $(By.xpath(".//*[@name='submit'][2]")).click();
    }

    public void submitContactModification() {
        $(By.xpath(".//*[@name='update'][2]")).click();
    }

    public void returnToHomePage() {
//        if (isElementPresent(By.id("maintable"))) {
//            return;
//        }
        $(By.linkText("home page")).click();
    }

    public void createContact() {
        fillContactForm(new ContactData("qwe1", "qwe2", "test1"), true);
        submitContactCreation();
    }

    public void modifyContact() {
        selectContact();
        editContact();
        fillContactForm(new ContactData("test_name", "test_surname", null), false);
        submitContactModification();
        returnToHomePage();
    }

    public void selectContact() {
        $(By.id("2")).click();
    }

    public void editContact() {
        $(By.xpath(".//*[@href='edit.php?id=1']")).click();
    }

    public void fillContactForm(ContactData contactData, boolean creation) {

        type("firstname", contactData.getFirsname());
        type("lastname", contactData.getLastname());

        if (creation) {
            new Select($(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertTrue(isElementPresent(By.name("new_group")));
        }

    }

    public int getContactCount() {
        return $$x(".//*[@name='selected[]']").size();
      }

//    public List<ContactData> getConactList() {
//        List<ContactData> contacts = new ArrayList<ContactData>();
//        ElementsCollection elements = $$x(".//*[@name='entry']");
//        for (SelenideElement element : elements) {
//            String name = element.getText();
//            int id = Integer.parseInt(element.$(By.tagName("input")).getAttribute("value"));
//            ContactData contact = new ContactData(id, name, null);
//            contacts.add(contact);
//        }
//        return contacts;
//    }


}
