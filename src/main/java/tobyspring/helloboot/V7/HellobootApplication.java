package tobyspring.helloboot.V7;

import org.springframework.boot.SpringApplication;
import tobyspring.helloboot.config.V7.MySpringBootApplication;

//
// 자동 구성 애노테이션 적용 & @Configuration과 proxyBeanMethods
//
@MySpringBootApplication
public class HellobootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellobootApplication.class, args);
    }

}
