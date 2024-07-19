package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        //psvm하고 enter로 이걸 자동완성 시킬 수 있는 것이다.

        MemberService memberService = new MemberServiceImpl();
        //앞에서 member를 관리하는 repository의 구현체를 만들어주는 것이고
        Member member = new Member(1L, "memberA", Grade.VIP);
        //이건 앞에서 만들어준 member 객체를 만들어준 것을 통해서
        memberService.join(member);
        //memberRepository에 구현된 함수를 통해서 join시켜서 포함시키는 것이다.

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName() );


    }
}
