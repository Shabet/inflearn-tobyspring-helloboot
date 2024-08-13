package tobyspring.helloboot.V6;

import org.springframework.stereotype.Service;

//@MyComponent
@Service
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
