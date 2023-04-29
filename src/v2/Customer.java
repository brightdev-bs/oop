package v2;

import v2.beverage.Beverage;

public class Customer {

    public void order(String menuName, Barista barista) {
        MenuItem item = Menu.choose(menuName);
        Beverage coffee = barista.makeBeverage(item);
        System.out.println("손님 : " + coffee.getName() + " 잘 먹겠습니다.");
    }
}
