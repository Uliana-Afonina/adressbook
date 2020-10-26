package addressbookwebtests.tests;

import addressbookwebtests.appmanager.ApplicationManager;
import addressbookwebtests.model.GroupData;
import org.junit.Before;
import org.openqa.selenium.remote.BrowserType;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @Before
    public void setUp() {
        app.init();

    }


}
