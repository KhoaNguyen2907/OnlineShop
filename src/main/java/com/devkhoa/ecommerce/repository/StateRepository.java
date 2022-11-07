package com.devkhoa.ecommerce.repository;

import com.devkhoa.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin
public interface StateRepository extends JpaRepository<State, Long> {
    List<State> findByCountryCode(String code);
}
