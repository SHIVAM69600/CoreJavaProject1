package com.shivam.Entity;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String product;
  private float amount;
  @ManyToOne
  @JoinColumn(name="User_id")
  @JsonIgnore
  private User user;
  @ManyToOne
  @JoinColumn(name="Address_id")
  @JsonIgnore
  private Address address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
  
}
