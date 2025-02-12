package com.shivam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException.Forbidden;

import com.shivam.Entity.Address;
import com.shivam.Entity.Orders;
import com.shivam.Entity.User;
import com.shivam.Repository.AddressRepository;
import com.shivam.Repository.OrdersRepository;
import com.shivam.Repository.UserRepository;
import com.shivam.interfseservice.serviceinterfase;

import ch.qos.logback.core.joran.conditional.IfAction;
import jakarta.persistence.criteria.Order;
@Service
public class UserService implements serviceinterfase{
@Autowired
private UserRepository userRepository;
@Autowired
private OrdersRepository ordersRepository;
@Autowired 
AddressRepository addressRepository;
	@Override
	public User saveuser(User user) {
		User us= new User();
		if(user!=null) {
			us.setName(user.getName());
			us.setAge(user.getAge());
		}
	 userRepository.save(us);
		Address ad=new Address();
		if(user.getAddress()!=null) {
			ad.setCity(user.getAddress().getCity());
			
		}
		ad.setUser(us);
		 addressRepository.save(ad);
	  
		 List<Orders>list =new ArrayList<>();
		 for(Orders order:user.getOrders()) {
			 Orders od= new Orders() ;
				if(order !=null){
				od.setProduct(order.getProduct());
				od.setAmount(order.getAmount());
				
				}
				od.setUser(us);
				od.setAddress(ad);
				list.add(od);
				}
		 
		   
		     
	       for(Orders order:list) {
	    	   ordersRepository.save(order);
	       }
	       us.setAddress(ad);  // Set address in User
	       us.setOrders(list);  // Set orders in User
	       userRepository.save(us);  // Save User again with Address and Orders
	return us;
	}
	@Override
	public List<User> getAllUser() {
		 return userRepository.findAll();
		
	}

}

