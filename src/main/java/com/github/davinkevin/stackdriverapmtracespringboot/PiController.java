package com.github.davinkevin.stackdriverapmtracespringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class PiController {
    @GetMapping("pi")
    public Mono<Double> pi(){
        return Mono.just(3.14)
                .delayElement(Duration.ofSeconds(1));
    }
}
