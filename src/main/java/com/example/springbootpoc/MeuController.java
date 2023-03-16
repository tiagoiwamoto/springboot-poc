package com.example.springbootpoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuController {

    @GetMapping(path = "/teste")
    public String index(){
        return "Hello";
    }
}
