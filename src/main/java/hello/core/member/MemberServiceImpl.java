package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("memberService2")
@Component
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    // ac.getBean(MemberRepository.class)와 동일한 동작한다고 생각
    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 스프링 빈 싱글톤 테스트용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
