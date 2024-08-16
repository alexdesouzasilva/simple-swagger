package br.com.bradesco.simple_swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bradesco.simple_swagger.service.SimpleSwaggerService;

@RestController
@RequestMapping(value = "/api")
public class SimpleSwaggerController {

    @Autowired
    private SimpleSwaggerService service;

    @GetMapping(value = "/hello")
    public String helloSwagger() {
        return service.hello();
    }
    
}
