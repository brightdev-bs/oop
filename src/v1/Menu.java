package v1;

import java.util.List;

public class Menu {
    private static final List<MenuItem> menuItems = List.of(
            new MenuItem("에스프레소", 1000),
            new MenuItem("아메리카노", 1500),
            new MenuItem("카페라떼", 2000),
            new MenuItem("카푸치노", 2000)
    );

    public static MenuItem choose(String name) {
        for (MenuItem menuItem : menuItems) {
            if(menuItem.getName().equals(name)) {
                return menuItem;
            }
        }
        throw new IllegalArgumentException("메뉴를 찾을 수 없습니다.");
    }
}
