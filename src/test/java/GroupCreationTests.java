import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import folderData.GroupData;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.$;

public class GroupCreationTests {

    @Before
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.browser = CHROME;
        Selenide.clearBrowserCookies();
        Selenide.open(GroupUtil.url);
        login("admin", "secret");

    }


    @Test

    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation();
        returnToGroupPage();


    }

    private void returnToGroupPage() {
        $(By.linkText("group page")).click();
    }

    private void submitGroupCreation() {
        $(By.name("submit")).click();
    }

    private void fillGroupForm(GroupData groupData) {
        $(By.name("group_name")).click();
        $(By.name("group_name")).clear();
        $(By.name("group_name")).setValue(groupData.getName());
        $(By.name("group_header")).click();
        $(By.name("group_header")).clear();
        $(By.name("group_header")).setValue(groupData.getHeader());
        $(By.name("group_footer")).click();
        $(By.name("group_footer")).clear();
        $(By.name("group_footer")).setValue(groupData.getFooter());
    }

    private void initGroupCreation() {
        $(By.name("new")).click();
    }

    private void gotoGroupPage() {
        $(By.linkText("groups")).click();
    }

    private void login(String username, String password) {
        $(By.name("user")).click();
        $(By.name("user")).clear();
        $(By.name("user")).setValue(username);
        $(By.name("pass")).click();
        $(By.name("pass")).clear();
        $(By.name("pass")).setValue(password);
        $(By.xpath(".//*[@type='submit']")).click();
    }


}
