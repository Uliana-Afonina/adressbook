import folderData.TestBase;
import org.junit.Test;

public class GroupDeletionTests extends TestBase {

    @Test

    public void testGroupDeletion() {
        gotoGroupPage();
        deleteSelectedGroups();
        returnToGroupPage();
    }

}
