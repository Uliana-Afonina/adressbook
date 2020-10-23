package addressbookwebtests.appmanager;

import org.openqa.selenium.By;
import addressbookwebtests.model.GroupData;

import static com.codeborne.selenide.Selenide.$;

public class GroupHelper extends HelperBase {

    public void returnToGroupPage() {
        $(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type("group_name", groupData.getName());
        type("group_header", groupData.getHeader());
        type("group_footer", groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup() {
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();

    }
}
