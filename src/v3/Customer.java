package v3;

import v3.beverage.Beverage;

public class Customer {

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void order(String menuName, Barista barista) {
        MenuItem item = Menu.choose(menuName);
        Beverage coffee = barista.makeBeverage(item, this.name);
        System.out.println("손님 : " + coffee.getName() + " 잘 먹겠습니다.");
    }
}
