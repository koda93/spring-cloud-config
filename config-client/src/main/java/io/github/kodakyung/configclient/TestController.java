package io.github.kodakyung.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${example.phase}")
    private String config;

    @GetMapping
    public String test(){
        return config;
    }
}
