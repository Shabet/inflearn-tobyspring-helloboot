package tobyspring.helloboot.V1;

import java.util.Objects;

public class HelloController {
    public String hello(String name) {
//        return "Hello " + name;
        SimpleHelloService helloService = new SimpleHelloService();

        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
