package com.funinpay.membership.adapter.in.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterMembershipController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Hello";
    }
}
