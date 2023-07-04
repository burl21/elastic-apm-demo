package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cburlacu
 */
@RestController
@RequestMapping("demo")
class DemoController {
    record Response(String status){}

    @GetMapping
    Response status() {
        return new Response("OK");
    }

    @GetMapping("/hello")
    String hello() {
        return "Hello World";
    }
}
