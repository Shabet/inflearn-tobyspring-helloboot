package tobyspring.helloboot.V4;

import org.springframework.boot.SpringApplication;
import tobyspring.helloboot.config.V4.MySpringBootApplication;

//
// 동적인 자동 구성 정보 등록
//
@MySpringBootApplication
public class HellobootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellobootApplication.class, args);
    }

}
