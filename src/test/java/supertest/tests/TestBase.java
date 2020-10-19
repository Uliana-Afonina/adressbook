package supertest.tests;

import org.junit.Before;
import supertest.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @Before
    public void setUp() {
        app.init();

    }

}
