package v2;

import v2.beverage.Beverage;

public class Barista {

    public Beverage makeBeverage(MenuItem item) {
        Beverage beverage = new Beverage(item.getName(), item.getPrice());
        System.out.print("바리스타 : " + beverage.getName() + " 주문 받았습니다. ");
        System.out.println("가격은 " + beverage.getPrice() + " 입니다.");
        return beverage;
    }
}
