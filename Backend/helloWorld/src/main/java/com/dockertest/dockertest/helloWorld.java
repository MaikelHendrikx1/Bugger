package com.dockertest.dockertest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class helloWorld {
    private String message = "Hello world!";

    @GetMapping("helloWorld")
    public String getMessage(){
        return message;
    }

    @PostMapping("changeMessage")
    public void addMsg(@RequestBody String msg){
        message = msg;
    }   
}
