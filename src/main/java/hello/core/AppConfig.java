package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 애플리케이션 설정 정보
  */
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepsitory());
    }

    @Bean
    public MemoryMemberRepository memberRepsitory() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepsitory(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        // 정액할인
//        return new FixDiscountPolicy();
        // 정률할인
        return new RateDiscountPolicy();
    }
}
