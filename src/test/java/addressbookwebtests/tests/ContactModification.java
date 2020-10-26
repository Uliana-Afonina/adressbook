package addressbookwebtests.tests;

import org.junit.Test;

public class ContactModification extends TestBase {

        @Test
        public void testContactModification () {
            app.getNavigationHelper().gotoHomePage();
            app.getContactHelper().modifyContact();
        }
    }


