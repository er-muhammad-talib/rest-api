package com.usermanagement.model;

public class User {

	private int id;
	private String name;
	private String email;
	private String addres;
	private String contact;

	public User(int id, String name, String email, String addres, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addres = addres;
		this.contact = contact;
	}
	

	public User(String name, String email, String addres, String contact) {
		super();
		this.name = name;
		this.email = email;
		this.addres = addres;
		this.contact = contact;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
