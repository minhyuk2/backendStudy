package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    //인터페이스의 객체를 만들어주는 것을 뭐라고 하는거지?
    //왜 이렇게 코드를 작성하는걸까??


    @Override
    public void join(Member member) {
        //이렇게 되면 다형성에 의해서 MemoryMemberRepository에 연결되어서 사용할 수 있게 되는 것이다.
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
