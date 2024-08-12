package tobyspring.helloboot.V4;

import java.util.Objects;

public class HelloController {
    private final HelloService helloSerivce;

    public HelloController(HelloService helloSerivce) {
        this.helloSerivce = helloSerivce;
    }

    public String hello(String name) {
        SimpleHelloService helloService = new SimpleHelloService();

        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
