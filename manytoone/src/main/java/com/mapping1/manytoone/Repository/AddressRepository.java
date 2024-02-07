package com.mapping1.manytoone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mapping1.manytoone.Entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {

    @Query("SELECT a FROM Address a JOIN a.employee e WHERE e.eId=:employeeId")
    List<Address> findAllAddressForEmployee(@Param("employeeId") Long employeeId);
    
}
