package v3;

import v3.beverage.Beverage;
import v3.membership.Membership;
import v3.membership.VIPMember;

import java.util.Map;

public class Barista {

    public Beverage makeBeverage(MenuItem item, String memberName) {
        Beverage beverage = new Beverage(item.getName(), item.getPrice());
        System.out.print("바리스타 : " + beverage.getName() + " 주문 받았습니다. ");

        Map<String, VIPMember> members = Membership.getMembers();
        if(members.containsKey(memberName))
            System.out.println("VIP 회원으로 가격은 10%할인 된" + (int)(item.getPrice() * 0.9) + " 입니다.");
        else
            System.out.println("가격은 " + beverage.getPrice() + " 입니다.");
        return beverage;
    }
}
