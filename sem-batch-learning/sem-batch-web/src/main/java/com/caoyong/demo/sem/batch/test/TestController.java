package com.caoyong.demo.sem.batch.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String testController() {
        return "Hello World";
    }
}
