package supertest.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Browsers.CHROME;

public class ApplicationManager {
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
 //   private GroupHelper groupHelper = new GroupHelper();

    public void init() {
        Configuration.startMaximized = true;
        Configuration.browser = CHROME;
        Selenide.clearBrowserCookies();
        Selenide.open("http://localhost/addressbook/");
        groupHelper = new GroupHelper();
        navigationHelper = new NavigationHelper();
        sessionHelper = new SessionHelper();
        sessionHelper.login("admin", "secret");
    }



    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
