package com.curso.escuela.Blogeomain.controller;

import java.util.HashSet;

public class Valor {

	
	private String name1;
	private String apellido;
	private String mail1;
	
	
	public Valor(String name, String apellido, String mail) {
		this.name1=name;
		this.apellido=apellido;
		this.mail1=mail;
	}
	
	
	Valor valor1 = new Valor("Pepe","Roldan", "pepe@gmail");
	
	
	
	HashSet<Valor> valores = new HashSet<Valor>();
	valores.add(valor1);
	

	public String getName() {
		return name1;
	}


	public void setName(String name) {
		this.name1 = name;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getMail() {
		return mail1;
	}


	public void setMail(String mail) {
		this.mail1 = mail;
	}
	
	
}
