package supertest.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends HelperBase{

    public void gotoGroupPage() {
        $(By.linkText("groups")).click();
    }
}
