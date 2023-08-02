package com.example.SpringSecurityJPA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String Home (){
        return ("<h1>Usopp</h1>");
    }
    @GetMapping("/user")
    public String user (){
        return ("<h1>user</h1>");
    }
    @GetMapping("/admin")
    public String admin (){
        return ("<h1>admin</h1>");
    }
}
