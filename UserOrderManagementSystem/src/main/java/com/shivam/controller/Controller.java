package com.shivam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.Entity.User;
import com.shivam.Repository.UserRepository;
import com.shivam.interfseservice.serviceinterfase;



@RestController
@RequestMapping("/map")
public class Controller {
  
@Autowired
private serviceinterfase si;
@PostMapping("/save")
public String saveAllUSer(@RequestBody User user) {
	User us=si.saveuser(user);
	return "succes";
	}
@GetMapping("/GET")
public List<User> getAllUser(){
	List<User>us=si.getAllUser();
	return us;
}
}
