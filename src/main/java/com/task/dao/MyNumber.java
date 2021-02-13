package com.task.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_number")
public class MyNumber {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int value;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "MyNumber [id=" + id + ", value=" + value + "]";
	}
	
	
	
	

}
