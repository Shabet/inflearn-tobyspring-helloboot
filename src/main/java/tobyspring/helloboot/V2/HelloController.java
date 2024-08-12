package tobyspring.helloboot.V2;

import java.util.Objects;

public class HelloController {
    public String hello(String name) {
        return "Hello " + name;
    }
}
