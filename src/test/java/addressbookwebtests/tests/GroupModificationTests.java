package addressbookwebtests.tests;

import org.junit.Test;
import addressbookwebtests.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification () {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("testt", null, null));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }

}
