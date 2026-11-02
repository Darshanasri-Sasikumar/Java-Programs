package com.example.darshan;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/hi")
    public String print(){
        return "hellp";
    }
}
