package addressbookwebtests.tests;

import addressbookwebtests.model.GroupData;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class GroupDeletionTests extends TestBase {

    @BeforeMethod
    public  void ensurePreconditions() {
        app.getNavigationHelper().gotoGroupPage();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup();
        }
    }

    @Test

    public void testGroupDeletion() {

        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);

    }

}
