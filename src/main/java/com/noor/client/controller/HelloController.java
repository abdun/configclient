package com.noor.client.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@PropertySource("classpath:global.properties")
@RefreshScope
@RestController
public class HelloController {
    //@Autowired
    //private Environment env;

    @Value("${client.message}")
    private String msg;

    @GetMapping("/hello")
    public ResponseEntity<String> getHello(Model model) {
        return new ResponseEntity<String>( msg, HttpStatus.OK);
    }
}