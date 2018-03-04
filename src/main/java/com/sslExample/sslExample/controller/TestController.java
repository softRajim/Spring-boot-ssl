package com.sslExample.sslExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author rajim on 3/4/18
 */
@RestController
public class TestController {

    @RequestMapping("/secured")
    public String secured(){
        System.out.println("Inside secured()");
        return "Hello user !!! : " + new Date();
    }
}
