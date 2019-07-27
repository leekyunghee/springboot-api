package pri.lkh.boot.helloapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description 컴포넌트 구성과 자동 구성
 */
@SpringBootApplication
public class HelloBootApplication {

    /**
     * @title SpringBoot class 작성
     * @descriptio 아래와 같은 클래스를 생성하면 @EnableAutoConfiguration에 의해
     *             Spring MVC 기본 설정을 사용
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloBootApplication.class, args);
    }

}
