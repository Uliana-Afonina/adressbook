package supertest.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SessionHelper extends HelperBase {

    public void login(String username, String password) {
        type("user", username);
        type("pass", password);
        $(By.xpath(".//*[@type='submit']")).click();
    }

}
