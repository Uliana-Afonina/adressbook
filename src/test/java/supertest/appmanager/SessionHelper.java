package supertest.appmanager;

import org.openqa.selenium.By;

public class SessionHelper extends HelperBase {

    public void login(String username, String password) {
        type("user", username);
        type("pass", password);
        click(By.xpath(".//*[@type='submit']"));
    }

}
