package addressbookwebtests.tests;
import addressbookwebtests.model.ContactData;
import org.junit.Test;

public class ContactModification extends TestBase {
//отличается от примера из видео-лекций, поскольку в файле с базой данных какие-то проблемы
        @Test
        public void testContactModification () {
            app.getNavigationHelper().gotoContactPage();
            //true в конце потому, что форма модицикации контакта не отличается от формы создания контакта
            app.getContactHelper().fillContactForm(new ContactData("test_name", "test_surname", "[none]"), true);
            app.getContactHelper().submitContactCreation();
            app.getContactHelper().returnToHomePage();
        }
    }


