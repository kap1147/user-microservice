package com.theyardapp.www.usermicroservice;

import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping
public class MainRestController {

    @GetMapping("user")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("admin")
    public String helloAdmin() {
        return "Hello Admin";
    }

}
