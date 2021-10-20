package com.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Course {
	
	@Id
	public long id;
	public String title;
	public String discription;
	public Course() {
		super();
		
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", discription=" + discription + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Course(long id, String title, String discription) {
		super();
		this.id = id;
		this.title = title;
		this.discription = discription;
	}

}
