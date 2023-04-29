package v1;

public class Customer {

    public void order(String menuName, Barista barista) {
        MenuItem item = Menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(item);
        System.out.println("손님 : " + coffee.getName() + " 잘 먹겠습니다.");
    }
}
