package com.sdp.artgallery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="contacttable")
public class Contact {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	 @Column(nullable=false,length = 50)
	   private String name;
    @Column(nullable = false,unique = true)
    private String username;
    @Column(nullable = false,length=50)
    private String message;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", username=" + username + ", message=" + message + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
