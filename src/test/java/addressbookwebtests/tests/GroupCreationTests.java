package addressbookwebtests.tests;

import org.junit.Test;
import addressbookwebtests.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test

    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().createGroup();
    }
}
