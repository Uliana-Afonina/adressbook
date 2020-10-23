package addressbookwebtests.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends HelperBase{

    public void gotoGroupPage() {
        //убеждаемся, что мы на странице создания группы по названию заголовка Groups и кнопки New group
        if (isElementPresent(By.tagName("h1"))
                && $(By.tagName("h1")).getText().equals("Group")
                && isElementPresent(By.name("new"))){
            return;
        }
        click(By.linkText("groups"));
    }

    public void gotoContactPage() {
        if (isElementPresent(By.tagName("h1"))
                && $(By.tagName("h1")).getText().equals("Edit / add address book entry")) {
            return;
        }
        click(By.linkText("add new"));
    }

}
