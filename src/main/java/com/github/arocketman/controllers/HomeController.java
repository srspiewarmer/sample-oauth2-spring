package com.github.arocketman.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @Autowired
    private DefaultTokenServices defaultTokenServices;

    @GetMapping(value = "/hello")
    public String index(){
        return "Hello world";
    }

    @GetMapping(value = "/out")
    public String logout(@RequestParam("access_token") String value) {
        defaultTokenServices.revokeToken(value);
        return "LOGGED OUT!!";
    }

}
