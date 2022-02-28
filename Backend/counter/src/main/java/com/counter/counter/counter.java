package com.counter.counter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class counter {
    private int Counter = 0;

    @GetMapping("incrementCount")
    public int incrementAndGet(){
        return Counter++;
    }
}
