package com.cognizant.jwt_authentication_service.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("START - authenticate()");


        String user = getUser(authHeader);

        LOGGER.debug("Username: {}", user);

        Map<String, String> map = new HashMap<>();
        map.put("token", "");

        LOGGER.info("END - authenticate()");

        return map;
    }


    private String getUser(String authHeader) {


        String base64Credentials = authHeader.substring("Basic".length()).trim();


        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);


        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);


        String[] values = credentials.split(":", 2);


        return values[0];
    }
}