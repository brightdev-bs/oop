package v1;

public class Main {

    public static void main(String[] args) {
        Barista barista = new Barista();

        Customer customer = new Customer();
        customer.order("에스프레소", barista);
    }
}
