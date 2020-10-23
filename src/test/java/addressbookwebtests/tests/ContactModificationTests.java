package addressbookwebtests.tests;

import addressbookwebtests.model.ContactData;
import org.junit.Test;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification () {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().fillContactForm(new ContactData("qwe1", "qwe2", "qwe3", "qwe4", "qwe5", "qwe6", "qwe7", "home", "qwe9", "none"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }


}
