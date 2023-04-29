package v2;

public class Main {

    public static void main(String[] args) {
        Barista barista = new Barista();

        Customer customer = new Customer();
        customer.order("에스프레소", barista);
        customer.order("딸기 스무디", barista);
    }
}
