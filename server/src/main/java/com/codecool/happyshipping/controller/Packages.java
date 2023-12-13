package com.codecool.happyshipping.controller;

import com.codecool.happyshipping.model.Package;
import com.codecool.happyshipping.services.PackageService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("packages")
public class Packages {

    private final PackageService packageService;

    public Packages(PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping
    public Collection<Package> getPackages() {
        return this.packageService.getPackages();
    }

    @PostMapping
    public Package postPackages(@RequestBody Package newPackage) {
        return this.packageService.addPackage(newPackage);
    }
}
