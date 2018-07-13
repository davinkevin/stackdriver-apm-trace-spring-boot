package com.github.davinkevin.stackdriverapmtracespringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PiController {
    @GetMapping("pi")
    public Double pi() throws InterruptedException {

        Thread.sleep(1000);

        return 3.14;
    }
}
