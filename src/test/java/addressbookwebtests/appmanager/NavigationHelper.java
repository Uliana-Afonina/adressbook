package addressbookwebtests.appmanager;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase{

    public void gotoGroupPage() {
        click(By.linkText("groups"));
    }

    public void gotoContactPage() {
        click(By.linkText("add new"));
    }
}
