package com.codecool.happyshipping.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagesTest {

    private Packages packages = new Packages();

    @Test
    void getPackages() {
        assertTrue(!packages.getPackages().isEmpty());
    }
}