import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {
    @Value("${app.hello}")
    private String msg;

    @RequestMapping("/")
    String home() {
        return "Hello " + msg + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}


