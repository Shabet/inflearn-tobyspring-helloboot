package tobyspring.helloboot.V6;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RequestMapping("/hello")
@RestController
//@MyComponent
//public class HelloController implements ApplicationContextAware {
public class HelloController{
    private final HelloService helloService;
    private ApplicationContext applicationContext;

    public HelloController(HelloService helloService, ApplicationContext applicationContext) {
        this.helloService = helloService;
        this.applicationContext = applicationContext;

        System.out.println(applicationContext);
    }

    @GetMapping("/hello")
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
    // ref) https://velog.io/@ghwns9991/%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8-3.2-%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98-%EC%9D%B4%EB%A6%84-%EC%9D%B8%EC%8B%9D-%EB%AC%B8%EC%A0%9C
    public String hello(@RequestParam("name") String name) {
        if (name == null || name.trim().length() == 0) throw new IllegalArgumentException();

        return helloService.sayHello(name);
//        return helloService.sayHello(Objects.requireNonNull(name));
    }

/*    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
        this.applicationContext = applicationContext;
    }*/
}
