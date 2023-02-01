import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

    @GetMapping("/first-endpoint")
    public String firstEndpoint() {
        return "Hello, This is your first api response. Keep it up!";
    }
}