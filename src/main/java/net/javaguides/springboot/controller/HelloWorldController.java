package net.javaguides.springboot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
       //HTTP GET Request
       //http://localhost:8080/Hello-world
       @GetMapping("/Hello-world") // --> to map HTTP GET request onto specific handler method.
        public String helloWorld(){
            return "Hello World!";
        }

}
