package it.com.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @GetMapping("testA")
    public String testA(){
        return  "this is a";
    }

    @GetMapping("testB")
    public String testB(){
        return  "this is b";
    }
}
