package supertest.appmanager;

import org.openqa.selenium.By;
import supertest.model.GroupData;

import static com.codeborne.selenide.Selenide.$;

public class GroupHelper extends HelperBase {

    public void returnToGroupPage() {
        $(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        click("submit");
    }

    public void fillGroupForm(GroupData groupData) {
        type("group_name", groupData.getName());
        type("group_header", groupData.getHeader());
        type("group_footer", groupData.getFooter());
    }

    public void initGroupCreation() {
        click("new");
    }

    public void deleteSelectedGroups() {
        click("delete");
    }
}
