package org.chakriya.spring_security.ccontroller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/default")
    public String home(){
        return "hello world";
    }

    @GetMapping("/user")
    public String User(){
        return "hello user";
    }

    @GetMapping("/admin")
    public String Admin(){
        return "hello the Admin";
    }


}
