package hello.core.singleton;

/**
 * 싱글톤 패턴 구현
 */
public class SingletonService {

    // 1. static 영역에 객체를 딱 1개만 생성해둔다.
    // 클래스 레벨에 올라가기 때문에 하나만 존재 -> 자기 내부에 private static으로 선언
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서 객체 인스턴스가 필요하면 이 statice 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {
    }

    // 테스트용 로직 -> 비즈니스에 따라 변경
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
