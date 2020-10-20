package addressbookwebtests.tests;

import org.junit.Before;
import addressbookwebtests.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() {
        app.init();

    }

}
