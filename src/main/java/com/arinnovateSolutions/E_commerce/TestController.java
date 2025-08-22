package com.arinnovateSolutions.E_commerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/API/users")
    public String users(){
        return "ok";
    }
}

