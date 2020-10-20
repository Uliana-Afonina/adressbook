package addressbookwebtests.tests;

import addressbookwebtests.appmanager.ApplicationManager;
import org.junit.Before;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() {
        app.init();

    }





}
