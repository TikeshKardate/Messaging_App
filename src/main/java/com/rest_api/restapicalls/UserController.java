package com.rest_api.restapicalls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //Method to return
    @GetMapping ("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

}
