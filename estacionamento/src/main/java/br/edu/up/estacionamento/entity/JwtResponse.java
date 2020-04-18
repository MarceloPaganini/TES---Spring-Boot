package br.edu.up.estacionamento.entity;

import java.io.Serializable;

public class JwtResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5057300247093311916L;
	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}

}
