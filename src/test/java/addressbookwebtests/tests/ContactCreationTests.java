package addressbookwebtests.tests;

import addressbookwebtests.model.ContactData;
import org.junit.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation () {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().createContact();
    }

}
