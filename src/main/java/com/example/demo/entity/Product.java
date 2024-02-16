package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT-TBL")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;
    
    
    
	public Product(int id, String name, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
}
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "PRODCT_TBL")//we can give table name by using class name 
//public class Product {
//    @Id       
//    @GeneratedValue
//	private int id;
//	private String name;
//	private int quantity;
//	private double price;
//	
//	public Integer getId() {
//		return null;
//	}
//	
//	public Object getName() {
//		return null;
//	}
//	
//	public void setName(Object name2) {
//		
//	}
//	
//	public void setQuantity(Object quantity2) {
//		
//		}
//	
//	public Object getQuantity() {
//		return null;
//	}
//	
//	
//	public void setPrice(Object price2) {
//	  }
//	public Object getPrice() {
//		return null;
//	}
//	
//	
//}
