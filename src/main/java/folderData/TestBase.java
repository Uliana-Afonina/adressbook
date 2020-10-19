package folderData;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Selenide.$;

public class TestBase {


    @Before
    public void setUp() {
        Configuration.startMaximized = true;
        Configuration.browser = CHROME;
        Selenide.clearBrowserCookies();
        Selenide.open("http://localhost/addressbook/");
        login("admin", "secret");

    }

    protected void returnToGroupPage() {
        $(By.linkText("group page")).click();
    }

    protected void submitGroupCreation() {
        $(By.name("submit")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
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

    protected void initGroupCreation() {
        $(By.name("new")).click();
    }

    protected void gotoGroupPage() {
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

    protected void deleteSelectedGroups() {
        $(By.name("delete")).click();
    }
}
