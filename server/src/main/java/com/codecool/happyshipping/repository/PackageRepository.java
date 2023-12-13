package com.codecool.happyshipping.repository;

import com.codecool.happyshipping.model.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<Package, Long> {

}
