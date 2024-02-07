package com.mapping.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mapping.onetoone.Entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    
}
