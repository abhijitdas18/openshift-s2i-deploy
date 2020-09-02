package com.openshift.s2i.openshifts2ideploy.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MyResource {

    @GetMapping("/hello")
    public String sayHello() {
        return  "Welcome to OpenShift with S2I";
    }
}
