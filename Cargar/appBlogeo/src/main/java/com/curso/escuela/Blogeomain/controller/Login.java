package com.curso.escuela.Blogeomain.controller;



public class Login {

	
	
	private String name;
	private String apellido;
	private String mail;

	public Login(String name, String apellido, String mail) {
		this.name=name;
		this.apellido=apellido;
		this.mail=mail;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
