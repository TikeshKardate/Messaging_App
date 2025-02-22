package com.rest_api.restapicalls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //Method to return
    @GetMapping ("/hello")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }

    //Method to return hello from Request Parameter
    //http://localhost:8080/query?name=tikesh
    @GetMapping("/query")
    public String sayHello(@RequestParam(defaultValue = "Tikesh") String name){
        return "Hello "+ name +" " + "from BridgeLabz";
    }


}
