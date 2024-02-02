package com.sdp.artgallery.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producttable")
public class Product 
{
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	  @Column(nullable = false,length = 100)
	  private String category;
	  @Column(nullable = false,length = 100)
	  private String name;
	  @Column(nullable = false,length = 1000)
	  private String description;
	  @Column(nullable = false)
	  private double cost;
	  @Column(length = 200)
	  private String productlink;
	  private Blob productimage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getProductlink() {
		return productlink;
	}
	public void setProductlink(String productlink) {
		this.productlink = productlink;
	}
	public Blob getProductimage() {
		return productimage;
	}
	public void setProductimage(Blob productimage) {
		this.productimage = productimage;
	}
}
