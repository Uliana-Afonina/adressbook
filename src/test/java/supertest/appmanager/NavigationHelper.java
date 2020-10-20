package supertest.appmanager;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase{

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }
}
