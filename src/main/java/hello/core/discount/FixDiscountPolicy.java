package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements  DiscountPolicy{

    private int discountFixAmount = 1000;
    //고정 할인 금액을 할 때이기 때문에 이 1000원이라는 고정할인 금액이 자주 사용될 것이기에 이렇게 변수로 만들어서 사용해 주는 것이다.


    @Override
    public int discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
