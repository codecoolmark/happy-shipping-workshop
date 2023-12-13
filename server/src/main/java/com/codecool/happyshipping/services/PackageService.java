package com.codecool.happyshipping.services;

import com.codecool.happyshipping.model.Package;
import com.codecool.happyshipping.repository.PackageRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PackageService {

    private final PackageRepository packageRepository;

    public PackageService(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    public Collection<Package> getPackages() {
        return this.packageRepository.findAll();
    }

    public Package addPackage(Package newPackage) {
        return this.packageRepository.save(newPackage);
    }
}
