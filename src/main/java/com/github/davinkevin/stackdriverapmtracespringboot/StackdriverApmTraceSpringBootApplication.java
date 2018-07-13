package com.github.davinkevin.stackdriverapmtracespringboot;

import io.opencensus.exporter.trace.stackdriver.StackdriverTraceConfiguration;
import io.opencensus.exporter.trace.stackdriver.StackdriverTraceExporter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class StackdriverApmTraceSpringBootApplication {

    public static void main(String[] args) throws IOException {

        StackdriverTraceExporter.createAndRegister(
                StackdriverTraceConfiguration.builder().build()
        );

        SpringApplication.run(StackdriverApmTraceSpringBootApplication.class, args);
    }
}
