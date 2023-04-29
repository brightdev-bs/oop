package v1;

public class Barista {

    public Coffee makeCoffee(MenuItem item) {
        Coffee coffee = new Coffee(item.getName(), item.getPrice());
        System.out.print("바리스타 : " + coffee.getName() + " 주문 받았습니다. ");
        System.out.println("가격은 " + coffee.getPrice() + " 입니다.");
        return coffee;
    }
}
