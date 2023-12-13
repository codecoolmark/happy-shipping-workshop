package com.codecool.happyshipping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("packages")
public class Packages {

    @GetMapping
    public Collection<String> getPackages() {
        return List.of("First package", "Second Package", "Third Package");
    }
}
