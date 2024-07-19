package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {


    @Test
    void join(){


        MemberService memberService = new MemberServiceImpl();
        //given
            Member member = new Member(1L,"memberA",Grade.VIP);
        //when
            memberService.join(member);
        Member findmember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findmember);
        //findMember롤 찾은 것이 처음에 만들어줬던 member객체인 member랑 같은지 확인해주는 것이다.



    }
}
