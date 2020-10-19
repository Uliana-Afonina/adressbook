import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GroupUtil {

    public static String url = "http://localhost/addressbook/group.php";
    SelenideElement user = $(By.name("user"));
    SelenideElement password = $(By.name("pass"));
    SelenideElement buttonLogIn = $(By.xpath(".//*[@type='submit']"));


}
