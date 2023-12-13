package com.codecool.happyshipping.controller;

import com.codecool.happyshipping.model.Package;
import com.codecool.happyshipping.services.PackageService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PackagesTest {

    private PackageService packageService = mock(PackageService.class);

    private Packages packages = new Packages(packageService);

    @Test
    void getPackages() {
        var testPackage = new Package();
        testPackage.setName("test");
        var testPackages = List.of(testPackage);
        when(packageService.getPackages()).thenReturn(testPackages);
        assertEquals(testPackages, packages.getPackages());
    }
}