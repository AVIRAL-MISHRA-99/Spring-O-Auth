import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hellocontroller {

   @GetMapping("/")
    public String greet(){
      return "Welcome to My World";
    }
    
}
