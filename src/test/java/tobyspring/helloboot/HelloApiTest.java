package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ObjectAssert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import static org.assertj.core.api.Assertions.assertThat;

//
// 테스트 코드를 이용한 테스트
//
public class HelloApiTest {
    @Test
    void helloApi() {
        // http localhost:8080/hello?name=Spring
        // HTTPie
        TestRestTemplate rest = new TestRestTemplate();

        ResponseEntity<String> res = rest.getForEntity("http://localhost:8080/hello?name={name}", String.class, "Spring");

        // 검증
        // status code 200
        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);

        // header(content-type) text/plain
        assertThat(res.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).startsWith(MediaType.TEXT_PLAIN_VALUE);

        // body Hello Spring
//        assertThat(res.getBody()).isEqualTo("Hello Spring");
        assertThat(res.getBody()).isEqualTo("*Hello Spring*");
    }

    @Test
    void failsHelloApi() {
        TestRestTemplate rest = new TestRestTemplate();

        ResponseEntity<String> res = rest.getForEntity("http://localhost:8080/hello?name=", String.class);

        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
