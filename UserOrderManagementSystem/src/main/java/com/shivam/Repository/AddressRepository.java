package com.shivam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.Entity.Address;

public interface AddressRepository  extends JpaRepository<Address, Integer>{

}
