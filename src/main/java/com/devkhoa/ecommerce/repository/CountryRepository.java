package com.devkhoa.ecommerce.repository;

import com.devkhoa.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface CountryRepository extends JpaRepository<Country, Long> {
}

