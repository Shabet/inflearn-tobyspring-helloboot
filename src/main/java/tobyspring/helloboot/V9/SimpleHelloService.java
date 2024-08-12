package tobyspring.helloboot.V9;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@MyComponent
@Service
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
