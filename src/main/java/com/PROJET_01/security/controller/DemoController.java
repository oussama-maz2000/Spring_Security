package com.PROJET_01.security.controller;

import com.PROJET_01.security.authentication.AuthenticationResponse;
import com.PROJET_01.security.authentication.AuthenticationService;
import com.PROJET_01.security.authentication.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/v1/demo")
@RequiredArgsConstructor
public class DemoController {


    @PostMapping("/test")
    public ResponseEntity<String> register() {
        return ResponseEntity.ok("hello world from demo controller");
    }
}