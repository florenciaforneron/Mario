package com.curso.escuela.Blogeomain.controller;

import org.springframework.stereotype.Service;

@Service
public class Serviceapp {

	public boolean getAtributs(Login login, Valor valor) {
		boolean result = false;
		if (DummyBase.getMapeo().getOrDefault(valor.getLogin(), "").equals(login.getPass()) {
			result = true;
		}
//		else {
//			DummyBase.setMapeo(login);
//			return false;
//		}
		return result;
	}

	public void agregarUsuario(Login login, Valor valor) {
		DummyBase.setMapeo(login, valor);
	}
	
	public void mostrarUsuario(Login login,Valor valor) {
		DummyBase.getMapeo();
		
	}
	
	

}

