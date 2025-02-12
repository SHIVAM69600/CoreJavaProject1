package com.shivam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.Entity.Orders;

public interface OrdersRepository  extends  JpaRepository<Orders, Integer>{

}
