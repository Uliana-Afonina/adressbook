package addressbookwebtests.tests;

import org.junit.Assert;
import org.junit.Test;

public class GroupDeletionTests extends TestBase {

    @Test

    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup(before-1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before -1);
    }

}
