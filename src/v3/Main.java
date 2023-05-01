package v3;

import v3.membership.Membership;

public class Main {

    public static void main(String[] args) {
        Barista barista = new Barista();
        Membership.joinMembership("VIP고객");

        Customer customer = new Customer("익명고객");
        customer.order("에스프레소", barista);
        customer.order("딸기 스무디", barista);

        Customer VIP = new Customer("VIP고객");
        VIP.order("에스프레소", barista);
        VIP.order("망고 스무디", barista);

    }
}
