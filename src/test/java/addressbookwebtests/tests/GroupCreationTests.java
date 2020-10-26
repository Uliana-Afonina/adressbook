package addressbookwebtests.tests;

import org.junit.Assert;
import org.junit.Test;

public class GroupCreationTests extends TestBase {

    @Test

    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGroup();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before +1);
    }
}
