package addressbookwebtests.tests;

import addressbookwebtests.model.GroupData;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTests extends TestBase {

    @Test

    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().initGroupCreation();
        GroupData group = new GroupData("test2", "test2", "test3");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);

//        int max = 0;
//        for (GroupData g : after) {
//            if (g.getId() > max) {
//                max = g.getId();
//            }
//        }
        //создали с помощью среды разработки переменную byId типа "Компаратор"
        //присваиваем переменной конкретное значение (ctrl + space для выпадающего меню)
//        Comparator<? super GroupData> byId = new Comparator<GroupData>() {
//            @Override
//            public int compare(GroupData o1, GroupData o2) {
//               //т.к. сравнивать будем id (целые числа), воспользуемся существующим методом compare
//                return Integer.compare(o1.getId(), o2.getId());
//            }
//        };
        //заменили компаратор на анонимную функцию - лямбда-выражение
//        Comparator<? super GroupData> byId = (o1, o2) -> Integer.compare(o1.getId(), o2.getId());
        //надо поменять настройки проекта, чтоб stream работал
        //список after превращаем в поток, вычисляем максимальный элемент max, передаем туда параметр byId (специально
        //создадим для этого переменную. Потом берем у этого максимального элемента id, используя getId()
        //изменили версию Java на 8-ю (лямбда-выражения)
        //подставили лямбда-выражение в качестве параметра при вызове метода max()

        group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

    }
}
