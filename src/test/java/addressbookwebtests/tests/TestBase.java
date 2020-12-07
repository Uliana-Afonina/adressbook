package addressbookwebtests.tests;

import addressbookwebtests.appmanager.ApplicationManager;
import addressbookwebtests.model.GroupData;
import org.junit.Before;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeSuite
    public void setUp() {
        app.init();

    }


}
