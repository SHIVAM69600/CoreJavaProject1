package com.shivam.interfseservice;

import java.util.List;

import com.shivam.Entity.User;

public interface serviceinterfase {
	public  User saveuser(User user) ;
	public List<User> getAllUser();
}
