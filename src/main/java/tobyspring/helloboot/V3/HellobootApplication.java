package tobyspring.helloboot.V3;

import org.springframework.boot.SpringApplication;
import tobyspring.helloboot.config.V3.MySpringBootApplication;

//
// 인프라 빈 구성 정보의 분리
//
@MySpringBootApplication
public class HellobootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellobootApplication.class, args);
    }

}
