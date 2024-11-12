package com.example.exerciseintroduction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class solution {


    @GetMapping("/name")
    public String name(){
        return "My name is Aishtiaq";
    }

    @GetMapping("/age")
    public String age(){
        return "My age is 22";
    }



    @GetMapping("/check/status")
    public String checkStatus() {
        return "Everything OK";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Server health is up and running";
    }




    @GetMapping("/names")
    public List<String> getNames() {
        return Arrays.asList("Ahmed", "Aishtiaq", "Mona");
    }

}
