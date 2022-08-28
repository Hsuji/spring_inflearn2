package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 컴포넌트 스캔을 적용한 AppConfig
 * - 애플리케이션 설정 정보
 */
@Configuration
@ComponentScan(
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // ComponentScan에서 수동 등록한 @Configuration 제외(기존예제코드 유지를 위해 추가)
)
public class AutoAppConfig {

}
