package com.shivam.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String city;
  @OneToMany(mappedBy = "address",cascade = CascadeType.ALL)
  @JsonIgnore
  private List<Orders> orders;
  @OneToOne
  @JoinColumn(name="User_id")
  @JsonIgnore
  private User user;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<Orders> getOrders() {
	return orders;
}
public void setOrders(List<Orders> orders) {
	this.orders = orders;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
  
}
