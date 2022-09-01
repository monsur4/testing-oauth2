package com.mon.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class MainController {
    private final Logger logger = Logger.getLogger(MainController.class.getSimpleName());

    @GetMapping("/")
    public String main(OAuth2AuthenticationToken token){
        logger.info(token.toString());
        return "main.html";
    }
}
