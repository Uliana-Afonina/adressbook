package addressbookwebtests.tests;

import addressbookwebtests.model.ContactData;
import addressbookwebtests.model.GroupData;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.disabled;

public class ContactCreationTests extends TestBase {
    @Ignore
    @Test
    public void testContactCreation () {
        app.getNavigationHelper().gotoHomePage();
        int before = app.getContactHelper().getContactCount();
        System.out.println(before);
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().createContact();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        System.out.println(after);
        Assert.assertEquals(after, before+1);
    }

}
