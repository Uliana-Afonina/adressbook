package addressbookwebtests.tests;
import addressbookwebtests.model.ContactData;
import org.junit.Test;

public class ContactModification extends TestBase {

        @Test
        public void testContactModification () {
            app.getNavigationHelper().gotoContactPage();
            app.getContactHelper().fillContactForm(new ContactData("qwe1", "qwe2", "[none]"));
            app.getContactHelper().submitContactCreation();
            app.getContactHelper().returnToHomePage();
        }
    }


