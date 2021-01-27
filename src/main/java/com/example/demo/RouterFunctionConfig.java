package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RouterFunction;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.servlet.function.RouterFunctions.route;


/**
 * Handles requests for the application home page.
 */
@RestController
@CrossOrigin(origins = "*")
public class RouterFunctionConfig {
    /*
    @Bean
    public RouterFunction<?> index() {
        return route(GET("/hello"),
                request -> ok().body(just("Hello World!!"), String.class))
    }*/
    @GetMapping("/hello")
    public Map<?, ?> hello(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        System.out.println("React Boot connect Success");
        return map;
    }


}