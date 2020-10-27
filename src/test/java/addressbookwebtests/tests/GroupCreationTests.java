package addressbookwebtests.tests;

import addressbookwebtests.model.GroupData;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test

    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().createGroup();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() +1);
    }
}
