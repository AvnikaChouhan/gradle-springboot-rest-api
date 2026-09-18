package com.springbootGradle.gradle.Restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class controller {
        @GetMapping("/info")
        public String getInfo() {
            return "Hello, this is a REST API!";
        }
    }


