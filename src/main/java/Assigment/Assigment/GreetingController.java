package Assigment.Assigment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class GreetingController {



    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name ;
    }


}