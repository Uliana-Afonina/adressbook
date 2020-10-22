package addressbookwebtests.appmanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.remote.BrowserType;

import static com.codeborne.selenide.Browsers.*;

public class ApplicationManager {
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        switch (browser) {
            case (IE): Configuration.browser = IE; break;
            case (FIREFOX): Configuration.browser = FIREFOX; break;
            case (EDGE): Configuration.browser = EDGE; break;
            default: Configuration.browser = CHROME; break;
        }

        Configuration.startMaximized = true;
        Selenide.clearBrowserCookies();
        Selenide.open("http://localhost/addressbook/");
        groupHelper = new GroupHelper();
        navigationHelper = new NavigationHelper();
        sessionHelper = new SessionHelper();
        contactHelper = new ContactHelper();
        sessionHelper.login("admin", "secret");
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }


}
