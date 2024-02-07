package com.mapping.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.onetoone.Entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Long> {
    
}
