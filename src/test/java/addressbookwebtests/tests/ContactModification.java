package addressbookwebtests.tests;

import addressbookwebtests.model.ContactData;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ContactModification extends TestBase {
    @Ignore
        @Test
        public void testContactModification () {
            app.getNavigationHelper().gotoHomePage();
            int before = app.getContactHelper().getContactCount();
//            app.getContactHelper().modifyContact();
            app.getContactHelper().selectContact();
            app.getContactHelper().editContact();
            app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", null), false);
            app.getContactHelper().submitContactModification();
            app.getContactHelper().returnToHomePage();
            int after = app.getContactHelper().getContactCount();
            Assert.assertEquals(after, before);
        }
    }


