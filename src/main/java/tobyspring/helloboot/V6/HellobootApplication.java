package tobyspring.helloboot.V6;

import org.springframework.boot.SpringApplication;
import tobyspring.helloboot.config.V6.MySpringBootApplication;

//
// 자동 구성 정보 파일 분리
//
@MySpringBootApplication
public class HellobootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellobootApplication.class, args);
    }

}
