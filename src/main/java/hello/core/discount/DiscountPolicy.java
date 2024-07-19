package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    //return이 할인대상금액이다.

    int discount(Member member, int price);
}
