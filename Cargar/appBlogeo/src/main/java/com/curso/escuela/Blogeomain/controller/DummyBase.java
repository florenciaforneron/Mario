package com.curso.escuela.Blogeomain.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class DummyBase {
	
	
	private static HashMap<String, Login> mapeo ;
	private static Login login = new Login("florencia", "123", "adalkm");
	public static String getPass() {
		return pass;
	}


	public static void setPass(String pass) {
		DummyBase.pass = pass;
	}

	private static String pass;

	static {
		/*Login valor1 = new Login("asas","Luis","mdslsa","mamsd");
		 
		HashSet<Login> personas = new HashSet<Login>();
		personas.add(valor1); */
		mapeo=new HashMap<String, Login>();
		mapeo.put(pass, login);
		
	}
	
	
	

	public static HashMap<String, Login> getMapeo() {
		return mapeo;
	}

	
	public static void setMapeo(HashMap<String, Login> mapeo) {
		DummyBase.mapeo = mapeo;
	}

	public static void setMapeo(Login login) {	
		mapeo.put(login.getPass(),login.get	
	}
	

}
