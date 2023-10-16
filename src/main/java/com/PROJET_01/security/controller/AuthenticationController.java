package com.PROJET_01.security.controller;


import com.PROJET_01.security.authentication.AuthenticationRequest;
import com.PROJET_01.security.authentication.AuthenticationResponse;
import com.PROJET_01.security.authentication.AuthenticationService;
import com.PROJET_01.security.authentication.RegisterRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthenticationController {

private final AuthenticationService authService;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody AuthenticationRequest authenticationRequest){
        return ResponseEntity.ok(authService.login(authenticationRequest));
    }

    @GetMapping("/test")
    public String test(){
        return "hello from test from spring";
    }

    @PostMapping(value = "/test2",
            produces= MediaType.ALL_VALUE,
            consumes =  MediaType.ALL_VALUE
    )
    public String test2(
            @RequestParam int id,
            @RequestParam String title,
            @RequestParam String category,
            @RequestParam String price,
            @RequestParam String description

            ){

        log.info(title);
        log.info(category);
        log.info(price);
        log.info(description);

        return "hello from test2 from spring";
    }
}
