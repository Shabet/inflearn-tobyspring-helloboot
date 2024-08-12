package tobyspring.helloboot.V2;

import org.springframework.boot.SpringApplication;

//
// 합성 애노테이션 적용
//
@MySpringBootAnnotation
public class HellobootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellobootApplication.class, args);
    }

}
