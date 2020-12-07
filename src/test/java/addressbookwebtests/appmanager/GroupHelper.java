package addressbookwebtests.appmanager;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import addressbookwebtests.model.GroupData;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

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
//        selectGroup ();
        click(By.name("delete"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void selectGroup(int index) {
        $$(By.name("selected[]")).get(index).click();
        //       $(By.name("selected[]")).click();
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

    public void modifyGroup(int index, GroupData group) {
        selectGroup(index);
        initGroupModification();
        fillGroupForm(group);
        submitGroupModification();
        returnToGroupPage();
    }


    public int getGroupCount() {
        return $$(By.name("selected[]")).size();
    }

    public List<GroupData> getGroupList() {
        List<GroupData> groups = new ArrayList<GroupData>();
        ElementsCollection  elements = $$x(".//*[@class='group']");
        for (SelenideElement element : elements) {
            String name = element.getText();
            int id = Integer.parseInt(element.$(By.tagName("input")).getAttribute("value"));
            GroupData group = new GroupData(id, name, null, null);
            groups.add(group);
        }
        return groups;
    }

    public boolean isThereAGroup() {
        if ($(By.name("selected[]")).exists()) {
            return true;
        } else {
            return false;
        }
    }


}